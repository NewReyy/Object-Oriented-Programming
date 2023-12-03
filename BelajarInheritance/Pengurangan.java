/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BelajarInheritance;

/**
 *
 * @author ACER
 */
public class Pengurangan extends ProgramAritmatika {
    float bilC;
    float bilD;
    
    @Override
    float hasil(){
        float hasil=bilC - bilD;
        System.out.println("Hasil pengurangan bil C dan bil D : " +hasil);
        return hasil;
    }
}
