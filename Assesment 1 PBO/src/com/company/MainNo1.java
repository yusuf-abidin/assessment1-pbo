package com.company;

public class MainNo1 {

    public static void main(String[] args) {

//      Transaksi Asuransi dan Dropship
        System.out.println("Asuransi dan Dropship");
        Transaksi t1 = new Transaksi(1, "N0001", "JNE", 21000, "Eiger", "Bandung Kopo", "Dropship1", "Surabaya", "Bejo", "Dayeuhkolot", 400000, "ya");
        t1.displayData();

//      Tansaksi Asuransi
        System.out.println("Asuransi");
        Transaksi t2 = new Transaksi(2, "N0003", "J&T", 16000, "Eiger", "Bandung Kopo", "Tini", "Dayeuhkolot", 40000);
        t2.displayData();

//      Transaksi Normal
        System.out.println("Normal");
        Transaksi t3 = new Transaksi(3, "N0004", "Pos Indonesia", 23000, "Eiger", "Bandung Kopo", "Bambang", "Dayeuhkolot");
        t3.displayData();

//      Transaksi Dropship
        System.out.println("Dropship");
        Transaksi t4 = new Transaksi(4, "N0002", "siCepat", 24000, "Eiger", "Bandung Kopo", "Dropship2", "Pontianak", "Joko", "Dayeuhkolot", "ya");
        t4.displayData();

    }
}