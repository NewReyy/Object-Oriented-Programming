/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

import java.util.Scanner;

/**
 *
 * @author Nuri Hidayatuloh
 */
public class InformasiVCD {
    Scanner masukan = new Scanner (System.in);
    Scanner masukan1 = new Scanner (System.in);
    int pilih;
    
    void tampil(){
    System.out.println("==========================");
    System.out.println("         WELLCOME         ");
    System.out.println("            TO            ");
    System.out.println("       VCD RENTALLER      ");
    System.out.println("==========================");
    
    VCD Informasi = new VCD();
    System.out.print ("Masukkan Judul Film     : ");
    Informasi.judul = masukan.nextLine();
    
    System.out.print ("Masukkan Aktor Film     : ")   ;    
    Informasi.aktor = masukan.nextLine();
    
    System.out.print ("Masukkan Sutradara Film : ")  ;
    Informasi.sutradara = masukan.nextLine();
    
    System.out.print ("Masukkan Publiser Film  : ");  
    Informasi.publisher = masukan.nextLine();
              
    System.out.println ("=========KATEGORI=========");
    System.out.println ("1. Semua Umur ");
    System.out.println ("2. Dewasa ");
    System.out.println ("3. Remaja ");
    System.out.println ("4. Anak-anak");
    System.out.println ("5. ??");
    System.out.print ("Masukkan pilihan [1-5] : ");
    
    String choose = "y";
    int pilihan ;
    do{
              pilihan = masukan1.nextInt();
              if (pilihan == 1){
                  Informasi.kategori = "Semua Umur";
                  choose = "y";
              }
              else if (pilihan == 2){
                  Informasi.kategori = "Dewasa";
                  choose = "y";
              }
              else if (pilihan == 3){
                  Informasi.kategori = "Remaja";
                  choose = "y";
              }
              else if (pilihan == 4){
                  Informasi.kategori = "Anak-Anak";
                  choose = "y";
              }
              else if (pilihan == 5){
                  Informasi.kategori = "Tidak di ketahui";
                  choose = "y";
              }
              else {
                  System.out.println("Pilihan tidak ada, mohon masukan dengan benar !!! ");
                  System.out.print ("Masukkan pilihan [1-5] : ");
                  choose = "t";
              }
    }
    while (choose != "y");
    
    System.out.print("Masukan Stok Film : ");
    Informasi.stok=masukan1.nextInt();
    
    Informasi.Informasi();

    }
}
