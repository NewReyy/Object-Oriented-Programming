package kelompokTiga;

/**
 *
 * @author Nuri, Kuku, Siti
 */
public class Makanan {
    private String nama;
    private int harga;
    
    public Makanan (String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public int getHarga() {
        return this.harga;
    }
}
