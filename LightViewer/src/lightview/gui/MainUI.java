package lightview.gui;

/**
 * @author Viduranga Landers
 */

import java.awt.*;
import lightview.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.pdfbox.pdmodel.PDDocument;

public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_logo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        statusBar = new javax.swing.JPanel();
        btnPrev = new javax.swing.JButton();
        txtPgNo = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        pnl_pageContainer = new javax.swing.JPanel();
        ofd = new javax.swing.JFileChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuitm_Open = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new java.awt.Dimension(400, 400));

        pnl_logo.setBackground(new java.awt.Color(255, 249, 178));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Light View");

        javax.swing.GroupLayout pnl_logoLayout = new javax.swing.GroupLayout(pnl_logo);
        pnl_logo.setLayout(pnl_logoLayout);
        pnl_logoLayout.setHorizontalGroup(
            pnl_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_logoLayout.setVerticalGroup(
            pnl_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        statusBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        statusBar.setLayout(new java.awt.GridBagLayout());

        btnPrev.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnPrev.setText("\u25C4 Prev");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        statusBar.add(btnPrev, new java.awt.GridBagConstraints());

        txtPgNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPgNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        statusBar.add(txtPgNo, new java.awt.GridBagConstraints());

        btnNext.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnNext.setText("Next \u25BA");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        statusBar.add(btnNext, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout pnl_pageContainerLayout = new javax.swing.GroupLayout(pnl_pageContainer);
        pnl_pageContainer.setLayout(pnl_pageContainerLayout);
        pnl_pageContainerLayout.setHorizontalGroup(
            pnl_pageContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );
        pnl_pageContainerLayout.setVerticalGroup(
            pnl_pageContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        ofd.setAcceptAllFileFilterUsed(false);
        ofd.setCurrentDirectory(null);
        ofd.setFileFilter(new FileNameExtensionFilter("PDF files", "pdf")
        );

        jMenu1.setText("File");

        menuitm_Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuitm_Open.setText("Open");
        menuitm_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitm_OpenActionPerformed(evt);
            }
        });
        jMenu1.add(menuitm_Open);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(statusBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
            .addComponent(pnl_pageContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_pageContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuitm_OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitm_OpenActionPerformed
        if(ofd.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            try {
                DataCache dc = DataCache.getInstance();
                dc.setCurrentFile(ofd.getSelectedFile());
                dc.setDoc(PDDocument.load(dc.getCurrentFile()));
                if((new DataExtractor(dc.getDoc())).getPageCount() > 0) dc.setCurrentPage(1);
                loadPdf();
            } catch (IOException ex) {
                Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_menuitm_OpenActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        DataCache dc = DataCache.getInstance();
        if(dc.getDoc() == null) return;
        else if(dc.getDoc().getNumberOfPages() <= dc.getCurrentPage()) return;
        dc.setCurrentPage(dc.getCurrentPage() + 1);
        loadPdf();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        DataCache dc = DataCache.getInstance();
        if(dc.getDoc() == null) return;
        else if(dc.getCurrentPage() == 1) return;
        dc.setCurrentPage(dc.getCurrentPage() - 1);
        loadPdf();
    }//GEN-LAST:event_btnPrevActionPerformed

    public void showPage(JPanel page){
        pnl_pageContainer.removeAll();
        JPanel pnl = new JPanel(null);
        pnl.setPreferredSize(new Dimension(page.getWidth() + 20, 
                page.getHeight() + 20));
        pnl.setSize(pnl_pageContainer.getSize());
        page.setLocation((pnl.getWidth() / 2) - (page.getWidth() / 2) , 10);
        pnl.add(page);
        JScrollPane scrollpane = new JScrollPane(pnl);
        scrollpane.setLayout(new ScrollPaneLayout());
        scrollpane.setSize(pnl_pageContainer.getSize());
        scrollpane.getVerticalScrollBar().setUnitIncrement(10);
        pnl_pageContainer.add(scrollpane);
        pnl_pageContainer.repaint();
    }

    public void loadPdf(){
        DataCache cache = DataCache.getInstance();
        try{
            if(cache.getDoc() == null) return;
            PDDocument doc = cache.getDoc();
            DataExtractor de = new DataExtractor(doc);
            if(cache.getCurrentPage() < 1 || 
                    cache.getCurrentPage() > de.getPageCount()) return;
            Page p = new Page(doc, cache.getCurrentPage());
            showPage(p.getPage());
            txtPgNo.setText(Integer.toString(cache.getCurrentPage())); 
            repaint();
        } catch(IOException e){
            
        }
    }
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        MainUI ui = new MainUI();
        ui.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuitm_Open;
    private javax.swing.JFileChooser ofd;
    private javax.swing.JPanel pnl_logo;
    private javax.swing.JPanel pnl_pageContainer;
    private javax.swing.JPanel statusBar;
    private javax.swing.JTextField txtPgNo;
    // End of variables declaration//GEN-END:variables
}
