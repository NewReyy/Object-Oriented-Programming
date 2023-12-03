package modul4;
/**
 *
 * @author Nuri Hidayatuloh
 */
public class OperasiBilanganCetak {
    private static void Munculkan(OperasiBilangan[]OB, double a, double b){
        OB[0] = new OperasiPenjumlahan();
        OB[1] = new OperasiPengurangan();
        OB[2] = new OperasiPerkalian();
        OB[3] = new OperasiPembagian();
        
        for (int c = 0; c < OB .length; c++){
            OB[c].set_A(a);
            OB[c].set_B(b);
            OB[c].set_C();
            OB[c].tampil();
    }
}   
public static void main(String[]args){
    OperasiBilangan[] arrl = new OperasiBilangan[4];
    Munculkan(arrl, 10.5, 0.5);
    }
}