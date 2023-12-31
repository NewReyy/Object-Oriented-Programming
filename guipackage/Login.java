package guipackage;

/**
 *
 * @author Nuri, Kukuh, Siti
 */

import kelompokTiga.ActiveAdmin;
import kelompokTiga.Admin;
import kelompokTiga.Makanan;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    /**
     * Creates new form Login
     */
    public Login() {
        if(ActiveAdmin.pertamaKali) {
            ActiveAdmin.daftarAdmin = initAdmin();
            ActiveAdmin.daftarOrder = new ArrayList();
            ActiveAdmin.daftarMakanan = initMakanan();
        }
        initComponents();
    }
    
    private ArrayList<Admin> initAdmin() {
        ArrayList<Admin> hasil = new ArrayList<>();
        hasil.add(new Admin("admin", "admin123"));
        hasil.add(new Admin("nuri", "nuri666"));
        hasil.add(new Admin("simur", "simur212"));
        hasil.add(new Admin("kuhh", "kuhckr098"));
    }

    private ArrayList<Makanan> initMakanan() {
        ArrayList<Makanan> hasil = new ArrayList<>();
        hasil.add(new Makanan ("Sate Ayam"), 25000);
        hasil.add(new Makanan ("Ayam Bakar"), 10000);
        hasil.add(new Makanan ("Ayam Goreng"), 9000);
        hasil.add(new Makanan ("Telor Dadar"), 5000);
        hasil.add(new Makanan ("Telor Balado"), 6500);
        hasil.add(new Makanan ("Capcay"), 6000);
        hasil.add(new Makanan ("Kangkung"), 5500);
        hasil.add(new Makanan ("Bayam"), 3000);
        hasil.add(new Makanan ("Nasi"), 3000);
        hasil.add(new Makanan ("Es Teh Manis"), 3000);
        hasil.add(new Makanan ("Es Teh Tawar"), 2000);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setText("Login Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

    
}
