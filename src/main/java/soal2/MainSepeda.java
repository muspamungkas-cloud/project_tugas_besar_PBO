/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

public class MainSepeda {
    public static void main(String[] args) {
        // Instansiasi minimal 2 object sepeda
        Sepeda sepeda1 = new Sepeda("SPD01", "Sepeda Gunung (MTB)", 3, 15000);
        Sepeda sepeda2 = new Sepeda("SPD02", "Sepeda Kota (City Bike)", 2, 10000);

        System.out.println("=== KALKULATOR BIAYA RENTAL SEPEDA ===");
        sepeda1.tampilData();
        sepeda2.tampilData();
    }
}