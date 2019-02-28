/*
 */

/**
 *
 * @author Viduranga Landers
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        Home = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        OpenPDFButton = new javax.swing.JButton();
        ZoomOutButton1 = new javax.swing.JButton();
        ZoomInButton1 = new javax.swing.JButton();
        PreviousPageButton1 = new javax.swing.JButton();
        NextPageButton1 = new javax.swing.JButton();
        labelOpenFile = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        labelZoom = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Zoom100Button1 = new javax.swing.JButton();
        Options = new javax.swing.JPanel();
        PrintButton1 = new javax.swing.JButton();
        labelPrint = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ZoomInButton2 = new javax.swing.JButton();
        ZoomOutButton2 = new javax.swing.JButton();
        PreviousPageButton2 = new javax.swing.JButton();
        NextPageButton2 = new javax.swing.JButton();
        labelPreviousPage = new javax.swing.JLabel();
        labelNextPage = new javax.swing.JLabel();
        labelZoomIn = new javax.swing.JLabel();
        labelZoom100 = new javax.swing.JLabel();
        labelZoomOut = new javax.swing.JLabel();
        Zoom100Button2 = new javax.swing.JButton();
        textFieldPages = new javax.swing.JTextField();
        labelPages = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuitm_Open = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 600));

        jScrollPane2.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        Home.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        OpenPDFButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OpenPDFImg.png"))); // NOI18N

        ZoomOutButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZoomOutImg.png"))); // NOI18N
        ZoomOutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoomOutButton1ActionPerformed(evt);
            }
        });

        ZoomInButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZoomInImg.png"))); // NOI18N

        PreviousPageButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreviousImg.png"))); // NOI18N

        NextPageButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NextImg.png"))); // NOI18N

        labelOpenFile.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelOpenFile.setLabelFor(OpenPDFButton);
        labelOpenFile.setText("Open PDF");

        jSlider1.setMajorTickSpacing(50);
        jSlider1.setMaximum(200);
        jSlider1.setMinimum(25);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setToolTipText("");
        jSlider1.setName(""); // NOI18N

        labelZoom.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelZoom.setLabelFor(jSlider1);
        labelZoom.setText("Zoom Level");
        labelZoom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Zoom100Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zoom100%Img.png"))); // NOI18N

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OpenPDFButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PreviousPageButton1)
                .addGap(35, 35, 35)
                .addComponent(NextPageButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ZoomInButton1)
                .addGap(28, 28, 28)
                .addComponent(ZoomOutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(labelZoom)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Zoom100Button1)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addComponent(PreviousPageButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addComponent(NextPageButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addComponent(ZoomInButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addComponent(ZoomOutButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addComponent(Zoom100Button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelZoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addComponent(labelOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                        .addComponent(OpenPDFButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane2.addTab("Home", Home);

        PrintButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PrintImg.png"))); // NOI18N

        labelPrint.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelPrint.setLabelFor(PrintButton1);
        labelPrint.setText("Print Document");

        javax.swing.GroupLayout OptionsLayout = new javax.swing.GroupLayout(Options);
        Options.setLayout(OptionsLayout);
        OptionsLayout.setHorizontalGroup(
            OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PrintButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPrint)
                .addContainerGap(765, Short.MAX_VALUE))
        );
        OptionsLayout.setVerticalGroup(
            OptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrintButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
            .addGroup(OptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Options", Options);

        ZoomInButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZoomInImg.png"))); // NOI18N

        ZoomOutButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZoomOutImg.png"))); // NOI18N

        PreviousPageButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreviousImg.png"))); // NOI18N

        NextPageButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NextImg.png"))); // NOI18N

        labelPreviousPage.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelPreviousPage.setLabelFor(PreviousPageButton2);
        labelPreviousPage.setText("Previous Page");

        labelNextPage.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelNextPage.setLabelFor(NextPageButton2);
        labelNextPage.setText("Next Page");

        labelZoomIn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelZoomIn.setLabelFor(ZoomInButton2);
        labelZoomIn.setText("Zoom In");

        labelZoom100.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelZoom100.setLabelFor(Zoom100Button2);
        labelZoom100.setText("Zoom to 100%");

        labelZoomOut.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelZoomOut.setLabelFor(ZoomOutButton2);
        labelZoomOut.setText("Zoom Out");

        Zoom100Button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zoom100%Img.png"))); // NOI18N

        textFieldPages.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        labelPages.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        labelPages.setLabelFor(textFieldPages);
        labelPages.setText("/");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(textFieldPages, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ZoomOutButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelZoomOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(NextPageButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNextPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ZoomInButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelZoomIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Zoom100Button2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelZoom100))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(PreviousPageButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPreviousPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldPages, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPages, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NextPageButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNextPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PreviousPageButton2)
                    .addComponent(labelPreviousPage, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ZoomInButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelZoomIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ZoomOutButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelZoomOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Zoom100Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelZoom100, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(418, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        menuitm_Open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images (1).png"))); // NOI18N
        menuitm_Open.setText("Open");
        jMenu1.add(menuitm_Open);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ZoomOutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZoomOutButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZoomOutButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Home;
    private javax.swing.JButton NextPageButton1;
    private javax.swing.JButton NextPageButton2;
    private javax.swing.JButton OpenPDFButton;
    private javax.swing.JPanel Options;
    private javax.swing.JButton PreviousPageButton1;
    private javax.swing.JButton PreviousPageButton2;
    private javax.swing.JButton PrintButton1;
    private javax.swing.JButton Zoom100Button1;
    private javax.swing.JButton Zoom100Button2;
    private javax.swing.JButton ZoomInButton1;
    private javax.swing.JButton ZoomInButton2;
    private javax.swing.JButton ZoomOutButton1;
    private javax.swing.JButton ZoomOutButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel labelNextPage;
    private javax.swing.JLabel labelOpenFile;
    private javax.swing.JLabel labelPages;
    private javax.swing.JLabel labelPreviousPage;
    private javax.swing.JLabel labelPrint;
    private javax.swing.JLabel labelZoom;
    private javax.swing.JLabel labelZoom100;
    private javax.swing.JLabel labelZoomIn;
    private javax.swing.JLabel labelZoomOut;
    private javax.swing.JMenuItem menuitm_Open;
    private javax.swing.JTextField textFieldPages;
    // End of variables declaration//GEN-END:variables
}
