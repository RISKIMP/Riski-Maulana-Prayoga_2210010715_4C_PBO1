/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author Puji Astuti
 */
public class Motor extends Kendaraan{
    private boolean memilikiGigi;
    
    public Motor(String merk, int tahun, boolean memilikiGigi) {
        super (merk, tahun);
        this.memilikiGigi =  memilikiGigi;
    }
    
    public boolean isMemilikiGigi() {
        return memilikiGigi;
    }
    
    public void setMemilikiGigi(boolean memilikiGigi) {
        this.memilikiGigi = memilikiGigi;
    }
    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Memiliki Gigi: " + (memilikiGigi ? "Ya" : "Tidak"));
    }
}
