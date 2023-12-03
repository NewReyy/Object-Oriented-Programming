/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author ACER
 */
public class Human extends LivingThing implements Mamalia, Minds{

    
    public void name(){
        System.out.println("Manusia");
    }
    
    @Override
    public void walk() {
        System.out.println("Manusia Berjalan");
    }

    @Override
    public void characteristic() {
        System.out.println("Omnivora");
    }

    @Override
    public void mind() {
        System.out.println("Toxic people");
    }
    
}
