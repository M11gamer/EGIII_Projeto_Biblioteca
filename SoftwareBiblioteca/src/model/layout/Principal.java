
package model.layout;

import java.awt.event.KeyEvent;

public class Principal extends javax.swing.JFrame {

        
    
    public Principal() {
       initComponents();
       setExtendedState(MAXIMIZED_BOTH);
    }

 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        btnRenovar = new javax.swing.JButton();
        btnCadastroCidades = new javax.swing.JButton();
        btnEmprestimoLivros = new javax.swing.JButton();
        btnDevolucaoLivros = new javax.swing.JButton();
        btnPesquisa = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem7.setText("jMenuItem7");

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BiblioTech");
        setBackground(new java.awt.Color(0, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        btnRenovar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_renovar.png"))); // NOI18N
        btnRenovar.setText("Renovar");
        btnRenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenovarActionPerformed(evt);
            }
        });
        btnRenovar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRenovarKeyPressed(evt);
            }
        });
        getContentPane().add(btnRenovar);
        btnRenovar.setBounds(20, 510, 190, 60);

        btnCadastroCidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_cadastros.png"))); // NOI18N
        btnCadastroCidades.setText("Cadastros");
        btnCadastroCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroCidadesActionPerformed(evt);
            }
        });
        btnCadastroCidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCadastroCidadesKeyPressed(evt);
            }
        });
        getContentPane().add(btnCadastroCidades);
        btnCadastroCidades.setBounds(20, 60, 190, 59);

        btnEmprestimoLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_retirada.png"))); // NOI18N
        btnEmprestimoLivros.setText("Emprestimo Livros");
        btnEmprestimoLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestimoLivrosActionPerformed(evt);
            }
        });
        btnEmprestimoLivros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEmprestimoLivrosKeyPressed(evt);
            }
        });
        getContentPane().add(btnEmprestimoLivros);
        btnEmprestimoLivros.setBounds(20, 330, 190, 60);

        btnDevolucaoLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_devolver.png"))); // NOI18N
        btnDevolucaoLivros.setText("Devolução Livros");
        btnDevolucaoLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucaoLivrosActionPerformed(evt);
            }
        });
        btnDevolucaoLivros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDevolucaoLivrosKeyPressed(evt);
            }
        });
        getContentPane().add(btnDevolucaoLivros);
        btnDevolucaoLivros.setBounds(20, 420, 190, 60);

        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_pesquisa.png"))); // NOI18N
        btnPesquisa.setText("Pesquisas");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        btnPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnPesquisaKeyPressed(evt);
            }
        });
        getContentPane().add(btnPesquisa);
        btnPesquisa.setBounds(20, 150, 190, 60);

        btnRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_relatorio.png"))); // NOI18N
        btnRelatorios.setText("Relatórios");
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });
        btnRelatorios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRelatoriosKeyPressed(evt);
            }
        });
        getContentPane().add(btnRelatorios);
        btnRelatorios.setBounds(20, 240, 190, 60);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 2232, 0, 0);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        btnSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSairKeyPressed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(20, 600, 190, 59);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_livros-principal.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(640, 20, 282, 202);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BiblioTech");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(680, 230, 188, 44);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_fundo.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1660, 900);

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenovarActionPerformed
       FrameRenovar FR = new FrameRenovar();
       FR.setLocationRelativeTo(null);
       FR.setVisible(true); 
    }//GEN-LAST:event_btnRenovarActionPerformed

    private void btnCadastroCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroCidadesActionPerformed
       FrameCadastros FC = new FrameCadastros();
       FC.setLocationRelativeTo(null);
       FC.setVisible(true); 
    }//GEN-LAST:event_btnCadastroCidadesActionPerformed

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
       FrameRelatorios FR = new FrameRelatorios();
       FR.setLocationRelativeTo(null);
       FR.setVisible(true); 
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void btnDevolucaoLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucaoLivrosActionPerformed
       FrameDevolver FD = new FrameDevolver();
       FD.setLocationRelativeTo(null);
       FD.setVisible(true);
    }//GEN-LAST:event_btnDevolucaoLivrosActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEmprestimoLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestimoLivrosActionPerformed
        FrameRetirada RF = new FrameRetirada();
        RF.setLocationRelativeTo(null);
        RF.setVisible(true);
    }//GEN-LAST:event_btnEmprestimoLivrosActionPerformed

    private void btnSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSairKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnSair.doClick();
    }//GEN-LAST:event_btnSairKeyPressed

    private void btnCadastroCidadesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCadastroCidadesKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnCadastroCidades.doClick();
    }//GEN-LAST:event_btnCadastroCidadesKeyPressed

    private void btnEmprestimoLivrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEmprestimoLivrosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnEmprestimoLivros.doClick();
    }//GEN-LAST:event_btnEmprestimoLivrosKeyPressed

    private void btnDevolucaoLivrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDevolucaoLivrosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnDevolucaoLivros.doClick();
    }//GEN-LAST:event_btnDevolucaoLivrosKeyPressed

    private void btnRenovarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRenovarKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnRenovar.doClick();
    }//GEN-LAST:event_btnRenovarKeyPressed

    private void btnPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPesquisaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnPesquisa.doClick();
    }//GEN-LAST:event_btnPesquisaKeyPressed

    private void btnRelatoriosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRelatoriosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnRelatorios.doClick();
    }//GEN-LAST:event_btnRelatoriosKeyPressed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        FramePesquisaButon FPB = new FramePesquisaButon();
        FPB.setLocationRelativeTo(null);
        FPB.setVisible(true);
    }//GEN-LAST:event_btnPesquisaActionPerformed

    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroCidades;
    private javax.swing.JButton btnDevolucaoLivros;
    private javax.swing.JButton btnEmprestimoLivros;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnRenovar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
