/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author PuddinAPX
 */
public class HomeVIEW extends javax.swing.JFrame {

    /**
     * Creates new form HomeVIEW
     */
    public HomeVIEW() {
        initComponents();
        botoes();
        this.setLocationRelativeTo(null);
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
        btnHOME = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLIVROS = new javax.swing.JButton();
        btnCADASTRO = new javax.swing.JButton();
        btnEMPRESTIMO = new javax.swing.JButton();
        btnDEVOLUCAO = new javax.swing.JButton();
        btnHOME1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHOME.setBackground(new java.awt.Color(0, 0, 0));
        btnHOME.setBorder(null);
        btnHOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHOMEActionPerformed(evt);
            }
        });
        jPanel1.add(btnHOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 89, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIBLIOTECH");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        btnLIVROS.setBackground(new java.awt.Color(0, 0, 0));
        btnLIVROS.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnLIVROS.setForeground(new java.awt.Color(255, 255, 255));
        btnLIVROS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/livro.png"))); // NOI18N
        btnLIVROS.setText("  Livros");
        btnLIVROS.setBorder(null);
        btnLIVROS.setPreferredSize(new java.awt.Dimension(57, 50));
        btnLIVROS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLIVROSActionPerformed(evt);
            }
        });
        jPanel1.add(btnLIVROS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 221, -1));

        btnCADASTRO.setBackground(new java.awt.Color(0, 0, 0));
        btnCADASTRO.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCADASTRO.setForeground(new java.awt.Color(255, 255, 255));
        btnCADASTRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/conecte-se (1) (1).png"))); // NOI18N
        btnCADASTRO.setText("Cadastrar");
        btnCADASTRO.setBorder(null);
        btnCADASTRO.setPreferredSize(new java.awt.Dimension(57, 50));
        btnCADASTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCADASTROActionPerformed(evt);
            }
        });
        jPanel1.add(btnCADASTRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 221, -1));

        btnEMPRESTIMO.setBackground(new java.awt.Color(0, 0, 0));
        btnEMPRESTIMO.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEMPRESTIMO.setForeground(new java.awt.Color(255, 255, 255));
        btnEMPRESTIMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/emprestimo.png"))); // NOI18N
        btnEMPRESTIMO.setText("Emprestar");
        btnEMPRESTIMO.setBorder(null);
        btnEMPRESTIMO.setPreferredSize(new java.awt.Dimension(57, 50));
        btnEMPRESTIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEMPRESTIMOActionPerformed(evt);
            }
        });
        jPanel1.add(btnEMPRESTIMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 221, -1));

        btnDEVOLUCAO.setBackground(new java.awt.Color(0, 0, 0));
        btnDEVOLUCAO.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnDEVOLUCAO.setForeground(new java.awt.Color(255, 255, 255));
        btnDEVOLUCAO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/devolucao.png"))); // NOI18N
        btnDEVOLUCAO.setText(" Devolver");
        btnDEVOLUCAO.setBorder(null);
        btnDEVOLUCAO.setPreferredSize(new java.awt.Dimension(57, 50));
        btnDEVOLUCAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDEVOLUCAOActionPerformed(evt);
            }
        });
        jPanel1.add(btnDEVOLUCAO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 268, 221, -1));

        btnHOME1.setBackground(new java.awt.Color(0, 0, 0));
        btnHOME1.setForeground(new java.awt.Color(0, 0, 0));
        btnHOME1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pinguin.png (2).png"))); // NOI18N
        btnHOME1.setBorder(null);
        btnHOME1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHOME1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHOME1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 89, 86));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel41.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel41.setText("Bem vindo(a) ao Bibliotech!");

        jLabel40.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel40.setText("Clique nos ícones á esquerda para ir a tela que solicita.");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/inicio.png"))); // NOI18N
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(273, 273, 273))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(234, 234, 234))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(jLabel3)
                    .addContainerGap(670, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(jLabel3)
                    .addContainerGap(500, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 940, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHOMEActionPerformed

    private void btnLIVROSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLIVROSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLIVROSActionPerformed

    private void btnCADASTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCADASTROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCADASTROActionPerformed

    private void btnEMPRESTIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEMPRESTIMOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEMPRESTIMOActionPerformed

    private void btnDEVOLUCAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDEVOLUCAOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDEVOLUCAOActionPerformed

    private void btnHOME1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHOME1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHOME1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCADASTRO;
    private javax.swing.JButton btnDEVOLUCAO;
    private javax.swing.JButton btnEMPRESTIMO;
    private javax.swing.JButton btnHOME;
    private javax.swing.JButton btnHOME1;
    private javax.swing.JButton btnLIVROS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    
    public void botoes(){
        JButton [] btns = {btnCADASTRO,btnDEVOLUCAO,btnEMPRESTIMO,btnHOME1,btnLIVROS};
         for (JButton btn : btns){
            btn.setBackground(new Color (0,0,0));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent me) {
                    }

                @Override
                public void mousePressed(MouseEvent me) {
                    }

                

                @Override
                public void mouseEntered(MouseEvent me) {
                    btn.setBackground(new Color(28,28,28));
                    }

                @Override
                public void mouseExited(MouseEvent me) {
                    btn.setBackground(new Color(0,0,0));
                    }

                @Override
                public void mouseReleased(MouseEvent me) {
                    }
            });
        }

        btnEMPRESTIMO.addActionListener((e)->{
            this.setVisible(false);
            new EmprestimoVIEW();
        });
        btnDEVOLUCAO.addActionListener((e)->{
            this.setVisible(false);
            new DevolucaoVIEW();
        });
        btnLIVROS.addActionListener((e)->{
            this.setVisible(false);
            new LivrosVIEW();
        });
        btnCADASTRO.addActionListener((e)->{
            this.setVisible(false);
            new CadastroVIEW();
        });
        setVisible(true);
    }
}
