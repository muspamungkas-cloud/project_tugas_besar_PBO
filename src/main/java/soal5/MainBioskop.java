/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal5;

import java.util.ArrayList;

public class MainBioskop {
    public static void main(String[] args) {
        // Wajib memakai ArrayList
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        // Menambahkan data pesanan tiket
        daftarTiket.add(new Tiket("TKT-01", "Avengers: Endgame", "REGULER", 45000, 2));
        daftarTiket.add(new Tiket("TKT-02", "Interstellar", "IMAX", 75000, 1));

        System.out.println("=== STRUK CETAK PEMESANAN TIKET BIOSKOP ===");
        
        // Iterasi menggunakan perulangan for-each
        for (Tiket t : daftarTiket) {
            t.tampilStruk();
        }
    }
}