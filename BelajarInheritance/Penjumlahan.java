/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BelajarInheritance;

/**
 *
 * @author ACER
 */
public class Penjumlahan extends ProgramAritmatika{
    float bilA;
    float bilB;
    
    
    @Override
    float hasil(){
        float hasil=bilA + bilB;
        System.out.println("Hasil penjumlahan bil A dan bil B : " +hasil);
        return hasil;
    }
}
