
package model.layout;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.DAO.ClienteDAO;
import model.DAO.LivrosDAO;
import model.DAO.LocacaoDAO;
import model.bean.Cliente;
import model.bean.Locacao;



public class FrameRetirada extends javax.swing.JFrame {

  
    public boolean edicao = false;
    private FramePesquisaLC FP;
    public FrameRetirada() {
        FP = new FramePesquisaLC(this, true);
        initComponents();
        LimpaFormulario();
    }

    public void LimpaFormulario(){
    edicao = false;
    txtCodigo.setText("");
    txtAlunoNome.setText("");
    txtCodigoLivro.setText("");
    txtCodigoAluno.setText("");
    txtLivroNome.setText(""); 
    txtSenha.setText("");

    // Coloca a data automaticamente, e no devolução estende para 7 dias
    DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    var result = new Date();
    result.setDate(date.getDate() + 7);
    txtRetirada.setText(String.valueOf(dateformat.format(date)));
    txtEntrega.setText(String.valueOf(dateformat.format(result))); 
    txtRetirada.setBackground(Color.LIGHT_GRAY);
    txtRetirada.setEditable(false);
    
    
    
    txtCodigo.setEditable(false);
    txtCodigo.setBackground(Color.LIGHT_GRAY);
    btnSalvar.setEnabled(true);
    btnSalvar.setBackground(Color.LIGHT_GRAY);
    txtSenha.setEditable(true);
    txtSenha.setBackground(Color.WHITE);
    txtAlunoNome.requestFocus();
   
    LocacaoDAO VD = new LocacaoDAO();
    //Gera o próximo código da sessão
    txtCodigo.setText(String.valueOf(VD.max()));    
    
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
        txtLivroNome = new javax.swing.JTextField();
        txtAlunoNome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtRetirada = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnLivro = new javax.swing.JButton();
        btnAluno = new javax.swing.JButton();
        txtEntrega = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoLivro = new javax.swing.JTextField();
        txtCodigoAluno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Código Retirada   ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 120, 100, 30);

        jLabel2.setText("Aluno");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 200, 40, 30);

        jLabel3.setText("Livro");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 280, 40, 30);

        jLabel4.setText("Data de Retirada  ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 320, 100, 30);

        jLabel5.setText("Senha");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 360, 60, 30);

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
        txtCodigo.setBounds(130, 120, 80, 30);
        getContentPane().add(txtLivroNome);
        txtLivroNome.setBounds(80, 280, 290, 30);
        getContentPane().add(txtAlunoNome);
        txtAlunoNome.setBounds(80, 200, 290, 30);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(80, 360, 123, 30);

        try {
            txtRetirada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRetiradaActionPerformed(evt);
            }
        });
        txtRetirada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRetiradaKeyPressed(evt);
            }
        });
        getContentPane().add(txtRetirada);
        txtRetirada.setBounds(140, 320, 100, 30);

        jLabel6.setText("Data de Entrega");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 320, 90, 30);

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
        btnCancelar.setBounds(160, 430, 117, 39);

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
        btnSalvar.setBounds(300, 430, 117, 39);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_sair_int.png"))); // NOI18N
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
        btnSair.setBounds(440, 430, 117, 39);

        btnLivro.setText("...");
        btnLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLivroActionPerformed(evt);
            }
        });
        btnLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLivroKeyPressed(evt);
            }
        });
        getContentPane().add(btnLivro);
        btnLivro.setBounds(200, 240, 45, 30);

        btnAluno.setText("...");
        btnAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlunoActionPerformed(evt);
            }
        });
        btnAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAlunoKeyPressed(evt);
            }
        });
        getContentPane().add(btnAluno);
        btnAluno.setBounds(200, 160, 45, 30);

        try {
            txtEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEntregaKeyPressed(evt);
            }
        });
        getContentPane().add(txtEntrega);
        txtEntrega.setBounds(360, 320, 100, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_retirardalivros.png"))); // NOI18N
        jLabel7.setText("Emprestimo de Livros ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(165, 33, 240, 60);
        getContentPane().add(txtCodigoLivro);
        txtCodigoLivro.setBounds(120, 240, 70, 30);
        getContentPane().add(txtCodigoAluno);
        txtCodigoAluno.setBounds(120, 160, 70, 30);

        jLabel9.setText("Código Livro  ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 240, 80, 30);

        jLabel10.setText("Código Aluno");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 160, 90, 30);

        btnPesquisar.setText("...");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(220, 123, 60, 30);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(20, 430, 120, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_telas.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(-6, -6, 600, 510);

        setSize(new java.awt.Dimension(611, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LimpaFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnSalvar.doClick();
    }//GEN-LAST:event_btnSalvarKeyPressed

    private void btnSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSairKeyPressed
      if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnSair.doClick();
    }//GEN-LAST:event_btnSairKeyPressed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
      if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnCancelar.doClick();
    }//GEN-LAST:event_btnCancelarKeyPressed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnAluno.requestFocus();
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRetiradaActionPerformed
       
    }//GEN-LAST:event_txtRetiradaActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlunoActionPerformed
       FP.Objeto = "Cliente";
        FP.setLocationRelativeTo(null);
        FP.setVisible(true);
        
        //Busca o código retornado pelo frame de pesquisa
        int codigo = FP.getCodigo();
        String nome = FP.getNome();
        if (codigo > 0) {
            txtCodigoAluno.setText(String.valueOf(codigo));
            txtAlunoNome.setText(nome);
            txtAlunoNome.requestFocus();
     
        } else txtLivroNome.requestFocus(); 
    }//GEN-LAST:event_btnAlunoActionPerformed

    private void btnLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLivroActionPerformed
        FP.Objeto = "Livro";
        FP.setLocationRelativeTo(null);
        FP.setVisible(true);
        
        //Busca o código retornado pelo frame de pesquisa
        int codigo = FP.getCodigo();
        String nome = FP.getNome();
        if (codigo > 0) {
            txtCodigoLivro.setText(String.valueOf(codigo));
            txtLivroNome.setText(nome);
            txtRetirada.requestFocus();
     
        } else txtRetirada.requestFocus(); 
    }//GEN-LAST:event_btnLivroActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o Código!");
            txtCodigo.requestFocus();
        } else if (txtCodigoAluno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o Código do Aluno!");
            txtCodigoAluno.requestFocus();
        } else if (txtCodigoLivro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o Código do Livro!");
            txtCodigoLivro.requestFocus();
        } else if (txtRetirada.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe a Data do Empréstimo!");
            txtRetirada.requestFocus();
        } else if (txtEntrega.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe a Data de Entrega!");
            txtEntrega.requestFocus();
        } else if (txtSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe a Senha!");
            txtSenha.requestFocus();
        
        } else {
            //Formulário validado
            String senha = "";
            Locacao L = new Locacao();
            LocacaoDAO DAO = new LocacaoDAO();
            ClienteDAO CDAO = new ClienteDAO();

            L.setLocacao_id(Integer.parseInt(txtCodigo.getText()));
            L.setLocacao_dataretirada(txtRetirada.getText());
            L.setLocacao_dataentrega(txtEntrega.getText());
            L.setLocacao_livro(Integer.parseInt(txtCodigoLivro.getText()));
            L.setLocacao_cliente(Integer.parseInt(txtCodigoAluno.getText()));
            L.setLocacao_situacao(2);
            senha = CDAO.busca_senha(Integer.parseInt(txtCodigoAluno.getText()));
            String senha_campo = txtSenha.getText();
            if(senha.equals(senha_campo)){
                DAO.create(L);
                LimpaFormulario();
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Senha Incorreta!");
                txtSenha.setText("");
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAlunoKeyPressed
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnAluno.doClick();
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnLivro.requestFocus();
    }//GEN-LAST:event_btnAlunoKeyPressed

    private void btnLivroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLivroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnLivro.doClick();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtRetirada.requestFocus();
    }//GEN-LAST:event_btnLivroKeyPressed

    private void txtRetiradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRetiradaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtEntrega.requestFocus();
    }//GEN-LAST:event_txtRetiradaKeyPressed

    private void txtEntregaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntregaKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtSenha.requestFocus();
    }//GEN-LAST:event_txtEntregaKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
          if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnSalvar.requestFocus();
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        FP.Objeto = "Emprestimo";
        FP.setLocationRelativeTo(null);
        FP.setVisible(true);
        
        //Busca o código retornado pelo frame de pesquisa
        int codigo = FP.getCodigo();
        if (codigo > 0) {
            txtCodigo.setText(String.valueOf(codigo));
            txtCodigoFocusLost(null);
            txtAlunoNome.requestFocus();
        } else txtCodigo.requestFocus();
        
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
     int codigo = 0;
        try {
            codigo = Integer.parseInt(txtCodigo.getText());
            Locacao LO = new Locacao();
            LocacaoDAO DAO = new LocacaoDAO();
            LO.setLocacao_id(codigo);
            
            Locacao LOC = new Locacao();
            LOC = DAO.busca(LO); //Retorna um objeto com todos os dados do cliente
            
            if (!LOC.getLocacao_dataretirada().equals("")) {
                edicao = true;
                txtCodigo.setEditable(false);
                txtCodigo.setBackground(Color.LIGHT_GRAY);
                btnSalvar.setEnabled(false);
                btnSalvar.setBackground(Color.GRAY);
                txtSenha.setEditable(false);
                txtSenha.setBackground(Color.LIGHT_GRAY);
                
                //Atualizando o formulário com os dados do cliente
                txtCodigoAluno.setText(String.valueOf(LOC.getLocacao_cliente()));
                txtCodigoLivro.setText(String.valueOf(LOC.getLocacao_livro()));
                txtEntrega.setText(LOC.getLocacao_dataentrega());
                txtRetirada.setText(LOC.getLocacao_dataretirada());
                
                int codigo_aluno = Integer.parseInt(txtCodigoAluno.getText());
                int codigo_livro = Integer.parseInt(txtCodigoLivro.getText());
                
                ClienteDAO CDAO = new ClienteDAO();
                LivrosDAO LDAO = new LivrosDAO();
                
                txtAlunoNome.setText(CDAO.busca_id(codigo_aluno));
                txtLivroNome.setText(LDAO.busca_id(codigo_livro));
               
            } else {
                //Cliente não localizado
                edicao = false;

                txtCodigo.setText("");
                txtAlunoNome.setText("");
                txtCodigoLivro.setText("");
                txtCodigoAluno.setText("");
                txtLivroNome.setText("");
                txtRetirada.setText("");
                txtEntrega.setText(""); 
                txtSenha.setText("");
                txtCodigo.setEditable(true);
                txtCodigo.setBackground(Color.WHITE);
                btnSalvar.setEnabled(true);
                btnSalvar.setBackground(Color.WHITE);
            }
            
        } catch (NumberFormatException | NullPointerException ex) {
            codigo = 0;
            //JOptionPane.showMessageDialog(null, "Erro de código: " + ex);
        }
    }//GEN-LAST:event_txtCodigoFocusLost

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
      if(edicao == true){
            Locacao L = new Locacao();
            LocacaoDAO DAO= new LocacaoDAO();
            L.setLocacao_id(Integer.parseInt(txtCodigo.getText()));
            DAO.delete(L);
            
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLivro;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
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
    private javax.swing.JTextField txtAlunoNome;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoAluno;
    private javax.swing.JTextField txtCodigoLivro;
    private javax.swing.JFormattedTextField txtEntrega;
    private javax.swing.JTextField txtLivroNome;
    private javax.swing.JFormattedTextField txtRetirada;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
