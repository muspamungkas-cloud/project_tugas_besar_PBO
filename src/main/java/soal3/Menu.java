/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private double harga;
    private String kategori;

    // 1. Constructor tanpa parameter (Default)
    public Menu() {
        this.kodeMenu = "-";
        this.namaMenu = "-";
        this.harga = 0.0;
        this.kategori = "-";
    }

    // 2. Constructor dengan parameter (Overloading)
    public Menu(String kodeMenu, String namaMenu, double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    // Method non-void dengan parameter input jumlah pesanan
    public double hitungHarga(int jumlah) {
        return this.harga * jumlah;
    }

    // Method tampil menu
    public void tampilMenu() {
        System.out.println("Kode   : " + kodeMenu);
        System.out.println("Nama   : " + namaMenu);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga  : Rp " + harga);
    }
}