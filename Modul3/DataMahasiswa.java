/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul3;
import java.util.Scanner;
/**
 *
 * @author Nuri Hidayatuloh
 */
public class DataMahasiswa extends DataUniversitas{
    static String Alamat;
    static String Jurusan;
    
    public static String getAlamat(){
        return Alamat;
    }
    
    public static void setAlamat(String Alamat){
        DataMahasiswa.Alamat = Alamat;
    }
    
    public static String getJurusan(){  
        Scanner input = new Scanner(System.in);
        switch (Jurusan){
            case "61":
                System.out.println("|==========================|");
                System.out.println("|      DATA MAHASISWA      |");
                System.out.println("|==========================|\n");
                System.out.println("UNIVERSITAS : " + getUniversitas());
                System.out.println("NIM         : " + DataUniversitas.getNim());
                System.out.println("NAMA        : " + DataUniversitas.getNama());
                System.out.println("ALAMAT      : " + getAlamat());
                System.out.println("JURUSAN     : MATEMATIKA");
                break;
            case "62":
                System.out.println("|==========================|");
                System.out.println("|      DATA MAHASISWA      |");
                System.out.println("|==========================|\n");
                System.out.println("UNIVERSITAS : " + getUniversitas());
                System.out.println("NIM         : " + DataUniversitas.getNim());
                System.out.println("NAMA        : " + DataUniversitas.getNama());
                System.out.println("ALAMAT      : " + getAlamat());
                System.out.println("JURUSAN     : BIOLOGI");
                break;
            case "63":
                System.out.println("|==========================|");
                System.out.println("|      DATA MAHASISWA      |");
                System.out.println("|==========================|\n");
                System.out.println("UNIVERSITAS : " + getUniversitas());
                System.out.println("NIM         : " + DataUniversitas.getNim());
                System.out.println("NAMA        : " + DataUniversitas.getNama());
                System.out.println("ALAMAT      : " + getAlamat());
                System.out.println("JURUSAN     : KIMIA");
                break;
            case "64":
                System.out.println("|==========================|");
                System.out.println("|      DATA MAHASISWA      |");
                System.out.println("|==========================|\n");
                System.out.println("UNIVERSITAS : " + getUniversitas());
                System.out.println("NIM         : " + DataUniversitas.getNim());
                System.out.println("NAMA        : " + DataUniversitas.getNama());
                System.out.println("ALAMAT      : " + getAlamat());
                System.out.println("JURUSAN     : FISIKA");
                break;
            case "65":
                System.out.println("|==========================|");
                System.out.println("|      DATA MAHASISWA      |");
                System.out.println("|==========================|\n");
                System.out.println("UNIVERSITAS : " + getUniversitas());
                System.out.println("NIM         : " + DataUniversitas.getNim());
                System.out.println("NAMA        : " + DataUniversitas.getNama());
                System.out.println("ALAMAT      : " + getAlamat());
                System.out.println("JURUSAN     : TEKNIK INFORMATIKA");
                break;
            case "66":
                System.out.println("|==========================|");
                System.out.println("|      DATA MAHASISWA      |");
                System.out.println("|==========================|\n");
                System.out.println("UNIVERSITAS : " + getUniversitas());
                System.out.println("NIM         : " + DataUniversitas.getNim());
                System.out.println("NAMA        : " + DataUniversitas.getNama());
                System.out.println("ALAMAT      : " + getAlamat());
                System.out.println("JURUSAN     : SISTEM INFORMASI");
                break;
            default :
                System.out.println("KODE JURUSAN TIDAK VALID");
                System.out.print("MASUKAN KODE JURUSAN ANDA LAGI : "); Jurusan = input.nextLine();
                getJurusan();
                
        }
        return Jurusan;
    }
    
    public static void setJurusan(String Jurusan){
        DataMahasiswa.Jurusan = Jurusan;
    }
}
