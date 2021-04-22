
package model.layout;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.DAO.CidadeDAO;
import model.DAO.ClienteDAO;
import model.bean.Cidade;
import model.bean.Cliente;


public class FrameCliente extends javax.swing.JFrame {

    public boolean edicao = false;
    private FramePesquisa FP;
    
    public FrameCliente() {
        initComponents();
        
        FP = new FramePesquisa(this, true);
        populaCidade();
        LimpaFormulario();
        setLocationRelativeTo(null);
        
        

    }
     public void selecionarCidade(int cod) {
        for(int i = 0; i < txtCidade.getItemCount(); i++) {
            Cidade Cid = (Cidade)txtCidade.getItemAt(i);
            if (Cid.getCidade_id() == cod) {
                txtCidade.setSelectedIndex(i);
                return;
            }
        }
    }
 
 
    public void LimpaFormulario(){
    edicao = false;
    txtCodigo.setText("");
    txtNome.setText("");
    txtCPF.setText("");
    txtRG.setText("");
    txtTelefone.setText(""); 
    txtDescricao.setText("");
    txtSenha.setText("");
    txtCidade.setSelectedIndex(0);
    

    txtCodigo.setEditable(false);
    txtCodigo.setBackground(Color.LIGHT_GRAY);
    txtNome.requestFocus();    
  
    ClienteDAO VD = new ClienteDAO();
    //Gera o próximo código da sessão
    txtCodigo.setText(String.valueOf(VD.max()));
        
    }
    
    public void populaCidade(){
        
        CidadeDAO C = new CidadeDAO();
        for(Cidade c: C.read()) {
            txtCidade.addItem(c);
        }
    }
    
     
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        txtRG = new javax.swing.JTextField();
        txtCidade = new javax.swing.JComboBox<>();
        txtSenha = new javax.swing.JPasswordField();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(80, 80, 80, 30);

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(80, 120, 355, 30);

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 120, 40, 20);

        jLabel3.setText("CPF");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 160, 30, 20);

        jLabel4.setText("RG");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 160, 20, 20);

        jLabel5.setText("Cidade");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 200, 50, 30);

        jLabel6.setText("Descrição");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 310, 60, 30);

        jLabel7.setText("Telefone");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 200, 60, 20);

        jLabel8.setText("Senha");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 250, 40, 20);

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCPFKeyPressed(evt);
            }
        });
        getContentPane().add(txtCPF);
        txtCPF.setBounds(80, 160, 150, 30);

        txtRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRGKeyPressed(evt);
            }
        });
        getContentPane().add(txtRG);
        txtRG.setBounds(369, 160, 140, 30);

        txtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCidadeKeyPressed(evt);
            }
        });
        getContentPane().add(txtCidade);
        txtCidade.setBounds(80, 200, 190, 30);

        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(80, 240, 149, 30);

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
        btnSair.setBounds(378, 426, 117, 39);

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
        btnSalvar.setBounds(243, 426, 117, 39);

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
        btnCancelar.setBounds(108, 426, 117, 39);

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescricao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 280, 440, 110);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/iconecadastroclientes.png"))); // NOI18N
        jLabel9.setText("Cadastro de Alunos");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(196, 11, 217, 60);

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyPressed(evt);
            }
        });
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(370, 200, 150, 30);

        jLabel10.setText("Codigo ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 80, 50, 20);

        btnPesquisar.setText("...");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(170, 80, 60, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_telas.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-4, -6, 600, 510);

        setSize(new java.awt.Dimension(616, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LimpaFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtCPF.requestFocus();
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtRG.requestFocus();
    }//GEN-LAST:event_txtCPFKeyPressed

    private void txtCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtTelefone.requestFocus();
    }//GEN-LAST:event_txtCidadeKeyPressed

    private void txtRGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRGKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtCidade.requestFocus();
    }//GEN-LAST:event_txtRGKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtDescricao.requestFocus();
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtSenha.requestFocus();
    }//GEN-LAST:event_txtTelefoneKeyPressed

    private void txtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnSalvar.requestFocus();
    }//GEN-LAST:event_txtDescricaoKeyPressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o Código!");
            txtCodigo.requestFocus();
        } else if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o Nome!");
            txtNome.requestFocus();
        } else if (txtCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o CPF!");
            txtCPF.requestFocus();
        } else if (txtRG.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o RG!");
            txtRG.requestFocus();
        } else if (txtTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o CPF!");
            txtTelefone.requestFocus();
        } else if (txtSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o CPF!");
            txtSenha.requestFocus();
        } else if (txtDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o CPF!");
            txtDescricao.requestFocus();
        } else {
            //Formulário validado
            Cliente C = new Cliente();
            ClienteDAO DAO = new ClienteDAO();

            C.setCliente_id(Integer.parseInt(txtCodigo.getText()));
            C.setCliente_nome(txtNome.getText());
            C.setCliente_cpf(txtCPF.getText());
            C.setCliente_rg(txtRG.getText());
            C.setCliente_telefone(txtTelefone.getText());
            C.setCliente_senha(txtSenha.getText());
            C.setCliente_descricao(txtDescricao.getText());

            //Busca o código da cidade selecionada
            Cidade cidade = (Cidade)txtCidade.getSelectedItem();
            C.setCliente_id(cidade.getCidade_id());

            if (!edicao) {
                DAO.create(C);
            } else {
                DAO.update(C);
            }

            LimpaFormulario();
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

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
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtNome.requestFocus();
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        int codigo = 0;
        try {
            codigo = Integer.parseInt(txtCodigo.getText());
            Cliente C = new Cliente();
            ClienteDAO DAO = new ClienteDAO();
            C.setCliente_id(codigo);
            
            Cliente Cli = new Cliente();
            Cli = DAO.busca(C); //Retorna um objeto com todos os dados do cliente
            
            if (!Cli.getCliente_nome().equals("")) {
                edicao = true;
                txtCodigo.setEditable(false);
                txtCodigo.setBackground(Color.GRAY);
                
                //Atualizando o formulário com os dados do cliente
                txtNome.setText(Cli.getCliente_nome());
                txtCPF.setText(Cli.getCliente_cpf());
                txtRG.setText(Cli.getCliente_rg());
                //selecionarCidade(Cli.getCliente_cidade());
                txtTelefone.setText(Cli.getCliente_telefone());
                txtSenha.setText(Cli.getCliente_senha());
                txtDescricao.setText(Cli.getCliente_descricao());
                
            } else {
                //Cliente não localizado
                edicao = false;

                txtCodigo.setText("");
                txtNome.setText("");
                txtCPF.setText("");
                txtRG.setText("");
                txtTelefone.setText(""); 
                txtDescricao.setText("");
                txtSenha.setText("");
                txtCidade.setSelectedIndex(0);
                txtCodigo.setEditable(true);
                txtCodigo.setBackground(Color.WHITE);
            }
            
        } catch (NumberFormatException | NullPointerException ex) {
            codigo = 0;
            //JOptionPane.showMessageDialog(null, "Erro de código: " + ex);
        }
    }//GEN-LAST:event_txtCodigoFocusLost

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        FP.Objeto = "Cliente";
        FP.setLocationRelativeTo(null);
        FP.setVisible(true);
        
        //Busca o código retornado pelo frame de pesquisa
        int codigo = FP.getCodigo();
        if (codigo > 0) {
            txtCodigo.setText(String.valueOf(codigo));
            txtCodigoFocusLost(null);
            txtNome.requestFocus();
        } else txtCodigo.requestFocus();
    }//GEN-LAST:event_btnPesquisarActionPerformed

   
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
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FrameCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JComboBox<Object> txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRG;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
