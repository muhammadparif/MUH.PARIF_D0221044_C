package com.tutorial;


public class barang { // nama class
    int stock, terjual, id, harga;
    String nama_barang ; 

    public barang (int id, String nama_barang, int stock, int terjual, int harga){ // konstruktor
        this.id = id;
        this.nama_barang = nama_barang;
        this.stock = stock;
        this.terjual = terjual;
        this.harga = harga;
    }
}
