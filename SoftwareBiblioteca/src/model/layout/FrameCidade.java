package model.layout;

import java.awt.Color;
import java.awt.event.KeyEvent;
import model.bean.Cidade;
import javax.swing.JOptionPane;
import model.DAO.CidadeDAO;



public class FrameCidade extends javax.swing.JFrame {

   public boolean edicao = false;
    public FrameCidade() {
        initComponents();
        LimpaFormulario();
    }

      public void LimpaFormulario(){
        
        edicao = false;
        
        txtCodigo.setText("");
        txtNome.setText("");
        txtUF.setText("");
        
        txtCodigo.setEditable(false);
        txtCodigo.setBackground(Color.LIGHT_GRAY);
        txtNome.requestFocus();
        CidadeDAO VD = new CidadeDAO();
        //Gera o próximo código da sessão
        txtCodigo.setText(String.valueOf(VD.max()));
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtUF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(106, 171, 81, 30);

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(105, 210, 219, 30);

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(57, 213, 50, 20);

        jLabel3.setText("UF");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 251, 20, 20);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        btnSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarKeyPressed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(232, 360, 117, 39);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        btnCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelarKeyPressed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(105, 360, 117, 39);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_sair_int.png"))); // NOI18N
        btnSair.setText("Voltar");
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
        btnSair.setBounds(367, 360, 117, 39);

        txtUF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUFKeyPressed(evt);
            }
        });
        getContentPane().add(txtUF);
        txtUF.setBounds(105, 248, 69, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/iconecadatrocidade.png"))); // NOI18N
        jLabel4.setText("Cadastro de Cidades");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 30, 225, 60);

        jLabel8.setText("Código ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 174, 50, 20);

        btnPesquisar.setText("...");
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(200, 170, 60, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_telas.png"))); // NOI18N
        jLabel7.setText(" ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 600, 500);

        setSize(new java.awt.Dimension(616, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
     if(txtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o Código da Cidade!");
             txtCodigo.requestFocus();
        }  else if (txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o Nome da Cidade!");
             txtNome.requestFocus();
        } else if (txtUF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe a Unidade Federal");
             txtUF.requestFocus();
        
             }else{
            
            Cidade C = new Cidade();
            CidadeDAO DAO = new CidadeDAO();
            C.setCidade_id(Integer.parseInt(txtCodigo.getText()));
            C.setCidade_nome(txtNome.getText());
            C.setCidade_uf(txtUF.getText());
            
            
            if(!edicao){
                DAO.create(C);
            }else{
                DAO.update(C);
                
            }
          
         
          LimpaFormulario();
        
        }
                                          

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       LimpaFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtUF.requestFocus();
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtUFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnSalvar.requestFocus();
    }//GEN-LAST:event_txtUFKeyPressed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnSalvar.doClick();
    }//GEN-LAST:event_btnSalvarKeyPressed

    private void btnSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSairKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnSair.doClick();
    }//GEN-LAST:event_btnSairKeyPressed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnCancelar.doClick();
    }//GEN-LAST:event_btnCancelarKeyPressed

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
            java.util.logging.Logger.getLogger(Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables
}
