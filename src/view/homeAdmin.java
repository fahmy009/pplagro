/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;

/**
 *
 * @author InSearchOfIncredible
 */
public class homeAdmin extends javax.swing.JFrame {

    /**
     * Creates new form homeAdmin
     */
    public homeAdmin() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public void addDaftarListener(ActionListener listener) {
        btn_daftar.addActionListener(listener);
    }

    public void addLaporanListener(ActionListener listener) {
        btn_laporan.addActionListener(listener);
    }

    public void addKontrakListener(ActionListener listener) {
        btn_kontrak.addActionListener(listener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_kontrak = new javax.swing.JButton();
        btn_laporan = new javax.swing.JButton();
        btn_daftar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_kontrak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/data K.png"))); // NOI18N
        btn_kontrak.setBorder(null);
        btn_kontrak.setBorderPainted(false);
        btn_kontrak.setContentAreaFilled(false);
        getContentPane().add(btn_kontrak, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        btn_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/lap panen.png"))); // NOI18N
        btn_laporan.setBorder(null);
        btn_laporan.setBorderPainted(false);
        btn_laporan.setContentAreaFilled(false);
        getContentPane().add(btn_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, -1, -1));

        btn_daftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pendaftaran.png"))); // NOI18N
        btn_daftar.setBorder(null);
        btn_daftar.setBorderPainted(false);
        btn_daftar.setContentAreaFilled(false);
        getContentPane().add(btn_daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/home admin.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(homeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_daftar;
    private javax.swing.JButton btn_kontrak;
    private javax.swing.JButton btn_laporan;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}