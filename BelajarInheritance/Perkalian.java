/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BelajarInheritance;

/**
 *
 * @author ACER
 */
public class Perkalian extends ProgramAritmatika{
    float bilE;
    float bilF;
    
    @Override
    float hasil(){
        float hasil=bilE * bilF;
        System.out.println("Hasil perkalian bil E dan bil F : " +hasil);
        return hasil;
    }
}
