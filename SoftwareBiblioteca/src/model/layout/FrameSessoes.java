
package model.layout;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.DAO.SessoesDAO;
import model.bean.Sessoes;




public class FrameSessoes extends javax.swing.JFrame {

    public boolean edicao = false;
    private FramePesquisaLC FP;
    public FrameSessoes() {
        initComponents();
        LimpaFormulario();
        
    }

    
    public void LimpaFormulario(){
        FP = new FramePesquisaLC(this, true);
        edicao = false;
        
        txtCodigo.setText("");
        txtNumSessao.setText("");
        txtDescricao.setText("");
        
        txtCodigo.setEditable(false);
        txtCodigo.setBackground(Color.LIGHT_GRAY);
        txtNumSessao.requestFocus();
        
        SessoesDAO VD = new SessoesDAO();
        //Gera o próximo código da sessão
        txtCodigo.setText(String.valueOf(VD.max()));
        
        
    }
    
    
    
    
    
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNumSessao = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Nº Sessão");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(44, 185, 60, 20);

        jlabel.setText("Descrição");
        getContentPane().add(jlabel);
        jlabel.setBounds(46, 254, 70, 20);

        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(110, 140, 71, 30);

        txtNumSessao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumSessaoKeyPressed(evt);
            }
        });
        getContentPane().add(txtNumSessao);
        txtNumSessao.setBounds(110, 180, 109, 30);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_sair_int.png"))); // NOI18N
        btnSair.setText("Voltar");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(430, 390, 117, 39);

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
        btnSalvar.setBounds(300, 390, 117, 39);

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
        btnCancelar.setBounds(160, 390, 117, 39);

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescricao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 230, 370, 110);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/iconeprateleira.png"))); // NOI18N
        jLabel4.setText("Cadastro de Seções");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 37, 218, 60);

        jLabel3.setText("Codigo ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(46, 147, 50, 20);

        btnPesquisar.setText("...");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(190, 140, 60, 30);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(30, 390, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_telas.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 600, 520);

        setSize(new java.awt.Dimension(616, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       LimpaFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       // Salvar
       if(txtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o Código da Seção!");
             txtCodigo.requestFocus();
        }  else if (txtNumSessao.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o Numero da Seção!");
             txtNumSessao.requestFocus();
        } else if (txtDescricao.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe a Descrição da Seção");
             txtDescricao.requestFocus();
        }else{
            
            Sessoes S = new Sessoes();
            SessoesDAO DAO = new SessoesDAO();
            S.setSessoes_id(Integer.parseInt(txtCodigo.getText()));
            S.setSessoes_num(txtNumSessao.getText());
            S.setSessoes_descricao(txtDescricao.getText());
            
            
            if(!edicao){
                DAO.create(S);
            }else{
                DAO.update(S);
                
            }
          
          
          LimpaFormulario();
        
        }
        
        
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        int codigo = 0;
        try {
            codigo = Integer.parseInt(txtCodigo.getText());
            Sessoes  S = new Sessoes();
            SessoesDAO DAO = new SessoesDAO();
            S.setSessoes_id(codigo);
            
             
            
            Sessoes Ses = new Sessoes();
            Ses = DAO.busca(S); //Retorna um objeto com todos os dados do cliente
            
            if (!Ses.getSessoes_num().equals("")) {
                edicao = true;
                txtCodigo.setEditable(false);
                txtCodigo.setBackground(Color.GRAY);
                
                //Atualizando o formulário com os dados do cliente
                
                txtNumSessao.setText(Ses.getSessoes_num());
                txtDescricao.setText(Ses.getSessoes_descricao());
                
               
            } else {
                //Cliente não localizado
                edicao = false;

                txtCodigo.setText("");
                txtNumSessao.setText("");
                txtDescricao.setText("");
              
                
                txtCodigo.setEditable(true);
                txtCodigo.setBackground(Color.WHITE);
            }
            
        } catch (NumberFormatException | NullPointerException ex) {
            codigo = 0;
            //JOptionPane.showMessageDialog(null, "Erro de código: " + ex);
        }
   
    }//GEN-LAST:event_txtCodigoFocusLost

    private void txtNumSessaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumSessaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtDescricao.requestFocus();
    }//GEN-LAST:event_txtNumSessaoKeyPressed

    private void txtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnSalvar.requestFocus();
    }//GEN-LAST:event_txtDescricaoKeyPressed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnSalvar.doClick();
    }//GEN-LAST:event_btnSalvarKeyPressed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnCancelar.doClick();
    }//GEN-LAST:event_btnCancelarKeyPressed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtNumSessao.requestFocus();
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        FP.Objeto = "Sessao";
        FP.setLocationRelativeTo(null);
        FP.setVisible(true);
        
        //Busca o código retornado pelo frame de pesquisa
        int codigo = FP.getCodigo();
        if (codigo > 0) {
            txtCodigo.setText(String.valueOf(codigo));
            txtCodigoFocusLost(null);
            txtNumSessao.requestFocus();
        } else txtCodigo.requestFocus();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(edicao == true){
            Sessoes S = new Sessoes();
            SessoesDAO DAO= new SessoesDAO();
            S.setSessoes_id(Integer.parseInt(txtCodigo.getText()));
            DAO.delete(S);
            
            LimpaFormulario();
        }else{
            JOptionPane.showMessageDialog(null, "Retorne um valor usando função pesquisa!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Sessoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sessoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sessoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sessoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSessoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNumSessao;
    // End of variables declaration//GEN-END:variables
}
