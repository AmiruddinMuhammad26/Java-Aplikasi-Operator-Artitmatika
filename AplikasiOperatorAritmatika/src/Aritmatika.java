
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Aritmatika extends javax.swing.JFrame {
    /**
     * Creates new form Aritmatika
     */
    double angka1, angka2, hasil;
    
    public Aritmatika() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtangka1 = new javax.swing.JTextField();
        txtangka2 = new javax.swing.JTextField();
        txthasil = new javax.swing.JTextField();
        btnpenjumlahan = new javax.swing.JButton();
        btnpengurangan = new javax.swing.JButton();
        btnperkalian = new javax.swing.JButton();
        btnpembagian = new javax.swing.JButton();
        btnsisabagi = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("APLIKASI OPERATOR ARITMATIKA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("ANGKA 1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("ANGKA 2");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("HASIL");

        txthasil.setEditable(false);

        btnpenjumlahan.setText("PENJUMLAHAN");
        btnpenjumlahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpenjumlahanActionPerformed(evt);
            }
        });

        btnpengurangan.setText("PENGURANGAN");
        btnpengurangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpenguranganActionPerformed(evt);
            }
        });

        btnperkalian.setText("PERKALIAN");
        btnperkalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnperkalianActionPerformed(evt);
            }
        });

        btnpembagian.setText("PEMBAGIAN");
        btnpembagian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpembagianActionPerformed(evt);
            }
        });

        btnsisabagi.setText("SISA BAGI");
        btnsisabagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsisabagiActionPerformed(evt);
            }
        });

        btnbatal.setText("BATAL");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtangka1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(txtangka2))
                            .addComponent(txthasil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnpenjumlahan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnperkalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnsisabagi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnpengurangan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnpembagian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnbatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnkeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnpenjumlahan)
                    .addComponent(btnperkalian)
                    .addComponent(txtangka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtangka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpengurangan)
                    .addComponent(btnpembagian))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsisabagi)
                            .addComponent(btnbatal)
                            .addComponent(txthasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnkeluar)
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Penjumlahan
    private void btnpenjumlahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpenjumlahanActionPerformed
        // TODO add your handling code here:
        if (txtangka1.getText().equals("")||txtangka2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Pastikan Semua Data Terisi");
            txtangka1.requestFocus();
        } else {
            angka1=Double.parseDouble(txtangka1.getText());
            angka2=Double.parseDouble(txtangka2.getText());
            hasil=angka1+angka2;
            txthasil.setText(String.valueOf(hasil));
        }
    }//GEN-LAST:event_btnpenjumlahanActionPerformed
    
    // Batal
    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        // TODO add your handling code here:
        txtangka1.setText("");
        txtangka2.setText("");
        txthasil.setText("");
        txtangka1.requestFocus();
    }//GEN-LAST:event_btnbatalActionPerformed
    
    // Keluar
    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnkeluarActionPerformed
    
    // Perkalian
    private void btnperkalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnperkalianActionPerformed
        // TODO add your handling code here:
        if (txtangka1.getText().equals("")||txtangka2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Pastikan Semua Data Terisi");
            txtangka1.requestFocus();
        } else {
            angka1=Double.parseDouble(txtangka1.getText());
            angka2=Double.parseDouble(txtangka2.getText());
            hasil=angka1*angka2;
            txthasil.setText(String.valueOf(hasil));
        }
    }//GEN-LAST:event_btnperkalianActionPerformed
    
    // Pengurangan
    private void btnpenguranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpenguranganActionPerformed
        // TODO add your handling code here:
        if (txtangka1.getText().equals("")||txtangka2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Pastikan Semua Data Terisi");
            txtangka1.requestFocus();
        } else {
            angka1=Double.parseDouble(txtangka1.getText());
            angka2=Double.parseDouble(txtangka2.getText());
            hasil=angka1-angka2;
            txthasil.setText(String.valueOf(hasil));
        }
    }//GEN-LAST:event_btnpenguranganActionPerformed

    // Pembagian
    private void btnpembagianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpembagianActionPerformed
        // TODO add your handling code here:
        if (txtangka1.getText().equals("")||txtangka2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Pastikan Semua Data Terisi");
            txtangka1.requestFocus();
        } else {
            angka1=Double.parseDouble(txtangka1.getText());
            angka2=Double.parseDouble(txtangka2.getText());
            hasil=angka1/angka2;
            txthasil.setText(String.valueOf(hasil));
        }
    }//GEN-LAST:event_btnpembagianActionPerformed
    
    // Sisa Bagi
    private void btnsisabagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsisabagiActionPerformed
        // TODO add your handling code here:
        if (txtangka1.getText().equals("")||txtangka2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Pastikan Semua Data Terisi");
            txtangka1.requestFocus();
        } else {
            angka1=Double.parseDouble(txtangka1.getText());
            angka2=Double.parseDouble(txtangka2.getText());
            hasil=angka1%angka2;
            txthasil.setText(String.valueOf(hasil));
        }
    }//GEN-LAST:event_btnsisabagiActionPerformed

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
            java.util.logging.Logger.getLogger(Aritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aritmatika().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnpembagian;
    private javax.swing.JButton btnpengurangan;
    private javax.swing.JButton btnpenjumlahan;
    private javax.swing.JButton btnperkalian;
    private javax.swing.JButton btnsisabagi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtangka1;
    private javax.swing.JTextField txtangka2;
    private javax.swing.JTextField txthasil;
    // End of variables declaration//GEN-END:variables
}
