
package model.layout;


public class FramePesquisaButon extends javax.swing.JFrame {

    private FramePesquisaLC FP;
    public FramePesquisaButon() {
        initComponents();
        FP = new FramePesquisaLC(this, true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAluno = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnCidade = new javax.swing.JButton();
        btnLivros = new javax.swing.JButton();
        btnSessoes = new javax.swing.JButton();
        btnMapas = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        btnAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_clientes.png"))); // NOI18N
        btnAluno.setText("Pesquisa de Alunos");
        btnAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAluno);
        btnAluno.setBounds(40, 120, 230, 70);

        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_user.png"))); // NOI18N
        btnUsuarios.setText("Pesquisa de Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuarios);
        btnUsuarios.setBounds(50, 270, 230, 70);

        btnCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_cidade.png"))); // NOI18N
        btnCidade.setText("Pesquisa de Cidades");
        btnCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(btnCidade);
        btnCidade.setBounds(320, 270, 230, 70);

        btnLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_livros.png"))); // NOI18N
        btnLivros.setText("Pesquisa de Livros");
        btnLivros.setPreferredSize(new java.awt.Dimension(133, 55));
        btnLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLivrosActionPerformed(evt);
            }
        });
        getContentPane().add(btnLivros);
        btnLivros.setBounds(320, 120, 230, 70);

        btnSessoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_secoes.png"))); // NOI18N
        btnSessoes.setText("Pesquisa de Seções");
        btnSessoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessoesActionPerformed(evt);
            }
        });
        getContentPane().add(btnSessoes);
        btnSessoes.setBounds(590, 270, 210, 70);

        btnMapas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_mapa_botao.png"))); // NOI18N
        btnMapas.setText("Pesquisa de Mapas");
        btnMapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapasActionPerformed(evt);
            }
        });
        getContentPane().add(btnMapas);
        btnMapas.setBounds(600, 120, 210, 70);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_sair_int.png"))); // NOI18N
        jButton7.setText("Voltar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(40, 430, 140, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_pesquisa.png"))); // NOI18N
        jLabel1.setText("Pesquisas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 10, 160, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_fundo_menor.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 900, 500);

        setSize(new java.awt.Dimension(916, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlunoActionPerformed
        FP.Objeto = "Cliente";
        FP.setLocationRelativeTo(null);
        FP.HideButton();
        FP.setVisible(true);
    }//GEN-LAST:event_btnAlunoActionPerformed

    private void btnCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCidadeActionPerformed
        FP.Objeto = "Cidade";
        FP.setLocationRelativeTo(null);
        FP.HideButton();
        FP.setVisible(true);
    }//GEN-LAST:event_btnCidadeActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        FP.Objeto = "Usuario";
        FP.setLocationRelativeTo(null);
        FP.HideButton();
        FP.setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLivrosActionPerformed
        FP.Objeto = "Livro";
        FP.setLocationRelativeTo(null);
        FP.HideButton();
        FP.setVisible(true);
    }//GEN-LAST:event_btnLivrosActionPerformed

    private void btnSessoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessoesActionPerformed
        FP.Objeto = "Sessao";
        FP.setLocationRelativeTo(null);
        FP.HideButton();
        FP.setVisible(true);
    }//GEN-LAST:event_btnSessoesActionPerformed

    private void btnMapasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapasActionPerformed
        FP.Objeto = "Mapa";
        FP.setLocationRelativeTo(null);
        FP.HideButton();
        FP.setVisible(true);
    }//GEN-LAST:event_btnMapasActionPerformed

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
            java.util.logging.Logger.getLogger(FramePesquisaButon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaButon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaButon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaButon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePesquisaButon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAluno;
    private javax.swing.JButton btnCidade;
    private javax.swing.JButton btnLivros;
    private javax.swing.JButton btnMapas;
    private javax.swing.JButton btnSessoes;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
