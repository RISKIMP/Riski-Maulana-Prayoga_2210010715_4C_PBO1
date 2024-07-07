/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author Puji Astuti
 */
public class MainKendaraan {
   public static void main(String[] args) {
        Kendaraan kendaraan1 = new Mobil("Toyota", 2020, 4);
        Kendaraan kendaraan2 = new Motor("Yamaha", 2019, true);

        // Polymorphism
        kendaraan1.displayinfo();
        System.out.println();
        kendaraan2.displayinfo();
   }
}
