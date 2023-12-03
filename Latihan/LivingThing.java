/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author ACER
 */
public abstract class LivingThing {
    public void breath(){
        System.out.println("Makhluk hidup pasti bernafas...");
    }
    public void makan(){
        System.out.println("Makhluk hidup pasti Makan...");
    }
    public abstract void walk();
}
