/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu;

import barang.form_barang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Rimuza
 */
public class menu_utama extends javax.swing.JFrame {

    /**
     * Creates new form menu_utama
     */
    public menu_utama() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pv_navbar = new javax.swing.JPanel();
        pn_sidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pn_menu = new javax.swing.JPanel();
        pn_content = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pv_navbar.setBackground(new java.awt.Color(51, 51, 51));
        pv_navbar.setForeground(new java.awt.Color(102, 255, 102));
        pv_navbar.setPreferredSize(new java.awt.Dimension(731, 70));

        javax.swing.GroupLayout pv_navbarLayout = new javax.swing.GroupLayout(pv_navbar);
        pv_navbar.setLayout(pv_navbarLayout);
        pv_navbarLayout.setHorizontalGroup(
            pv_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );
        pv_navbarLayout.setVerticalGroup(
            pv_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(pv_navbar, java.awt.BorderLayout.PAGE_START);

        pn_sidebar.setBackground(new java.awt.Color(255, 255, 255));
        pn_sidebar.setPreferredSize(new java.awt.Dimension(209, 432));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        pn_menu.setBackground(new java.awt.Color(255, 255, 255));
        pn_menu.setLayout(new javax.swing.BoxLayout(pn_menu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pn_menu);

        javax.swing.GroupLayout pn_sidebarLayout = new javax.swing.GroupLayout(pn_sidebar);
        pn_sidebar.setLayout(pn_sidebarLayout);
        pn_sidebarLayout.setHorizontalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );
        pn_sidebarLayout.setVerticalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        getContentPane().add(pn_sidebar, java.awt.BorderLayout.LINE_START);

        pn_content.setBackground(new java.awt.Color(255, 255, 255));
        pn_content.setPreferredSize(new java.awt.Dimension(549, 432));

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_contentLayout = new javax.swing.GroupLayout(pn_content);
        pn_content.setLayout(pn_contentLayout);
        pn_contentLayout.setHorizontalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        pn_contentLayout.setVerticalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        getContentPane().add(pn_content, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(772, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        pn_utama.add(new content_utama());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_content;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_sidebar;
    private javax.swing.JPanel pn_utama;
    private javax.swing.JPanel pv_navbar;
    // End of variables declaration//GEN-END:variables

    private void execute() { 
        ImageIcon iconbarang        = new ImageIcon(getClass().getResource("/img/master.png"));
        ImageIcon iconlapangan      = new ImageIcon(getClass().getResource("/img/lapangan.png"));
        ImageIcon iconpemesanan     = new ImageIcon(getClass().getResource("/img/pemesanan.png"));
        ImageIcon iconlaporan       = new ImageIcon(getClass().getResource("/img/laporan.png"));
        ImageIcon iconhome          = new ImageIcon(getClass().getResource("/img/home.png"));
        
        ImageIcon iconmaster        = new ImageIcon(getClass().getResource("/img/barang.png"));
        
        menu_item master    = new menu_item (null,true,iconmaster,"Data",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new form_barang());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        menu_item input     = new menu_item(null, true, iconmaster,  "Input", null);
        menu_item report    = new menu_item(null, true, iconmaster,  "Stok", null);
        
        menu_item menuhome          = new menu_item(iconhome, false, null, "Home", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new content_utama());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        
        menu_item menubarang        = new menu_item(iconbarang, false, null, "Barang", null,master,input,report);
        menu_item menulapangan      = new menu_item(iconlapangan, false, null, "Lapangan", null);
        menu_item menupemesanan     = new menu_item(iconpemesanan, false, null, "Pemesanan", null);
        menu_item menulaporan       = new menu_item(iconlaporan, false, null, "Laporan", null);
        
        addmenu(menuhome, menulapangan,menupemesanan,menubarang,menulaporan);
    }
    
    private void addmenu(menu_item... menu) {
            for (int i = 0; i < menu.length; i++) {
            pn_menu.add(menu[i]);
            ArrayList<menu_item> submenu = menu[i].getsubmenu();
            for (menu_item m : submenu) {
                addmenu(m);
            }
        }
            pn_menu.revalidate();
    }
}