
package model.layout;


public class FrameRenovar extends javax.swing.JFrame {

    public boolean edicao = false;
    private FramePesquisaLC FP;
    public FrameRenovar() {
        FP = new FramePesquisaLC(this, true);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAluno = new javax.swing.JTextField();
        txtLivro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRetirada = new javax.swing.JFormattedTextField();
        txtRenovação = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Aluno");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 160, 50, 30);

        jLabel3.setText("Livro");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 200, 50, 30);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(32, 178, 0, 0);
        getContentPane().add(txtAluno);
        txtAluno.setBounds(87, 161, 183, 30);
        getContentPane().add(txtLivro);
        txtLivro.setBounds(91, 199, 182, 30);

        jLabel6.setText("Número da Retirada");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(36, 120, 130, 30);

        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(150, 121, 106, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_cancelar.png"))); // NOI18N
        jButton1.setText("Cancelar");
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 374, 117, 39);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_salvar.png"))); // NOI18N
        jButton2.setText("Salvar");
        getContentPane().add(jButton2);
        jButton2.setBounds(225, 374, 117, 39);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_sair_int.png"))); // NOI18N
        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(360, 374, 117, 39);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_renovar.png"))); // NOI18N
        jLabel7.setText("Renovação");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(182, 28, 139, 50);

        btnPesquisar.setText("...");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(262, 120, 50, 30);

        jLabel8.setText("Senha");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 310, 60, 30);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(90, 313, 183, 30);

        jLabel1.setText("Data de Retirada");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 240, 110, 30);

        jLabel5.setText("Renovação");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 280, 100, 30);

        txtRetirada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        getContentPane().add(txtRetirada);
        txtRetirada.setBounds(150, 237, 123, 30);

        txtRenovação.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        getContentPane().add(txtRenovação);
        txtRenovação.setBounds(122, 275, 123, 30);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(62, 28, 0, 0);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_telas.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 600, 500);

        setSize(new java.awt.Dimension(616, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
         FP.Objeto = "Emprestimo";
        FP.setLocationRelativeTo(null);
        FP.setVisible(true);
        
        //Busca o código retornado pelo frame de pesquisa
        int codigo = FP.getCodigo();
        if (codigo > 0) {
            txtCodigo.setText(String.valueOf(codigo));
            txtAluno.setText(String.valueOf(FP.getNome()));
            txtCodigoFocusLost(null);
            txtRenovação.requestFocus();
        } else txtCodigo.requestFocus();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoFocusLost

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
            java.util.logging.Logger.getLogger(FrameRenovar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRenovar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRenovar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRenovar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRenovar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAluno;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtLivro;
    private javax.swing.JFormattedTextField txtRenovação;
    private javax.swing.JFormattedTextField txtRetirada;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
