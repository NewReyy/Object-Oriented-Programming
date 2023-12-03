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
public class main {
    public static void main(String[] args) {
       InformasiVCD info = new InformasiVCD();

       
       Scanner input = new Scanner(System.in);
       String pilihan = "1";
       
       while (pilihan=="1"){
            info.tampil();
            
            System.out.print("\nMengulang lagi? [y/t]: ");
            pilihan = input.nextLine();
                if (pilihan.startsWith("y")){
                    pilihan="1";
                    System.out.println("\n\n\n");
                }
                else{
                    System.out.println("\n========================================");    
                    System.out.println("Terimakasih Telah Menggunakan Rental VCD");    
                    System.out.println("========================================");    
                     }
                
       }            
    }
}
