/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODUL6;

/**
 *
 * @author Nuri HIdayatuloh
 */
public class Laptop extends Komputer implements Mouse, Keyboard, Printer{

    @Override
    void hidupkan_os() {
        System.out.println("::::::LAPTOP::::::");
        System.out.println("Hidupkan Laptop");
    }

    @Override
    void matikan_os() {
        System.out.println("Matikan Laptop");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Klik Kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Klik Kiri");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Tekan Enter");
    }

    @Override
    public void cetak_data() {
        System.out.println("Cetak Data");
    }
    
}
