
import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CekNetwork extends javax.swing.JFrame {

    public int ping;

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
            java.util.logging.Logger.getLogger(CekNetwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CekNetwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CekNetwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CekNetwork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CekNetwork().setVisible(true);
            }
        });
    }

    public CekNetwork() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTF_M1 = new javax.swing.JTextField();
        jTF_M2 = new javax.swing.JTextField();
        jTF_M3 = new javax.swing.JTextField();
        jTF_S1 = new javax.swing.JTextField();
        jTF_S2 = new javax.swing.JTextField();
        jTF_S3 = new javax.swing.JTextField();
        jTF_S4 = new javax.swing.JTextField();
        jB_Cek = new javax.swing.JButton();
        jTF_M4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTF_M1.setText("192");
        jTF_M1.setMinimumSize(new java.awt.Dimension(24, 20));

        jTF_M2.setText("168");
        jTF_M2.setMinimumSize(new java.awt.Dimension(24, 20));

        jTF_M3.setText("1");
        jTF_M3.setMinimumSize(new java.awt.Dimension(24, 20));
        jTF_M3.setPreferredSize(new java.awt.Dimension(24, 20));
        jTF_M3.setSelectionEnd(3);
        jTF_M3.setSelectionStart(3);

        jTF_S1.setText("192");
        jTF_S1.setMinimumSize(new java.awt.Dimension(24, 20));

        jTF_S2.setText("168");
        jTF_S2.setMinimumSize(new java.awt.Dimension(24, 20));

        jTF_S3.setText("1");
        jTF_S3.setMinimumSize(new java.awt.Dimension(24, 20));
        jTF_S3.setPreferredSize(new java.awt.Dimension(24, 20));

        jTF_S4.setText("10");
        jTF_S4.setMinimumSize(new java.awt.Dimension(24, 20));
        jTF_S4.setPreferredSize(new java.awt.Dimension(24, 20));

        jB_Cek.setText("Cek");
        jB_Cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CekActionPerformed(evt);
            }
        });

        jTF_M4.setText("1");
        jTF_M4.setMinimumSize(new java.awt.Dimension(24, 20));
        jTF_M4.setPreferredSize(new java.awt.Dimension(24, 20));
        jTF_M4.setSelectionEnd(3);
        jTF_M4.setSelectionStart(3);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "IP", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel1.setText("RTO time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTF_M1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF_M2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF_M3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF_M4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTF_S1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF_S2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF_S3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF_S4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_Cek)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTF_M1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTF_M2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTF_M3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTF_M4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_S1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_S2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_S3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_S4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Cek))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_CekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CekActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        int pc = 0;
        int x1 = Integer.parseInt(jTF_M1.getText());
        int x2 = Integer.parseInt(jTF_M2.getText());
        int x3 = Integer.parseInt(jTF_M3.getText());
        int x4 = Integer.parseInt(jTF_M4.getText());

        int y1 = Integer.parseInt(jTF_S1.getText());
        int y2 = Integer.parseInt(jTF_S2.getText());
        int y3 = Integer.parseInt(jTF_S3.getText());
        int y4 = Integer.parseInt(jTF_S4.getText());
        if (((x4 > 255) || (x4 < 0)) || ((y4 > 255) || (y4 < 0))) {
            System.out.println("rusak");
        } else {
            for (int q = x4; q < (y4 + 1); q++) {
                try {
                    pc += 1;
                    cek(x1, x2, x3, q, pc);

                } catch (IOException ex) {
                    Logger.getLogger(CekNetwork.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_jB_CekActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped

        try {//masih bug, angka terakir belum masuk
            ping = Integer.parseInt(jTextField1.getText());
        } catch (Exception e) {
            ping = 0;
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    void cek(int x1, int x2, int x3, int x4, int pc) throws UnknownHostException, IOException {
        InetAddress inet1 = InetAddress.getByName(x1 + "." + x2 + "." + x3 + "." + x4);
        System.out.println("Sedang Cek IP = " + x1 + "." + x2 + "." + x3 + "." + x4);
        //String q="";
        if (inet1.isReachable(ping)) {//TODO ubah menjadi auto add list
            berhasil(x1, x2, x3, x4, pc);
            for (int count = 1; count <= 30; count++) {
            }
        } else {
            tdkberhasil(x1, x2, x3, x4, pc);
        }
        System.out.println(ping);
    }

    void berhasil(int x1, int x2, int x3, int x4, int pc) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"PC", x1 + "." + x2 + "." + x3 + "." + x4, "Aktif"});
    }

    void tdkberhasil(int x1, int x2, int x3, int x4, int pc) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"PC", x1 + "." + x2 + "." + x3 + "." + x4, "Tidak Aktif"});
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jB_Cek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTF_M1;
    private javax.swing.JTextField jTF_M2;
    private javax.swing.JTextField jTF_M3;
    private javax.swing.JTextField jTF_M4;
    private javax.swing.JTextField jTF_S1;
    private javax.swing.JTextField jTF_S2;
    private javax.swing.JTextField jTF_S3;
    private javax.swing.JTextField jTF_S4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
