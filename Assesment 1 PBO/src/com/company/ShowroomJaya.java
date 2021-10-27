package com.company;

import  java.util.Scanner;
import java.util.ArrayList;

public class ShowroomJaya {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Mobil> arrMobil = new ArrayList<>();

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Jual Mobil");
            System.out.println("3. Lihat Stok");
            System.out.println("0. Keluar\n");

            System.out.print("Pilih Menu : ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (pilihan){
                case 0:
                    System.out.println("Aplikasi Berhenti");
                    break;
                case 1:
                    tambahMobil();
                    break;
                case 2:
                    beliMobil();
                    break;
                case 3:
                    viewStok();
                    break;
                default:
                    System.out.println("Pilih menu yang sesuai!\n");
                    break;
            }

        }while (pilihan != 0);

    }

    private static void tambahMobil(){
        System.out.println("Showroom Mobil Jaya - Tambah Mobil");

        System.out.print("Merk : ");
        String merk = scanner.nextLine();

        System.out.print("Harga : ");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Tahun Keluaran : ");
        String tahunKeluaran = scanner.nextLine();

        System.out.print("Jumlah Stok : ");
        int jumlahStok = scanner.nextInt();

        Mobil m = cariMobil(merk, tahunKeluaran);

        if (m == null){
            Mobil mobil = new Mobil(merk, tahunKeluaran, harga, jumlahStok);
            arrMobil.add(mobil);
            System.out.println("Mobil ditambahkan\n");
        }else {
            System.out.println("Mobil sudah ada\n");

        }

    }

    private static void beliMobil(){
        System.out.println("Showroom Mobil Jaya - Penjualan");

        System.out.print("Merk : ");
        String merk = scanner.nextLine();

        System.out.print("Tahun Keluaran : ");
        String tahunKeluaran = scanner.nextLine();

        System.out.print("Jumlah : ");
        int jumlah = scanner.nextInt();

        Mobil m = cariMobil(merk, tahunKeluaran);

        System.out.println();
        if (m == null){
            System.out.println("Mobil tidak ditemukan\n");
        }else if (m.getStok() < jumlah) {
            System.out.println("Maaf, Jumlah Stok Tidak Mencukupi\n");
        }else {

            System.out.println("Merk : " + m.getMerk());
            System.out.printf("Harga Satuan : %.2f\n", m.getHarga());
            System.out.println("Tahun Keluaran : " + m.getTahunKeluaran());
            System.out.println("Jumlah Beli : " + jumlah);

            double harga = m.getHarga() * jumlah;
            System.out.printf("Total harga : %.2f\n" , harga );

            if (jumlah == 1){
                System.out.println("Diskon : 0.0 persen");
                System.out.println("Total Diskon : 0.00");
                System.out.printf("Total Bayar : %.2f\n" , harga);
                System.out.println();
            }else  if (jumlah == 2){
                System.out.println("Diskon : 10.0 persen");
                System.out.printf("Total diskon : %.2f\n" , (harga * 10/100));
                System.out.printf("Total Bayar : %.2f\n" , (harga - (harga * 10/100)));
                System.out.println();

            }else{
                System.out.println("Diskon : 20.0 persen");
                System.out.printf("Total Diskon : %.2f\n" , (harga * 20/100));
                System.out.printf("Total Bayar : %.2f\n" , (harga - (harga * 20/100)));
                System.out.println();

            }

//            Update stok
            m.setStok(m.getStok()-jumlah);

//            Hapus mobil jika stoknya 0
            if (m.getStok()== 0){
                arrMobil.removeIf(mobil -> mobil.getMerk().equalsIgnoreCase(merk));
            }
        }
    }

    private static void viewStok(){
        if (arrMobil.size()==0){
            System.out.println("Tidak ada mobil tersedia\n");
        }else{
            for(Mobil m : arrMobil) {
                m.displayInfo();
                System.out.println();
            }
        }
    }

    private static Mobil cariMobil(String merk, String tahunKeluaran){
        Mobil mobil = null;
        for (Mobil m : arrMobil){
            if (m.getMerk().equalsIgnoreCase(merk) && m.getTahunKeluaran().equalsIgnoreCase(tahunKeluaran)){
                mobil = m;
            }
        }
        return mobil;
    }
}
