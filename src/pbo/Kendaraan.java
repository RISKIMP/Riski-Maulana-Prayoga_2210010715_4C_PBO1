/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

public class Kendaraan {
    //Atribut yang dienkapsulasi
    private String merk;
    private int tahun;
    
    //konstruktor
    public Kendaraan (String merk, int tahun ) {
        this.merk =merk;
        this.tahun = tahun;
    }
    
    //metode getter dan setter
    public String GetMerk() {
        return merk;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public int getTahun() {
        return tahun;
    }
    
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    //Metode yang akan dioveride oleh subclass
    public void displayinfo() {
        System.out.println("merk: " + ", Tahun; " + tahun);
    }
}
