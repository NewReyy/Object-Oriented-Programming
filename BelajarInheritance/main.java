/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BelajarInheritance;

/**
 *
 * @author ACER
 */
public class main {
    public static void main(String[] args){
        ProgramAritmatika PA = new ProgramAritmatika();
        
        Penjumlahan jumlah = new Penjumlahan();
        jumlah.bilA=2;
        jumlah.bilB=4;
        
        Pengurangan kurang = new Pengurangan();
        kurang.bilC=7;
        kurang.bilD=3;
        
        Perkalian kali = new Perkalian();
        kali.bilE=7;
        kali.bilF=1;
        
        Pembagian bagi = new Pembagian();
        bagi.bilG=10;
        bagi.bilH=2;
        
        PA.hasil();
        jumlah.hasil();
        kurang.hasil();
        kali.hasil();
        bagi.hasil();
    }
}
