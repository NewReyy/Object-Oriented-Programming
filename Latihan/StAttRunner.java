/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author ACER
 */
//class StAtt{
//    static String att;
//    private String name;
//    
//    StAtt(String name){
//        this.name=name;
//    }
//}
//
//public class StAttRunner {
//    public static void main(String[] args) {
//        StAtt s1 = new StAtt("name1");
//        StAtt s2 = new StAtt("name2");
//        
//        s1.att = "one";
//        s2.att = "two";
//        StAtt.att = "three";
//        
//        System.out.println(s1.att+"-"+s2.att+"-"+StAtt.att);
//    }
//}

//class StMeth{
//    private static int count = 0;
//    private String name;
//    
//    StMeth(String name){
//        this.name = name;
//    }
//    
//    static void increase(){
//        StMeth.count++;
//    }
//    
//    static int getCount(){
//        return StMeth.count;
//    }
//}
class StErr{
    private String name;
    
    static String getName(){
        return this.name;
    }
    
    StErr(String name){
        this.name = name;
    }
}

public class StAttRunner{
    public static void main(String[] args) {
//        StMeth s1 = new StMeth("name1");
//        StMeth s2 = new StMeth("name2");
//        
//        s1.increase();
//        s2.increase();
//        StMeth.increase();
//        
//        System.out.println(
//                s1.getCount() + "-" + 
//                s2.getCount() + "-" +
//                StMeth.getCount());
          StErr s1 = new StErr("name1");
    }
}
