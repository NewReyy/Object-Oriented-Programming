package kelompokTiga;

/**
 *
 * @author Nuri, Kukuh, Siti
 */
import java.util.HashMap;
import java.util.HashMap;

public class Order {

    private HashMap<Integer, Integer> detail;
    private int totalHarga;
    private String tanggalWaktu;
    private int totalBayar;
    private int totalKembali;
    private boolean sudahSelesai;

    public Order(int totalHarga, int totalBayar, int totalKembali, String tanggalWaktu, HashMap<Integer, Integer> detail) {
        this.totalHarga = totalHarga;
        this.totalBayar = totalBayar;
        this.totalKembali = totalKembali;
        this.tanggalWaktu = tanggalWaktu;
        this.detail = detail;
        this.sudahSelesai = false;
    }

    public void setSelesai(boolean sudahSelesai) {
        this.sudahSelesai = sudahSelesai;
    }

    public boolean getSelesai(){
        return this.sudahSelesai;
    }

    public HashMap<Integer, Integer> getDetail(){
        return this.detail;
    }

    public int getTotalHarga(){
        return this.totalHarga;
    }

    public String getTanggalWaktu(){
        return this.tanggalWaktu;
    }

    public int getTotalBayar(){
        return this.totalBayar;
    }

    public int getTotalKembali(){
        return this.totalKembali;
    }
}
