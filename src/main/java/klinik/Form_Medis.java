package klinik;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import java.time.LocalDate;
import klinik.Form_Pasien;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Form_Medis extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
   
    public Form_Medis() {
        initComponents();
        datatable();
    }

    protected void aktif(){
    tidDokter.setEnabled(true);
    tnDokter.setEnabled(true);
    tiPasien.setEnabled(true);
    tnPasien.setEnabled(true);
    tgoldah.setEnabled(true);
    ttBadan.setEnabled(true);
    tdiagnosaDokter.setEnabled(true);
    triwayatPasien.setEnabled(true);
    ttPemeriksaan.requestFocus();
   }
    
    protected void kosong(){
    tidDokter.setText("");
    tnDokter.setText("");
    tiPasien.setText("");
    tnPasien.setText("");
    tgoldah.setText("");
    ttBadan.setText("");
    tberatBadan.setText("");
    tdiagnosaDokter.setText("");
    triwayatPasien.setText("");
   }
    
    protected void datatable(){
        Object[] Baris ={"Tanggal","ID Dokter","ID Pasien","Tinggi Badan","Berat Badan","Diagnosa"};
        tabmode = new DefaultTableModel (null, Baris);
        tabelPasien.setModel(tabmode);
        String sql = "select * FROM rekam";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("tgl");
                String b = hasil.getString("id_dok");
                String c = hasil.getString("id_pas");
                String d = hasil.getString("tb");
                String e = hasil.getString("bb");
                String f = hasil.getString("diagnosa");
                
            String[] data={a,b,c,d,e,f};
            tabmode.addRow(data);
        }
        } catch (Exception e) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tidDokter = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tnDokter = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tiPasien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tnPasien = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tgoldah = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ttBadan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tberatBadan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdiagnosaDokter = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        ttPemeriksaan = new com.toedter.calendar.JDateChooser();
        sIdentitasPasien = new javax.swing.JButton();
        sidDokter = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        triwayatPasien = new javax.swing.JTextField();
        sriwayat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelPasien = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REKAM MEDIS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 590, 100));

        jLabel3.setText("ID Dokter");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 135, 135, 27));
        getContentPane().add(tidDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 135, 155, -1));

        jLabel4.setText("Nama Dokter");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 168, 135, 27));
        getContentPane().add(tnDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 168, 155, -1));

        jLabel5.setText("No Identitas Pasien");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 201, 135, 27));
        getContentPane().add(tiPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 201, 153, -1));

        jLabel6.setText("Nama Pasien");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 234, 135, 27));
        getContentPane().add(tnPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 234, 155, -1));

        jLabel7.setText("Golongan Darah");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 267, 135, 27));
        getContentPane().add(tgoldah, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 267, 155, -1));

        jLabel8.setText("Tinggi Badan");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 300, 135, 27));
        getContentPane().add(ttBadan, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 300, 155, -1));

        jLabel9.setText("Berat Badan");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 333, 135, 27));
        getContentPane().add(tberatBadan, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 333, 155, -1));

        jLabel10.setText("Diagnosa Dokter");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 366, 135, 27));

        tdiagnosaDokter.setColumns(20);
        tdiagnosaDokter.setRows(5);
        jScrollPane1.setViewportView(tdiagnosaDokter);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 366, -1, -1));

        jLabel11.setText("Tanggal Pemeriksaan");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 102, 135, 27));

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 474, 102, 42));

        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 474, 102, 42));

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 474, 102, 42));
        getContentPane().add(ttPemeriksaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 102, 180, -1));

        sIdentitasPasien.setText("SEARCH");
        sIdentitasPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sIdentitasPasienActionPerformed(evt);
            }
        });
        getContentPane().add(sIdentitasPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 201, -1, -1));

        sidDokter.setText("SEARCH");
        sidDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidDokterActionPerformed(evt);
            }
        });
        getContentPane().add(sidDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 135, -1, -1));

        jLabel12.setText("Cari Data  Pasien");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 528, 135, 27));
        getContentPane().add(triwayatPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 342, -1));

        sriwayat.setText("SEARCH");
        sriwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sriwayatActionPerformed(evt);
            }
        });
        getContentPane().add(sriwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, -1, -1));

        tabelPasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelPasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPasienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelPasien);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 561, 585, 225));

        btnPrint.setText("PRINT");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 474, 102, 42));

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 474, 100, 42));

        setSize(new java.awt.Dimension(597, 793));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sidDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidDokterActionPerformed
        // TODO add your handling code here:
        String sql = "select * FROM dokter WHERE id = '" + tidDokter.getText() + "'";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String nm = hasil.getString("nama");
                tnDokter.setText(nm);
                tnDokter.setEnabled(false);
            }
        } catch (Exception E) {}
    }//GEN-LAST:event_sidDokterActionPerformed

    private void sIdentitasPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sIdentitasPasienActionPerformed
        // TODO add your handling code here:
          String sql = "select * FROM pasien WHERE id = '" + tiPasien.getText() + "'";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("nama");
                String b = hasil.getString("goldar");
                
                tnPasien.setText(a);
                tgoldah.setText(b);
                
                tnPasien.setEnabled(false);
                tgoldah.setEnabled(false);
            }
        } catch (Exception E) {}
    }//GEN-LAST:event_sIdentitasPasienActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:   
        String sql = "insert into rekam values (?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(ttPemeriksaan.getDate());
            stat.setString(1, date);
            stat.setString(2, tidDokter.getText());
            stat.setString(3, tiPasien.getText());
            stat.setInt(4, Integer.parseInt(ttBadan.getText()));
            stat.setInt(5, Integer.parseInt(tberatBadan.getText()));
            stat.setString(6, tdiagnosaDokter.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            tidDokter.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        kosong();
        datatable();
    }//GEN-LAST:event_clearActionPerformed

    private void sriwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sriwayatActionPerformed
        // TODO add your handling code here:
        Object[] Baris ={"Tanggal","ID Dokter","ID Pasien","Tinggi Badan","Berat Badan","Diagnosa"};
        tabmode = new DefaultTableModel (null, Baris);
        tabelPasien.setModel(tabmode);
        String sql = "select * FROM rekam WHERE id_pas = '" + triwayatPasien.getText() + "'";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("tgl");
                String b = hasil.getString("id_dok");
                String c = hasil.getString("id_pas");
                String d = hasil.getString("tb");
                String e = hasil.getString("bb");
                String f = hasil.getString("diagnosa");

                String[] data={a,b,c,d,e,f};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_sriwayatActionPerformed

    private void tabelPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPasienMouseClicked
        // TODO add your handling code here:
          int bar = tabelPasien.getSelectedRow();
        String a = tabmode.getValueAt (bar, 0).toString();
        try {
            Date tgl=null;
            tgl=(Date) new SimpleDateFormat("yyyy-MM-dd").parse(a);
            ttPemeriksaan.setDate(tgl);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        String b = tabmode.getValueAt (bar, 1).toString();
        String c = tabmode.getValueAt (bar, 2).toString();
        String d = tabmode.getValueAt (bar, 3).toString();
        String e = tabmode.getValueAt (bar, 4).toString();
        String f = tabmode.getValueAt (bar, 5).toString();

        tidDokter.setText(b);
        tiPasien.setText(c);
        ttBadan.setText(d);
        tberatBadan.setText(e);
        tdiagnosaDokter.setText(f);
    }//GEN-LAST:event_tabelPasienMouseClicked

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
            try{
                String reportPath = "src/main/java/klinik/report_rekam.jasper";
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/s6a";
                String username = "root";
                String password = "";
                Connection conn = DriverManager.getConnection(url, username, password);

                
                HashMap<String, Object> parameters = new HashMap<>();
                JasperPrint print = JasperFillManager.fillReport(reportPath,parameters,conn);
                JasperViewer viewer = new JasperViewer(print,false);
                viewer.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Error Display Report " + e.getMessage(),"error",JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null,"Hapus","Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0) {
            String sql ="delete from rekam where id_pas='"+tiPasien.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement (sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kosong();
                tiPasien.requestFocus();
                datatable();
            } catch (SQLException e)    {
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus"+e);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Medis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Medis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Medis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Medis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Medis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton sIdentitasPasien;
    private javax.swing.JButton save;
    private javax.swing.JButton sidDokter;
    private javax.swing.JButton sriwayat;
    private javax.swing.JTable tabelPasien;
    private javax.swing.JTextField tberatBadan;
    private javax.swing.JTextArea tdiagnosaDokter;
    private javax.swing.JTextField tgoldah;
    private javax.swing.JTextField tiPasien;
    private javax.swing.JTextField tidDokter;
    private javax.swing.JTextField tnDokter;
    private javax.swing.JTextField tnPasien;
    private javax.swing.JTextField triwayatPasien;
    private javax.swing.JTextField ttBadan;
    private com.toedter.calendar.JDateChooser ttPemeriksaan;
    // End of variables declaration//GEN-END:variables


    
}
