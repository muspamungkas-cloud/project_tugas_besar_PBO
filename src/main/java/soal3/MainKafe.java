/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

public class MainKafe {
    public static void main(String[] args) {
        // Menggunakan constructor dengan parameter
        Menu menu1 = new Menu("M01", "Nasi Goreng", 18000, "Makanan");
        
        int jumlahPesanan = 2; // Parameter input jumlah pesanan
        
        System.out.println("=== STRUK PEMESANAN KAFE ===");
        menu1.tampilMenu();
        System.out.println("Jumlah : " + jumlahPesanan);
        System.out.println("Total  : Rp " + menu1.hitungHarga(jumlahPesanan));
        System.out.println("-----------------------------------");
    }
}