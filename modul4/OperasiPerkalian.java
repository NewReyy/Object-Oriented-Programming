package modul4;
/**
 *
 * @author Nuri Hidayatuloh
 */
public class OperasiPerkalian extends OperasiBilangan{
    @Override
    protected void set_C(){
        this.c = this.a * this.b;
    }
    @Override
    protected void tampil() {
        System.out.println("---- P E R K A L I A N ----");
        System.out.println("Bil A = " +this.get_A());
        System.out.println("Bil B = " +this.get_B());
        System.out.println("Bil A * B = " +this.get_C());
        System.out.println("---------------------------");
    }
}