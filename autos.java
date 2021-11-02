import java.util.Random;
import javax.swing.ImageIcon;
public class autos extends javax.swing.JFrame {
    public autos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Simulación de sorteo de autos:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("El primer lugar recibe un automovil de la marca: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("El segundo lugar recibe un automovil de la marca:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("El tercer lugar recibe un automovil de la marca:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/auto12.jpeg"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/auto5.jpeg"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Sortear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img3/auto1.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4)))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          Random autos = new Random();
       int res1 = (int) (autos.nextDouble()* 12);
       if(res1==0){
           jLabel5.setIcon(new ImageIcon(getClass().getResource("img/auto1.jpeg")));
       } else if(res1==1){
           jLabel5.setIcon(new ImageIcon(getClass().getResource("img/auto2.jpeg")));
       }else if(res1==2){
           jLabel5.setIcon(new ImageIcon(getClass().getResource("img/auto3.jpeg")));
       }else if(res1==3){
           jLabel5.setIcon(new ImageIcon(getClass().getResource("img/auto4.jpeg")));
       }else if(res1==4){
           jLabel5.setIcon(new ImageIcon(getClass().getResource("img/auto5.jpeg")));
       }else if(res1==5){
           jLabel5.setIcon(new ImageIcon(getClass().getResource("img/auto6.jpeg")));
       }else if(res1==6){
           jLabel5.setIcon(new ImageIcon(getClass().getResource("img/auto7.jpeg")));
       }else if(res1==7){
           jLabel5.setIcon(new ImageIcon(getClass().getResource("img/auto8.jpeg")));
       }else if(res1==8){
           jLabel5.setIcon(new ImageIcon(getClass().getResource("img/auto9.jpeg")));
       }else if(res1==9){
           jLabel5.setIcon(new ImageIcon(getClass().getResource("img/auto10.jpeg")));
       }else if(res1==10){
           jLabel5.setIcon(new ImageIcon(getClass().getResource("img/auto11.jpeg")));
       }else if(res1==11){
           jLabel5.setIcon(new ImageIcon(getClass().getResource("img/auto12.jpeg")));
       }
        System.out.println("");
      int res2 = (int) (autos.nextDouble()* 12);
       if(res2==0){
           jLabel6.setIcon(new ImageIcon(getClass().getResource("img2/auto1.jpeg")));
       } else if(res2==1){
           jLabel6.setIcon(new ImageIcon(getClass().getResource("img2/auto2.jpeg")));
       }else if(res2==2){
           jLabel6.setIcon(new ImageIcon(getClass().getResource("img2/auto3.jpeg")));
       }else if(res2==3){
           jLabel6.setIcon(new ImageIcon(getClass().getResource("img2/auto4.jpeg")));
       }else if(res2==4){
           jLabel6.setIcon(new ImageIcon(getClass().getResource("img2/auto5.jpeg")));
       }else if(res2==5){
           jLabel6.setIcon(new ImageIcon(getClass().getResource("img2/auto6.jpeg")));
       }else if(res2==6){
           jLabel6.setIcon(new ImageIcon(getClass().getResource("img2/auto7.jpeg")));
       }else if(res2==7){
           jLabel6.setIcon(new ImageIcon(getClass().getResource("img2/auto8.jpeg")));
       }else if(res2==8){
           jLabel6.setIcon(new ImageIcon(getClass().getResource("img2/auto9.jpeg")));
       }else if(res2==9){
           jLabel6.setIcon(new ImageIcon(getClass().getResource("img2/auto10.jpeg")));
       }else if(res2==10){
           jLabel6.setIcon(new ImageIcon(getClass().getResource("img2/auto11.jpeg")));
       }else if(res2==11){
           jLabel6.setIcon(new ImageIcon(getClass().getResource("img2/auto12.jpeg")));
       }
        System.out.println("");
        int res3 = (int) (autos.nextDouble()* 12);
       if(res3==0){
           jLabel7.setIcon(new ImageIcon(getClass().getResource("img3/auto1.jpeg")));
       } else if(res3==1){
           jLabel7.setIcon(new ImageIcon(getClass().getResource("img3/auto2.jpeg")));
       }else if(res3==2){
           jLabel7.setIcon(new ImageIcon(getClass().getResource("img3/auto3.jpeg")));
       }else if(res3==3){
           jLabel7.setIcon(new ImageIcon(getClass().getResource("img3/auto4.jpeg")));
       }else if(res3==4){
           jLabel7.setIcon(new ImageIcon(getClass().getResource("img3/auto5.jpeg")));
       }else if(res3==5){
           jLabel7.setIcon(new ImageIcon(getClass().getResource("img3/auto6.jpeg")));
       }else if(res3==6){
           jLabel7.setIcon(new ImageIcon(getClass().getResource("img3/auto7.jpeg")));
       }else if(res3==7){
           jLabel7.setIcon(new ImageIcon(getClass().getResource("img3/auto8.jpeg")));
       }else if(res3==8){
           jLabel7.setIcon(new ImageIcon(getClass().getResource("img3/auto9.jpeg")));
       }else if(res3==9){
           jLabel7.setIcon(new ImageIcon(getClass().getResource("img3/auto10.jpeg")));
       }else if(res3==10){
           jLabel7.setIcon(new ImageIcon(getClass().getResource("img3/auto11.jpeg")));
       }else if(res3==11){
           jLabel7.setIcon(new ImageIcon(getClass().getResource("img3/auto12.jpeg")));
       }
        System.out.println("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(autos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(autos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(autos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(autos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new autos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
