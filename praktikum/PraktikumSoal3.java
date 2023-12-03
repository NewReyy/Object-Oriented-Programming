/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;
import java.util.Scanner;
/**
 *
 * @author Nuri Hidayatuloh
 */
public class PraktikumSoal3 {
    long nim;
    String nama, prodi, alamat, fakultas;
    Scanner input = new Scanner(System.in);
    Scanner input1 = new Scanner(System.in);
    void biodata() {
      System.out.print("Nama                  : ");
      nama=input.nextLine();
      System.out.print("Nim                   : ");
      nim=input1.nextLong();
      System.out.print("Fakultas              : ");
      fakultas=input.nextLine();
      System.out.print("Program Studi         : ");
      prodi=input.nextLine();
      System.out.print("Alamat                : ");
      alamat=input.nextLine();
    }

    void hasil(){
        System.out.println("\n\nNama                  : "+nama);
        System.out.println("Nim                   : "+nim);
        System.out.println("Fakultas              : "+fakultas);
        System.out.println("Program Studi         : "+prodi);
        System.out.println("Alamat                : "+alamat);
    }
    public static void main(String [] args){
        PraktikumSoal3 mahasiswa = new PraktikumSoal3();
        
        mahasiswa.biodata();
        mahasiswa.hasil();
    }
}
