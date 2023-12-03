/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum;
import java.util.Scanner;

/**
 *
 * @author Nuri Hidayatuloh
 */
public class PraktikumSoal1 {

    /** 
     * @param args the command line arguments
     */
    String nama,nim, fakultas, prodi, alamat;
    void biodata() {
      System.out.println("Nama                  : "+nama); 
      System.out.println("NIM                   : "+nim);
      System.out.println("Fakultas              : "+fakultas);
      System.out.println("Prodi                 : "+prodi);
      System.out.println("Alamat                : "+alamat);
    }
    
    public static void main(String [] args) {
        PraktikumSoal1 mahasiswa = new PraktikumSoal1();
        Scanner pilih = new Scanner(System.in);
        System.out.println("");
        mahasiswa.nama = "Nuri Hidayatuloh";
        mahasiswa.nim = "210441100100";
        mahasiswa.fakultas = "Teknik";
        mahasiswa.prodi = "Sistem Informasi";
        mahasiswa.alamat = "Ponorogo";
        mahasiswa.biodata();
    }    
}
