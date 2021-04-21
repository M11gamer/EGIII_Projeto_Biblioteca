
package model.layout;

import java.awt.Color;
import java.awt.event.KeyEvent;


public class FrameRetirada extends javax.swing.JFrame {

    public boolean edicao = false;
    public FrameRetirada() {
        initComponents();
        LimpaFormulario();
    }

    public void LimpaFormulario(){
    edicao = false;
    //txtTitulo.requestFocus();
    txtCodigo.setText("");
    txtAluno.setText("");
    txtLivro.setText("");
    txtRetirada.setText("");
    txtEntrega.setText(""); 
    txtSenha.setText("");

    txtCodigo.setEditable(false);
    txtCodigo.setBackground(Color.LIGHT_GRAY);
    txtAluno.requestFocus();
   // LivrosDAO VD = new LivrosDAO();
    //Gera o próximo código da sessão
   // txtCodigo.setText(String.valueOf(VD.max()));    
    
}
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtLivro = new javax.swing.JTextField();
        txtAluno = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtRetirada = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnLivro = new javax.swing.JButton();
        btnAluno = new javax.swing.JButton();
        txtEntrega = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Código Retirada");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 120, 100, 30);

        jLabel2.setText("Aluno");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 160, 40, 30);

        jLabel3.setText("Livro");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 200, 40, 30);

        jLabel4.setText("Data de Retirada");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 240, 100, 30);

        jLabel5.setText("Senha");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 290, 60, 30);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(140, 120, 70, 30);
        getContentPane().add(txtLivro);
        txtLivro.setBounds(100, 200, 273, 30);
        getContentPane().add(txtAluno);
        txtAluno.setBounds(100, 160, 269, 30);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(90, 290, 123, 30);

        txtRetirada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        getContentPane().add(txtRetirada);
        txtRetirada.setBounds(150, 240, 100, 30);

        jLabel6.setText("Data de Entrega");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 240, 90, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_cancelar.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 370, 117, 39);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarKeyPressed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(230, 370, 117, 39);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_sair_int.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(370, 370, 117, 39);

        btnLivro.setText("...");
        getContentPane().add(btnLivro);
        btnLivro.setBounds(380, 200, 45, 30);

        btnAluno.setText("...");
        getContentPane().add(btnAluno);
        btnAluno.setBounds(380, 160, 45, 30);

        txtEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        getContentPane().add(txtEntrega);
        txtEntrega.setBounds(360, 240, 100, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_retirardalivros.png"))); // NOI18N
        jLabel7.setText("Emprestimo de Livros ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(165, 33, 240, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_telas.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(-6, -6, 600, 510);

        setSize(new java.awt.Dimension(611, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LimpaFormulario();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnSalvar.doClick();
    }//GEN-LAST:event_btnSalvarKeyPressed

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
            java.util.logging.Logger.getLogger(FrameRetirada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRetirada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRetirada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRetirada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRetirada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAluno;
    private javax.swing.JButton btnLivro;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAluno;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtEntrega;
    private javax.swing.JTextField txtLivro;
    private javax.swing.JFormattedTextField txtRetirada;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
