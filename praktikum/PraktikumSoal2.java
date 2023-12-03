/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author Nuri Hidayatuloh
 */
class Manusia{
    String nama, asal;
    int umur;
    
    void berjalandanberlari(){
        System.out.println("Berjalan dan Berlari");
    }
}

public class PraktikumSoal2{
    public static void main(String[] args) {
       Manusia a = new Manusia();
       Manusia b = a;
       a.berjalandanberlari();
    }
}
