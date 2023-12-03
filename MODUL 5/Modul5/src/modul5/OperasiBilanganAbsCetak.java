package modul5;
final class OperasiBilanganAbsCetak {
    private static void run(OperasiBilanganAbs[]OBA, double a, double b){
        OBA[0] = new OperasiPenjumlahan();
        OBA[1] = new OperasiPengurangan();
        OBA[2] = new OperasiPerkalian();
        OBA[3] = new OperasiPembagian();
        
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("x Nama :  Nuri Hidayatuloh     x");
        System.out.println("x NIM  :  210441100100         x");
        System.out.println("x Kelas:  PBO A                x");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("x Bilangan A\t: " + a + "\t       x");
        System.out.println("x Bilangan B\t: " + b + "\t       x");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
        for (int i = 0; i < OBA.length; i++) {
            OBA[i].set_A(a);
            OBA[i].set_B(b);
            OBA[i].set_C();
            OBA[i].tampil();
        }
    }
    public static void main(String[]args){
        OperasiBilanganAbs[] OBA = new OperasiBilanganAbs[4];
        run(OBA, 6.5, 0.5);
    }
}
