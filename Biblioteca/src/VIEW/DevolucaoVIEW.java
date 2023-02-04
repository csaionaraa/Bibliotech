/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.EmprestimoDAO;
import MODEL.DevolucaoMODEL;
import MODEL.EmprestimoMODEL;
import MODEL.LivrosMODEL;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author PuddinAPX
 */
public class DevolucaoVIEW extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form DevolucaoVIEW
     */
    public DevolucaoVIEW() {
        initComponents();
        Botoes();
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
        jLabel1 = new javax.swing.JLabel();
        btnLIVROS = new javax.swing.JButton();
        btnCADASTRAR = new javax.swing.JButton();
        btnEMPRESTIMO = new javax.swing.JButton();
        btnDEVOLUCAO = new javax.swing.JButton();
        btnHOME = new javax.swing.JButton();
        txtNomeCod = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lista = new javax.swing.JSeparator();
        btnPesquisar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLivro = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtCodLivro = new javax.swing.JTextField();
        btnCONFIRMAR = new javax.swing.JButton();
        lista1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lista2 = new javax.swing.JSeparator();
        lista3 = new javax.swing.JSeparator();
        lista4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnLIVROS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 210, -1));

        btnCADASTRAR.setBackground(new java.awt.Color(0, 0, 0));
        btnCADASTRAR.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCADASTRAR.setForeground(new java.awt.Color(255, 255, 255));
        btnCADASTRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/conecte-se (1) (1).png"))); // NOI18N
        btnCADASTRAR.setText("Cadastrar");
        btnCADASTRAR.setBorder(null);
        btnCADASTRAR.setPreferredSize(new java.awt.Dimension(57, 50));
        btnCADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCADASTRARActionPerformed(evt);
            }
        });
        jPanel1.add(btnCADASTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 210, -1));

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
        jPanel1.add(btnEMPRESTIMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, -1));

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
        jPanel1.add(btnDEVOLUCAO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 268, 210, -1));

        btnHOME.setBackground(new java.awt.Color(0, 0, 0));
        btnHOME.setForeground(new java.awt.Color(0, 0, 0));
        btnHOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pinguin.png (2).png"))); // NOI18N
        btnHOME.setBorder(null);
        btnHOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHOMEActionPerformed(evt);
            }
        });
        jPanel1.add(btnHOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 89, 86));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 600));

        txtNomeCod.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeCod.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel11.setText("Devolver livro");
        txtNomeCod.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 6, 200, 50));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel6.setText("Nome do Livro");
        txtNomeCod.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 95, -1, 30));
        txtNomeCod.add(lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 250, 20));

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lupa-de-pesquisa (2).png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        txtNomeCod.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 125, 45, -1));

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(null);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNomeCod.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 491, 40));

        txtValor.setBackground(new java.awt.Color(255, 255, 255));
        txtValor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtValor.setForeground(new java.awt.Color(0, 0, 0));
        txtValor.setBorder(null);
        txtNomeCod.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 250, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Cliente");
        txtNomeCod.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 110, 30));

        txtLivro.setBackground(new java.awt.Color(255, 255, 255));
        txtLivro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtLivro.setForeground(new java.awt.Color(0, 0, 0));
        txtLivro.setBorder(null);
        txtLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLivroActionPerformed(evt);
            }
        });
        txtNomeCod.add(txtLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 540, 40));

        txtCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtCliente.setBorder(null);
        txtNomeCod.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 540, 40));

        txtCodLivro.setBackground(new java.awt.Color(255, 255, 255));
        txtCodLivro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodLivro.setForeground(new java.awt.Color(0, 0, 0));
        txtCodLivro.setBorder(null);
        txtNomeCod.add(txtCodLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 250, 40));

        btnCONFIRMAR.setText("Confimar devolução");
        btnCONFIRMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCONFIRMARActionPerformed(evt);
            }
        });
        txtNomeCod.add(btnCONFIRMAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 160, 50));
        txtNomeCod.add(lista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 491, 20));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Livro");
        txtNomeCod.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 70, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Cod.Livro");
        txtNomeCod.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 110, 30));
        txtNomeCod.add(lista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 540, 20));
        txtNomeCod.add(lista3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 250, 20));
        txtNomeCod.add(lista4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 540, 20));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Valor");
        txtNomeCod.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 110, 30));

        getContentPane().add(txtNomeCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 940, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLIVROSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLIVROSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLIVROSActionPerformed

    private void btnCADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCADASTRARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCADASTRARActionPerformed

    private void btnEMPRESTIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEMPRESTIMOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEMPRESTIMOActionPerformed

    private void btnDEVOLUCAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDEVOLUCAOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDEVOLUCAOActionPerformed

    private void btnHOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHOMEActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
       ProcurarLivro();
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLivroActionPerformed

    private void btnCONFIRMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCONFIRMARActionPerformed
        Confirmar();
        limparDados();
    }//GEN-LAST:event_btnCONFIRMARActionPerformed

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
            java.util.logging.Logger.getLogger(DevolucaoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DevolucaoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DevolucaoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DevolucaoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DevolucaoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCADASTRAR;
    private javax.swing.JButton btnCONFIRMAR;
    private javax.swing.JButton btnDEVOLUCAO;
    private javax.swing.JButton btnEMPRESTIMO;
    private javax.swing.JButton btnHOME;
    private javax.swing.JButton btnLIVROS;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator lista;
    private javax.swing.JSeparator lista1;
    private javax.swing.JSeparator lista2;
    private javax.swing.JSeparator lista3;
    private javax.swing.JSeparator lista4;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodLivro;
    private javax.swing.JTextField txtLivro;
    protected javax.swing.JTextField txtNome;
    private javax.swing.JPanel txtNomeCod;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
    
    public void Botoes() {
        JButton[] btns = {btnHOME, btnLIVROS, btnCADASTRAR, btnEMPRESTIMO, btnDEVOLUCAO};
        for (JButton btn : btns) {
            btn.setBackground(new Color(0, 0, 0));
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
                    btn.setBackground(new Color(28, 28, 28));
                }

                @Override
                public void mouseExited(MouseEvent me) {
                    btn.setBackground(new Color(0, 0, 0));
                }

                @Override
                public void mouseReleased(MouseEvent me) {
                }
            });
        }
        btnLIVROS.addActionListener((e) -> {
            this.setVisible(false);
            new LivrosVIEW();
        });

        btnEMPRESTIMO.addActionListener((e) -> {
            this.setVisible(false);
            new EmprestimoVIEW();
        });
        btnCADASTRAR.addActionListener((e) -> {
            this.setVisible(false);
            new CadastroVIEW();
        });
        btnHOME.addActionListener((e) -> {
            this.setVisible(false);
            new HomeVIEW();
        });
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        new HomeVIEW();
    }
    
    public void ProcurarLivro(){
        String nomeLivro;
        
        nomeLivro = txtNome.getText();
        
        
        EmprestimoMODEL emprestimoM = new EmprestimoMODEL();
        emprestimoM.setNomeLivro(nomeLivro);
        
        EmprestimoDAO emprestimoD = new EmprestimoDAO();
        emprestimoD.PesquisarLivro(emprestimoM);

        txtLivro.setText(emprestimoM.getNomeLivro());
        txtCliente.setText(emprestimoM.getNomeCliente());
        txtValor.setText(emprestimoM.getValorLivro());
        txtCodLivro.setText(emprestimoM.getCodLivro());
    }
    
    public void Confirmar(){
        String nomeLivro, statusLivro = "Disponivel";
        
        nomeLivro = txtNome.getText();
        
        EmprestimoMODEL emprestimoM = new EmprestimoMODEL();
        emprestimoM.setNomeLivro(nomeLivro);
        
        LivrosMODEL livrosM = new LivrosMODEL();
        livrosM.setStatusLivro(statusLivro);
        
        EmprestimoDAO emprestimoD = new EmprestimoDAO();
        emprestimoD.SetarStauts(emprestimoM,livrosM);
        
        JOptionPane.showMessageDialog(null, "Devolucao confirmada", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void limparDados(){
        txtNome.setText("");
        txtValor.setText("");
        txtLivro.setText("");
        txtCliente.setText("");
        txtCodLivro.setText("");
    }
}
