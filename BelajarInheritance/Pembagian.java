/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BelajarInheritance;

/**
 *
 * @author ACER
 */
public class Pembagian extends ProgramAritmatika{
    float bilG;
    float bilH;
    
    @Override
    float hasil(){
        float hasil=bilG / bilH;
        System.out.println("Hasil pembagian bil G dan bil H : " +hasil);
        return hasil;
    }
}
