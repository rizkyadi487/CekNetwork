
import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CekNetwork extends javax.swing.JFrame {
    
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
        jTB_PC1 = new javax.swing.JToggleButton();
        jLIP_PC1 = new javax.swing.JLabel();
        jLS_PC1 = new javax.swing.JLabel();
        jTB_PC2 = new javax.swing.JToggleButton();
        jLIP_PC2 = new javax.swing.JLabel();
        jLS_PC2 = new javax.swing.JLabel();
        jTB_PC3 = new javax.swing.JToggleButton();
        jLIP_PC3 = new javax.swing.JLabel();
        jLS_PC3 = new javax.swing.JLabel();
        jTB_PC4 = new javax.swing.JToggleButton();
        jLIP_PC4 = new javax.swing.JLabel();
        jLS_PC4 = new javax.swing.JLabel();
        jTB_PC5 = new javax.swing.JToggleButton();
        jLIP_PC5 = new javax.swing.JLabel();
        jLS_PC5 = new javax.swing.JLabel();
        jTB_PC6 = new javax.swing.JToggleButton();
        jLIP_PC6 = new javax.swing.JLabel();
        jLS_PC6 = new javax.swing.JLabel();
        jTB_PC7 = new javax.swing.JToggleButton();
        jLIP_PC7 = new javax.swing.JLabel();
        jLS_PC7 = new javax.swing.JLabel();
        jTB_PC8 = new javax.swing.JToggleButton();
        jLIP_PC8 = new javax.swing.JLabel();
        jLS_PC8 = new javax.swing.JLabel();
        jTB_PC9 = new javax.swing.JToggleButton();
        jLIP_PC9 = new javax.swing.JLabel();
        jLS_PC9 = new javax.swing.JLabel();
        jTB_PC10 = new javax.swing.JToggleButton();
        jLIP_PC10 = new javax.swing.JLabel();
        jLS_PC10 = new javax.swing.JLabel();

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

        jTB_PC1.setText("PC1");
        jTB_PC1.setPreferredSize(new java.awt.Dimension(60, 60));

        jLIP_PC1.setText("IP         :");

        jLS_PC1.setText("Status  :");

        jTB_PC2.setText("PC2");
        jTB_PC2.setPreferredSize(new java.awt.Dimension(60, 60));

        jLIP_PC2.setText("IP         :");

        jLS_PC2.setText("Status  :");

        jTB_PC3.setText("PC3");
        jTB_PC3.setPreferredSize(new java.awt.Dimension(60, 60));

        jLIP_PC3.setText("IP         :");

        jLS_PC3.setText("Status  :");

        jTB_PC4.setText("PC4");
        jTB_PC4.setPreferredSize(new java.awt.Dimension(60, 60));

        jLIP_PC4.setText("IP         :");

        jLS_PC4.setText("Status  :");

        jTB_PC5.setText("PC5");
        jTB_PC5.setPreferredSize(new java.awt.Dimension(60, 60));

        jLIP_PC5.setText("IP         :");

        jLS_PC5.setText("Status  :");

        jTB_PC6.setText("PC6");
        jTB_PC6.setPreferredSize(new java.awt.Dimension(60, 60));
        jTB_PC6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTB_PC6MouseClicked(evt);
            }
        });

        jLIP_PC6.setText("IP         :");

        jLS_PC6.setText("Status  :");

        jTB_PC7.setText("PC7");
        jTB_PC7.setPreferredSize(new java.awt.Dimension(60, 60));

        jLIP_PC7.setText("IP         :");

        jLS_PC7.setText("Status  :");

        jTB_PC8.setText("PC8");
        jTB_PC8.setPreferredSize(new java.awt.Dimension(60, 60));

        jLIP_PC8.setText("IP         :");

        jLS_PC8.setText("Status  :");

        jTB_PC9.setText("PC9");
        jTB_PC9.setPreferredSize(new java.awt.Dimension(60, 60));

        jLIP_PC9.setText("IP         :");

        jLS_PC9.setText("Status  :");

        jTB_PC10.setText("PC10");
        jTB_PC10.setPreferredSize(new java.awt.Dimension(60, 60));

        jLIP_PC10.setText("IP         :");

        jLS_PC10.setText("Status  :");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Cek)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTB_PC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLIP_PC1)
                                    .addComponent(jLS_PC1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTB_PC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLIP_PC2)
                                    .addComponent(jLS_PC2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTB_PC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLIP_PC3)
                                    .addComponent(jLS_PC3)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTB_PC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLIP_PC4)
                                    .addComponent(jLS_PC4)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTB_PC5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLIP_PC5)
                                    .addComponent(jLS_PC5))))
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTB_PC9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLIP_PC9)
                                    .addComponent(jLS_PC9)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTB_PC10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLIP_PC10)
                                    .addComponent(jLS_PC10)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTB_PC6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLIP_PC6)
                                    .addComponent(jLS_PC6)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTB_PC7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLIP_PC7)
                                    .addComponent(jLS_PC7)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTB_PC8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLIP_PC8)
                                    .addComponent(jLS_PC8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_M1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_M2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_M3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_M4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_S1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_S2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_S3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_S4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Cek))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTB_PC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLIP_PC1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLS_PC1))
                            .addComponent(jTB_PC6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLIP_PC6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLS_PC6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTB_PC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLIP_PC2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLS_PC2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTB_PC7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLIP_PC7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLS_PC7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTB_PC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLIP_PC3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLS_PC3))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTB_PC8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLIP_PC8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLS_PC8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTB_PC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLIP_PC4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLS_PC4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTB_PC5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLIP_PC5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLS_PC5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTB_PC9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLIP_PC9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLS_PC9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTB_PC10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLIP_PC10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLS_PC10)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_CekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CekActionPerformed
        int pc = 0;
        int x1 = Integer.parseInt(jTF_M1.getText());
        int x2 = Integer.parseInt(jTF_M2.getText());
        int x3 = Integer.parseInt(jTF_M3.getText());
        int x4 = Integer.parseInt(jTF_M4.getText());
        
        int y1 = Integer.parseInt(jTF_S1.getText());
        int y2 = Integer.parseInt(jTF_S2.getText());
        int y3 = Integer.parseInt(jTF_S3.getText());
        int y4 = Integer.parseInt(jTF_S4.getText());
        if(((x4>255)||(x4<0))||((y4>255)||(y4<0))){
            System.out.println("rusak");
        }
        else{
        for(int q=x4;q<(y4+1);q++){
            try {
                pc+=1;
                cek(x1,x2,x3,q,pc);
            } catch (IOException ex) {
                Logger.getLogger(CekNetwork.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
        
    }//GEN-LAST:event_jB_CekActionPerformed

    private void jTB_PC6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTB_PC6MouseClicked
        
    }//GEN-LAST:event_jTB_PC6MouseClicked
  
    void cek(int x1,int x2,int x3,int x4,int pc) throws UnknownHostException, IOException{
        InetAddress inet1 = InetAddress.getByName(x1+"."+x2+"."+x3+"."+x4);
        System.out.println("Sedang Cek IP = "+x1+"."+x2+"."+x3+"."+x4);
        //String q="";
        if(inet1.isReachable(5000)){
            berhasil(x1,x2,x3,x4,pc);
        }
        else{
            tdkberhasil(x1,x2,x3,x4,pc);
        }
    }
    
    void berhasil(int x1,int x2,int x3,int x4, int pc){
        switch(pc){
            case 1 : jTB_PC1.setBackground(Color.blue);jLIP_PC1.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC1.setText("Status : Aktif");break;
            case 2 : jTB_PC2.setBackground(Color.blue);jLIP_PC2.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC2.setText("Status : Aktif");break;
            case 3 : jTB_PC3.setBackground(Color.blue);jLIP_PC3.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC3.setText("Status : Aktif");break;
            case 4 : jTB_PC4.setBackground(Color.blue);jLIP_PC4.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC4.setText("Status : Aktif");break;
            case 5 : jTB_PC5.setBackground(Color.blue);jLIP_PC5.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC5.setText("Status : Aktif");break;
            case 6 : jTB_PC6.setBackground(Color.blue);jLIP_PC6.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC6.setText("Status : Aktif");break;
            case 7 : jTB_PC7.setBackground(Color.blue);jLIP_PC7.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC7.setText("Status : Aktif");break;
            case 8 : jTB_PC8.setBackground(Color.blue);jLIP_PC8.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC8.setText("Status : Aktif");break;
            case 9 : jTB_PC9.setBackground(Color.blue);jLIP_PC9.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC9.setText("Status : Aktif");break;
            case 10 : jTB_PC10.setBackground(Color.blue);jLIP_PC10.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC10.setText("Status : Aktif");break;
        }
    }
    
    void tdkberhasil(int x1,int x2,int x3,int x4, int pc){
        switch(pc){
            case 1 : jTB_PC1.setBackground(Color.red);jLIP_PC1.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC1.setText("Status : Tidak Aktif");break;
            case 2 : jTB_PC2.setBackground(Color.red);jLIP_PC2.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC2.setText("Status : Tidak Aktif");break;
            case 3 : jTB_PC3.setBackground(Color.red);jLIP_PC3.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC3.setText("Status : Tidak Aktif");break;
            case 4 : jTB_PC4.setBackground(Color.red);jLIP_PC4.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC4.setText("Status : Tidak Aktif");break;
            case 5 : jTB_PC5.setBackground(Color.red);jLIP_PC5.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC5.setText("Status : Tidak Aktif");break;
            case 6 : jTB_PC6.setBackground(Color.red);jLIP_PC6.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC6.setText("Status : Tidak Aktif");break;
            case 7 : jTB_PC7.setBackground(Color.red);jLIP_PC7.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC7.setText("Status : Tidak Aktif");break;
            case 8 : jTB_PC8.setBackground(Color.red);jLIP_PC8.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC8.setText("Status : Tidak Aktif");break;
            case 9 : jTB_PC9.setBackground(Color.red);jLIP_PC9.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC9.setText("Status : Tidak Aktif");break;
            case 10 : jTB_PC10.setBackground(Color.red);jLIP_PC10.setText("IP          : "+x1+"."+x2+"."+x3+"."+x4);jLS_PC10.setText("Status : Tidak Aktif");break;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jB_Cek;
    private javax.swing.JLabel jLIP_PC1;
    private javax.swing.JLabel jLIP_PC10;
    private javax.swing.JLabel jLIP_PC2;
    private javax.swing.JLabel jLIP_PC3;
    private javax.swing.JLabel jLIP_PC4;
    private javax.swing.JLabel jLIP_PC5;
    private javax.swing.JLabel jLIP_PC6;
    private javax.swing.JLabel jLIP_PC7;
    private javax.swing.JLabel jLIP_PC8;
    private javax.swing.JLabel jLIP_PC9;
    private javax.swing.JLabel jLS_PC1;
    private javax.swing.JLabel jLS_PC10;
    private javax.swing.JLabel jLS_PC2;
    private javax.swing.JLabel jLS_PC3;
    private javax.swing.JLabel jLS_PC4;
    private javax.swing.JLabel jLS_PC5;
    private javax.swing.JLabel jLS_PC6;
    private javax.swing.JLabel jLS_PC7;
    private javax.swing.JLabel jLS_PC8;
    private javax.swing.JLabel jLS_PC9;
    private javax.swing.JToggleButton jTB_PC1;
    private javax.swing.JToggleButton jTB_PC10;
    private javax.swing.JToggleButton jTB_PC2;
    private javax.swing.JToggleButton jTB_PC3;
    private javax.swing.JToggleButton jTB_PC4;
    private javax.swing.JToggleButton jTB_PC5;
    private javax.swing.JToggleButton jTB_PC6;
    private javax.swing.JToggleButton jTB_PC7;
    private javax.swing.JToggleButton jTB_PC8;
    private javax.swing.JToggleButton jTB_PC9;
    private javax.swing.JTextField jTF_M1;
    private javax.swing.JTextField jTF_M2;
    private javax.swing.JTextField jTF_M3;
    private javax.swing.JTextField jTF_M4;
    private javax.swing.JTextField jTF_S1;
    private javax.swing.JTextField jTF_S2;
    private javax.swing.JTextField jTF_S3;
    private javax.swing.JTextField jTF_S4;
    // End of variables declaration//GEN-END:variables
}
