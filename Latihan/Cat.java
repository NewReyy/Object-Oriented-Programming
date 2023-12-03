/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author ACER
 */
public class Cat extends LivingThing implements Mamalia{

    public void name(){
        System.out.println("Kucing");
    }
    
    @Override
    public void walk() {
        System.out.println("Kucing Berjalan menggunakan 4 kaki");
    }

    @Override
    public void characteristic() {
        System.out.println("Kucing Melahirkan");
    }
    
}
