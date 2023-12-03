/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul3;

/**
 *
 * @author Nuri HIdayatuloh
 */
public class DataUniversitas {
    static String Universitas;
    static String NIM;
    static String Nama;
    
    public static String getUniversitas(){
        return Universitas;
    }
    
    public static void setUniversitas(String Universitas){
        DataUniversitas.Universitas = Universitas;
    }
    
    public static String getNim(){
        return NIM;
    }
    
    public static void setNIM(String NIM){
        DataUniversitas.NIM = NIM;
    }
    
    public static String getNama(){
        return Nama;
    }
    
    public static void setNama(String Nama){
        DataUniversitas.Nama = Nama;
    }
}
