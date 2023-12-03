/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODUL6;

/**
 *
 * @author Nuri Hidayatuloh
 */
public final class KomputerCetak {
    public static void main(String []args){
    Komputer [] komp = new Komputer[3];

        komp[0] = new PC();
        komp[1] = new Laptop();
        komp[2] = new Netbook();

        for (int i =0; i<komp.length; i++) {
        komp[i].hidupkan_os();
        komp[i].matikan_os();
        komp[i].klik_kanan();
        komp[i].klik_kiri();
        komp[i].tekan_enter();
        komp[i].cetak_data();
        }
    }
}