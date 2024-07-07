/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author Puji Astuti
 */
public class Mobil extends Kendaraan {
     private int jumlahPintu;

    public Mobil(String merk, int tahun, int jumlahPintu) {
        super(merk, tahun);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
    
}
