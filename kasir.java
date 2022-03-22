package com.tutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class kasir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Deklarasi ArrayList Bertipe Object
        ArrayList<barang> dataBarang = new ArrayList<>();
        // Deklarasi file
        String fileKu = "C:\\Users\\ACER\\Desktop\\java_dasar\\syntax\\src\\com\\tutorial\\Data_transaksi\\data_barang.txt";
        String transaksi = "C:\\Users\\ACER\\Desktop\\java_dasar\\syntax\\src\\com\\tutorial\\Data_transaksi\\penjualan.txt";

        int id = -1; // untuk id barang
        int i = -1; // untuk membaca setiap index pada arraylist

        // perulangan
        while (true) {
            // tampilan menu
            System.out.println();
            System.out.println();
            System.out.println("|=================================|");
            System.out.println("|>>>>>>>>>>MENU KASIR<<<<<<<<<<<<<|");
            System.out.println("|=================================|");
            System.out.println("| [1] TAMBAH DATA BARANG          |");
            System.out.println("| [2] REMOVE DATA BARANG          |");
            System.out.println("| [3] VIEW DATA BARANG            |");
            System.out.println("| [4] PENJUALAN                   |");
            System.out.println("| [5] EXIT                        |");
            System.out.println("==================================");
            System.out.print("PILIH MENU : ");
            int menu = sc.nextInt();
            if (menu == 1) {
                System.out.println("===================================");
                System.out.println("[1] TAMBAH BARANG ");
                System.out.println("[2] TAMBAH STOK BARANG ");
                System.out.println("===================================");
                System.out.print("PILIH SALAH SATU MENU DIATAS : ");
                int pilih = sc.nextInt();
                if (pilih == 1) {
                    id++;
                    i++;
                    System.out.println("ANDA MEMILIH TAMBAH BARANG");
                    System.out.print("NAMA BARANG :");
                    sc.nextLine();
                    String nama_barang = sc.nextLine();

                    System.out.print("STOCK       :");
                    int stock = sc.nextInt();

                    System.out.print("HARGA       :");
                    int harga = sc.nextInt();
                    int terjual = 0;

                    dataBarang.add(new barang(id, nama_barang, stock, terjual, harga));
                    try {
                        FileWriter fileWriter = new FileWriter(fileKu, true);
                        fileWriter.append("|" + dataBarang.get(i).id + "\t|" + dataBarang.get(i).nama_barang + "\t\t\t|"
                                + dataBarang.get(i).stock + "\t\t |" + dataBarang.get(i).harga + "\t\t|"
                                + dataBarang.get(i).terjual + "\t |\n");
                        fileWriter.close();
                    } catch (IOException e) {
                        System.out.println("TERJADI KESALAHAN KARENA : " + e.getMessage());
                    }
                } else if (pilih == 2) {
                    int index = -1;
                    boolean ditemukan = false;
                    System.out.print("PILIH ID UNTUK MENAMBAHKAN STOCK BARANG : ");
                    int kodeBarang = sc.nextInt();
                    for (int j = 0; j < dataBarang.size(); j++) {
                        if (dataBarang.get(j).id == kodeBarang) {
                            index = j;
                            ditemukan = true;
                        }
                    }
                    if (ditemukan == true) {
                        System.out.print("JUMLAH PENAMBAHKAN STOCK       : ");
                        int tambahStock = sc.nextInt();
                        barang updateStock = dataBarang.get(kodeBarang);
                        updateStock.stock = dataBarang.get(kodeBarang).stock + tambahStock;
                        System.out.println("PENAMBAHAN STOK BARANG BERHASIL");
                        try {
                            FileWriter fileWriter = new FileWriter(fileKu, false);
                            for (barang barangku : dataBarang) {
                                fileWriter.append(
                                        "|" + barangku.id + "\t|" + barangku.nama_barang + "\t\t\t|" + barangku.stock
                                                + "\t\t |" + barangku.harga + "\t\t|" + barangku.terjual + "\n");
                            }
                            fileWriter.close();
                        } catch (IOException e) {
                            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                        }
                    } else {
                        System.out.println("==============================================");
                        System.out.println("ID YANG ANDA MASUKAN TIDAK ADA");
                    }
                }
            } else if (menu == 2) {
                int index = -1;
                boolean ditemukan = false;
                System.out.print("HAPUS BARANG DENGAN ID : ");
                int hapus = sc.nextInt();

                for (int j = 0; j < dataBarang.size(); j++) {
                    if (dataBarang.get(j).id == hapus) {
                        index = j;
                        ditemukan = true;
                    }
                }
                if (ditemukan == true) {
                    dataBarang.remove(hapus);
                    System.out.println("DATA BARANG BERHASIL DI HAPUS");
                    try {
                        FileWriter fileWriter = new FileWriter(fileKu, false);
                        for (barang barangku : dataBarang) {
                            fileWriter.append(
                                    "|" + barangku.id + "\t|" + barangku.nama_barang + "\t\t\t|" + barangku.stock
                                            + "\t\t |" + barangku.harga + "\t\t|" + barangku.terjual + "\n");
                        }
                        fileWriter.close();
                    } catch (IOException e) {
                        System.out.println("TERJADI KESALAHAN KARENA: " + e.getMessage());
                    }
                } else {
                    System.out.println("==============================================");
                    System.out.println("ID YANG ANDA MASUKAN TIDAK ADA");
                }
            } else if (menu == 3) {
                System.out.println("|========================================================================|");
                System.out.println("|>>>>>>>>>>>>>>>>>>>>>>>>>>>>>TABEL DATA BARANG<<<<<<<<<<<<<<<<<<<<<<<<<<|");
                System.out.println("|========================================================================|");
                System.out.println("| ID\t" + "| NAMA BARANG\t\t" + "| STOCK\t\t " + "| HARGA \t|" + "TERJUAL" + " |");
                System.out.println("|========================================================================|");
                try {
                    File myFile = new File(fileKu);
                    Scanner fileReader = new Scanner(myFile);

                    // cetak isi file
                    while (fileReader.hasNextLine()) {
                        String data = fileReader.nextLine();
                        System.out.println(data);
                    }
                    System.out.println("|========================================================================|");
                } catch (IOException e) {
                    System.out.println("TERJADI KESALAHAN KARENA: " + e.getMessage());
                }
            } else if (menu == 4) {
                System.out.println("|========================================================================|");
                System.out.println("|>>>>>>>>>>>>>>>>>>>>>>>>>>>>>TABEL DATA BARANG<<<<<<<<<<<<<<<<<<<<<<<<<<|");
                System.out.println("|========================================================================|");
                System.out.println("| ID\t" + "| NAMA BARANG\t\t" + "| STOCK\t\t " + "| HARGA \t|" + "TERJUAL" + " |");
                System.out.println("|========================================================================|");
                try {
                    File myFile = new File(fileKu);
                    Scanner fileReader = new Scanner(myFile);

                    // cetak isi file
                    while (fileReader.hasNextLine()) {
                        String data = fileReader.nextLine();
                        System.out.println(data);
                    }
                    System.out.println("|========================================================================|");
                } catch (IOException e) {
                    System.out.println("TERJADI KESALAHAN KARENA: " + e.getMessage());
                    System.out.println();

                }
                System.out.print("ID BARANG YANG MAU DI BELI  : ");

                int pilihBarang = sc.nextInt();
                int index = -1;
                boolean ditemukan = false;
                for (int j = 0; j < dataBarang.size(); j++) {
                    if (dataBarang.get(j).id == pilihBarang) {
                        index = j;
                        ditemukan = true;
                    }
                }
                if (ditemukan == true) {
                    System.out.println("-------------------------------");
                    System.out.print("JUMLAH BARANG BELANJAAN : ");
                    int jumlahBelanjaan = sc.nextInt();
                    barang updateStock = dataBarang.get(pilihBarang);
                    updateStock.stock = dataBarang.get(pilihBarang).stock - jumlahBelanjaan;
                    updateStock.terjual = dataBarang.get(pilihBarang).terjual + jumlahBelanjaan;
                    try {
                        FileWriter fileWriter = new FileWriter(fileKu, false);
                        for (barang barangku : dataBarang) {
                            fileWriter.append(
                                    "|" + barangku.id + "\t|" + barangku.nama_barang + "\t\t\t|" + barangku.stock
                                            + "\t\t |" + barangku.harga + "\t\t|" + barangku.terjual + "\n");
                        }
                        fileWriter.close();
                    } catch (IOException e) {
                        System.out.println("TERJADI KESALAHAN KARENA: " + e.getMessage());
                    }
                    try {
                        FileWriter fileWriter = new FileWriter(transaksi, true);
                        fileWriter.write("---------------------------------");
                        fileWriter.write("\n        DATA BELANJAAN");
                        fileWriter.write("\n-------------------------------");
                        fileWriter.write("\nID BARANG      : " + pilihBarang);
                        fileWriter.write("\nNAMA BARANG    : " + dataBarang.get(index).nama_barang);
                        fileWriter.write("\nJUMLAH BARANG  : " + jumlahBelanjaan);
                        fileWriter.write("\nHARGA BARANG   : " + dataBarang.get(index).harga);
                        fileWriter.write("\n-------------------------------");
                        fileWriter.write("\nTOTAL          : " + dataBarang.get(index).harga * jumlahBelanjaan);
                        fileWriter.write("\n-------------------------------");
                        fileWriter.close();
                    } catch (IOException e) {
                        System.out.println("TERJADI KESALAHAN KARENA: " + e.getMessage());
                    }
                    try {
                        File myFile = new File(transaksi);
                        Scanner fileReader = new Scanner(myFile);

                        // cetak isi file
                        while (fileReader.hasNextLine()) {
                            String data = fileReader.nextLine();
                            System.out.println(data);
                        }
                    } catch (IOException e) {
                        System.out.println("TERJADI KESALAHAN KARENA: " + e.getMessage());
                    }
                } else {
                    System.out.println("-------------------------------");
                    System.out.println("ID YANG ANDA MASUKAN TIDAK ADA");
                }
            } else if (menu == 5) {
                break;
            } else {
                System.out.println("PILIH MENU SESUAI YANG ADA DI ATAS");
                System.out.println("MUNGKIN ANDA BUTUH AYANG KALI YAH ");
            }
        }
    }
}
