/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

public class Sepeda {
    // Atribut private (Encapsulation)
    private String kodeSepeda;
    private String jenisSepeda;
    private int lamaSewa;
    private double hargaPerJam;

    // Constructor dengan keyword this
    public Sepeda(String kodeSepeda, String jenisSepeda, int lamaSewa, double hargaPerJam) {
        this.kodeSepeda = kodeSepeda;
        this.jenisSepeda = jenisSepeda;
        this.lamaSewa = lamaSewa;
        this.hargaPerJam = hargaPerJam;
    }

    // Method non-void untuk kalkulasi biaya (mengembalikan nilai / return)
    public double hitungBiaya() {
        return lamaSewa * hargaPerJam;
    }

    // Method void untuk menampilkan data
    public void tampilData() {
        System.out.println("Kode Sepeda  : " + kodeSepeda);
        System.out.println("Jenis Sepeda : " + jenisSepeda);
        System.out.println("Lama Sewa    : " + lamaSewa + " Jam");
        System.out.println("Harga / Jam  : Rp " + hargaPerJam);
        System.out.println("Total Biaya  : Rp " + hitungBiaya());
        System.out.println("-----------------------------------");
    }
}