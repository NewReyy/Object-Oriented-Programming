package kelompokTiga;

/**
 *
 * @author ACER
 */

import java.util.ArrayList;
import java.util.HashMap;

public class ActiveAdmin extends Admin {
    public static ActiveAdmin admin = null;
    public static boolean pertamaKali =  true;
    public static ArrayList<Admin> daftarAdmin;
    public static ArrayList<Order> daftarOrder;
    public static ArrayList<Makanan> daftarMakanan;
    public static HashMap<Integer, Integer> keranjang;

    public ActiveAdmin(String username, String password) {
        super(username, password);
    }
}