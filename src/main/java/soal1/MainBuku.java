/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

public class MainBuku {
    public static void main(String[] args) {
        // Inisialisasi minimal 2 object buku
        Buku buku1 = new Buku("B001", "Belajar Pemrograman Java", "Budi Raharjo", 75000);
        Buku buku2 = new Buku("B002", "Algoritma dan Struktur Data", "Rinanto", 95000);

        System.out.println("=== DATA INVENTARIS BUKU ===");
        buku1.tampilData();
        buku2.tampilData();
    }
}