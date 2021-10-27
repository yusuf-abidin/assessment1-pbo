package com.company;

public class Transaksi {

    private String namaPenjual;
    private String alamatPenjual;
    private String namaDropshipper;
    private String alamatDropshipper;
    private String namaPembeli;
    private String alamatPembeli;
    private String ekspedisi;
    private String resi;
    private String dropshipper;
    private double ongkir, asuransi;
    private int noTransaksi;

//    Konstruktor Transaksi Normal
    public Transaksi(int noTransaksi, String resi, String ekspedisi, double ongkir, String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli){
        this.noTransaksi = noTransaksi;
        this.resi = resi;
        this.ekspedisi = ekspedisi;
        this.ongkir = ongkir;
        this.namaPenjual=namaPenjual;
        this.alamatPenjual=alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
    }

//    Konstruktor Transaksi Dengan Asuransi
    public Transaksi(int noTransaksi, String resi, String ekspedisi, double ongkir, String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli, double asuransi){
        this.noTransaksi = noTransaksi;
        this.resi = resi;
        this.ekspedisi = ekspedisi;
        this.ongkir = ongkir;
        this.namaPenjual=namaPenjual;
        this.alamatPenjual=alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.asuransi=asuransi;
    }

//    Konstruktor Transaksi Dengan Dropshipper
    public Transaksi(int noTransaksi, String resi, String ekspedisi, double ongkir, String namaPenjual, String alamatPenjual, String namaDropshipper, String alamatDropshipper, String namaPembeli, String alamatPembeli, String dropshipper){
        this.noTransaksi = noTransaksi;
        this.resi = resi;
        this.ekspedisi = ekspedisi;
        this.ongkir = ongkir;
        this.namaPenjual=namaPenjual;
        this.alamatPenjual=alamatPenjual;
        this.namaDropshipper=namaDropshipper;
        this.alamatDropshipper=alamatDropshipper;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.dropshipper=dropshipper;
    }

//    Konstruktor Transaksi Dengan Asuransi & Dropshipper
    public Transaksi(int noTransaksi, String resi, String ekspedisi, double ongkir, String namaPenjual, String alamatPenjual, String namaDropshipper, String alamatDropshipper, String namaPembeli, String alamatPembeli, double asuransi, String dropshipper){
        this.noTransaksi = noTransaksi;
        this.resi = resi;
        this.ekspedisi = ekspedisi;
        this.ongkir = ongkir;
        this.namaPenjual=namaPenjual;
        this.alamatPenjual=alamatPenjual;
        this.namaDropshipper=namaDropshipper;
        this.alamatDropshipper=alamatDropshipper;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.asuransi=asuransi;
        this.dropshipper=dropshipper;
    }


    public void displayData(){

        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("No Resi : " + resi);
        System.out.println("Nama Ekspedisi : " + ekspedisi);
        if ((ongkir > 20000 && asuransi > 0) && dropshipper == null){
            ongkir -=5000;
        }
        System.out.println("Ongkos Kirim : " + ongkir);

        if (namaDropshipper==null){
            System.out.println("Nama Pengirim : " + namaPenjual);
        }else{
            System.out.println("Nama Pengirim : " + namaDropshipper);
        }

        if (alamatDropshipper==null){
            System.out.println("Alamat Pengirim :" + alamatPenjual);
        }else{
            System.out.println("Alamat Pengirim : " +alamatDropshipper);
        }

        System.out.println("Nama Penerima : " + namaPembeli);
        System.out.println("Alamat Penerima : " + alamatPembeli);

        if (asuransi > 0){
            System.out.println("Nominal Asuransi :" + asuransi);
        }

        System.out.println();

    }
}
