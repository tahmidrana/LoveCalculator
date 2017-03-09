
import javax.swing.JOptionPane;

/**
 * Md. Tahmiudr Rahman
 * CSE(35th Batch)
 * Bangladesh University
 * Idea from an UVa Online Judge Problem
 */
public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
    }

    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Love Calculator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);

        jPanel2.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jTextField1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField1.setSelectionColor(new java.awt.Color(102, 102, 102));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(470, 180, 110, 30);

        jTextField2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField2.setSelectionColor(new java.awt.Color(102, 102, 102));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(40, 180, 110, 30);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(290, 320, 95, 40);

        resultLabel.setFont(new java.awt.Font("Urdu Typesetting", 2, 32)); // NOI18N
        resultLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(resultLabel);
        resultLabel.setBounds(300, 160, 100, 50);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(582, 370, 51, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Gc4XB8gcp.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    //ekhane amr kora code
    //ok button er sob kaj ekhane hobe
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int res1,res,c,d;
        int mod,mod1,mod2,mod3;
        int res2,res3,ratio;

        String s1 = jTextField1.getText();
        String s2 = jTextField2.getText();

        if("rana".equals(s1) || "rana".equals(s2))
            JOptionPane.showMessageDialog(this, "Don't try to be clever!! My name will be an invalid input","try other name",JOptionPane.ERROR_MESSAGE);

        else{
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        c=0;
        d=0;
        res=0;
        res1=0;
        res2=0;
        res3=0;

    for(int i=0 ; i<s1.length() ; i++){
        if(a[i]>='a' && a[i]<='z')
            c+=a[i]-'a'+1;
        else if(a[i]>='A' && a[i]<='Z')
            c+=a[i]-'A'+1;
    }

    for(int j = 0 ; j<s2.length() ; j++){
        if(b[j]>='a' && b[j]<='z')
            d+=b[j]-'a'+1;
        else if(b[j]>='A' && b[j]<='Z')
            d+=b[j]-'A'+1;
    }

        for(int k=0;k<=10;k++){
            mod=c%10;
            c=c/10;
            res=res+mod;
            mod1=d%10;
            d=d/10;
            res1=res1+mod1;
        }

        for(int l=0;l<=10;l++){
            mod2=res%10;
            res=res/10;
            res2=res2+mod2;

            mod3=res1%10;
            res1=res1/10;
            res3=res3+mod3;
        }

        if(res2>res3)
            ratio=(res3*100)/res2;
        else
            ratio=(res2*100)/res3;

        this.resultLabel.setText(ratio + " %");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Exit Button
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel resultLabel;
    // End of variables declaration//GEN-END:variables

}
