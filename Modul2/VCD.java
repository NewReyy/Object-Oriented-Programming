package Modul2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nuri Hidayatuloh
 */
public class VCD {
    String judul,aktor,sutradara,publisher,kategori;
    int stok;
   

    void Informasi (){
        System.out.println("\n===============================");
        System.out.println("   Film yang sedang di putar   ");
        System.out.println("===============================");
        System.out.println("Judul Film     : "+this.judul);
        System.out.println("Aktor Film     : "+this.aktor);
        System.out.println("Sutradara film : "+this.sutradara);
        System.out.println("Publisher film : "+this.publisher);
        System.out.println("Kategori film  : "+this.kategori);
        System.out.println("Stok Film      : "+this.stok);
    }

}
