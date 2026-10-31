/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal4;

import java.util.ArrayList;

public class MainKlinik {
    public static void main(String[] args) {
        // 1. Deklarasi Collection ArrayList
        ArrayList<Pemeriksaan> daftarPemeriksaan = new ArrayList<>();

        // 2. Data Entry: Masukkan minimal 3 object pemeriksaan
        daftarPemeriksaan.add(new Pemeriksaan("P001", "Andi Pratama", "Dr. Sinta, Sp.A", 150000));
        daftarPemeriksaan.add(new Pemeriksaan("P002", "Siti Aminah", "Dr. Budi, Sp.PD", 200000));
        daftarPemeriksaan.add(new Pemeriksaan("P003", "Joko Susilo", "Dr. Rian, Sp.THT", 175000));

        System.out.println("=== DAFTAR ANTREAN PEMERIKSAAN KLINIK ===");
        
        // 3. Iterasi menggunakan For-Each loop
        for (Pemeriksaan p : daftarPemeriksaan) {
            p.tampilData();
        }
    }
}