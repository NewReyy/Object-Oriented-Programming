/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author ACER
 */

class Karyawan {
        private float gajiPokok;
        
        public float getGaji(){
            return gajiPokok;
        }
        
        public Karyawan(float gajiPokok){
            this.gajiPokok = gajiPokok;
        }
        
    }
    
    class Boss extends Karyawan{
        public Boss(float gajiPokok){
            super(gajiPokok);
        }
        
        public float getGaji(){
            return super.getGaji() + (super.getGaji() * 0.1f);
        }
    }

public class main {
    public static void main(String[] args) {
//        Human human = new Human();
//        Cat cat = new Cat();
//        
//        human.name();
//        human.makan();
//        human.breath();
//        human.walk();
//        human.characteristic();
//        human.mind();
//        
//        cat.name();
//        cat.makan();
//        cat.breath();
//        cat.walk();
//        cat.characteristic();
//    }
//    for (int x = 0; x < 10; x++){
//        if (x % 2 == 0){
//            continue;
//        }
//        System.out.println(x);
//        if (x == 5){
//            break;
//        }
//        }
//    if (a > 250){
//        b = a * 0.3f;
//    }else{
//        b = a * 0.25f;
//    }
//    
//    b = a > 250 : (a * 0.35) ? (a * 0.25f);
//   

    
        public static void method1(){
            Karyawan k = new Karyawan(1000);
            System.out.println(k.getGaji() == 1100f);
        }
        public static void method2(){
            Karyawan k = new Boss(1000);
            System.out.println(k.getGaji() == 1100f);
        }
        public static void method3(){
            Karyawan k = new Karyawan(1000);
            Karyawan m = new Boss(1000);
            System.out.println(k.getGaji() + m.getGaji() == 2000f);
        }
        public static void method4(){
            Boss k = new Boss(1000);
            System.out.println(k.getGaji() == 1000f);
        }
    
    }
}
