
package model.layout;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.DAO.SessoesDAO;
import model.bean.Sessoes;
import model.bean.Livros;
import model.DAO.LivrosDAO;


public class FrameLivros extends javax.swing.JFrame {

     public boolean edicao = false;
     private FramePesquisaLC FP;
    public FrameLivros() {
        FP = new FramePesquisaLC(this, true);
        initComponents();
        populaSessoes();
        LimpaFormulario();
    }
    
     public void populaSessoes() {
         SessoesDAO S = new SessoesDAO();
         for (Sessoes  s: S.read()) {
             txtSessao.addItem(s);
         }
    }
     
     public void selecionarSessao(int cod) {
        for(int i = 0; i < txtSessao.getItemCount(); i++) {
            Sessoes Cid = (Sessoes)txtSessao.getItemAt(i);
            if (Cid.getSessoes_id() == cod) {
                txtSessao.setSelectedIndex(i);
                return;
            }
        }
    }
     
     
    
     public void LimpaFormulario(){
    edicao = false;
    //txtTitulo.requestFocus();
    txtCodigo.setText("");
    txtTitulo.setText("");
    txtAutor.setText("");
    txtQuantidade.setText("");
    txtEditora.setText(""); 
    txtPaginas.setText("");
    txtDescricao.setText("");
    txtSessao.setSelectedIndex(0);

    txtCodigo.setEditable(false);
    txtCodigo.setBackground(Color.LIGHT_GRAY);
    txtTitulo.requestFocus();
    LivrosDAO VD = new LivrosDAO();
    //Gera o próximo código da sessão
    txtCodigo.setText(String.valueOf(VD.max()));    
    
}
     
     
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtEditora = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtPaginas = new javax.swing.JTextField();
        txtSessao = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Titulo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(53, 138, 40, 30);

        jLabel3.setText("Número de Páginas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 250, 120, 30);

        jLabel4.setText("Editora");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(45, 214, 50, 20);

        jLabel5.setText("Autor");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(52, 176, 40, 30);

        jLabel6.setText("Descrição");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 330, 60, 40);

        jLabel7.setText("Exemplares");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 250, 70, 30);

        jLabel8.setText("Seção");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 210, 60, 30);

        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTituloKeyPressed(evt);
            }
        });
        getContentPane().add(txtTitulo);
        txtTitulo.setBounds(90, 135, 459, 30);

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
        txtCodigo.setBounds(90, 97, 94, 30);

        txtEditora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEditoraKeyPressed(evt);
            }
        });
        getContentPane().add(txtEditora);
        txtEditora.setBounds(89, 211, 260, 30);

        txtAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAutorKeyPressed(evt);
            }
        });
        getContentPane().add(txtAutor);
        txtAutor.setBounds(89, 173, 458, 30);

        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyPressed(evt);
            }
        });
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(90, 250, 110, 30);

        txtPaginas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaginasKeyPressed(evt);
            }
        });
        getContentPane().add(txtPaginas);
        txtPaginas.setBounds(420, 250, 120, 30);

        txtSessao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSessaoKeyPressed(evt);
            }
        });
        getContentPane().add(txtSessao);
        txtSessao.setBounds(420, 210, 120, 30);

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescricao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 300, 449, 100);

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
        btnSair.setBounds(380, 430, 117, 39);

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
        btnSalvar.setBounds(250, 430, 117, 39);

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
        btnCancelar.setBounds(110, 430, 117, 39);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/iconecadastrolivros.png"))); // NOI18N
        jLabel9.setText("Cadastro de Livros");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(160, 30, 313, 53);

        jLabel10.setText("Código ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(45, 97, 50, 30);

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 93, 60, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_telas.png"))); // NOI18N
        jLabel1.setText("...");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 610, 540);

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
       if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o Código!");
            txtCodigo.requestFocus();
        } else if (txtTitulo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o Titulo do Livro!");
            txtTitulo.requestFocus();
        } else if (txtAutor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o Autor!");
            txtAutor.requestFocus();
         } else if (txtEditora.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe a Editora!");
            txtEditora.requestFocus();
         } else if (txtQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o número de exemplares!");
            txtQuantidade.requestFocus();
        } else if (txtPaginas.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o número de páginas!");
            txtPaginas.requestFocus();
        } else if (txtDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe a Descrição!");
            txtDescricao.requestFocus();
        } else {
            //Formulário validado
            Livros L = new Livros();
            LivrosDAO DAO = new LivrosDAO();
            
            L.setLivros_id(Integer.parseInt(txtCodigo.getText()));
            L.setLivros_titulo(txtTitulo.getText());
            L.setLivros_autor(txtAutor.getText());
            L.setLivros_editora(txtEditora.getText());
            L.setLivros_quantidade(Integer.parseInt(txtQuantidade.getText()));
            L.setLivros_numpag(Integer.parseInt(txtCodigo.getText()));
            L.setLivros_descricao(txtDescricao.getText());
            
            //Busca o código da cidade selecionada
            Sessoes sessoes = (Sessoes)txtSessao.getSelectedItem();
            L.setLivros_sessao(sessoes.getSessoes_id());
 
            if (!edicao) {
                DAO.create(L);
            } else {
                DAO.update(L);
            }

            LimpaFormulario();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtTituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtAutor.requestFocus();
    }//GEN-LAST:event_txtTituloKeyPressed

    private void txtAutorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtEditora.requestFocus();
    }//GEN-LAST:event_txtAutorKeyPressed

    private void txtEditoraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditoraKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtSessao.requestFocus();
    }//GEN-LAST:event_txtEditoraKeyPressed

    private void txtSessaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSessaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtQuantidade.requestFocus();
    }//GEN-LAST:event_txtSessaoKeyPressed

    private void txtQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtPaginas.requestFocus();
    }//GEN-LAST:event_txtQuantidadeKeyPressed

    private void txtPaginasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaginasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtDescricao.requestFocus();
    }//GEN-LAST:event_txtPaginasKeyPressed

    private void txtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnSalvar.requestFocus();
    }//GEN-LAST:event_txtDescricaoKeyPressed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnSalvar.doClick();
    }//GEN-LAST:event_btnSalvarKeyPressed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtTitulo.requestFocus();
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void btnSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSairKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnSair.doClick();
    }//GEN-LAST:event_btnSairKeyPressed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnCancelar.doClick();
    }//GEN-LAST:event_btnCancelarKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FP.Objeto = "Livro";
        FP.setLocationRelativeTo(null);
        FP.setVisible(true);
        
        //Busca o código retornado pelo frame de pesquisa
        int codigo = FP.getCodigo();
        if (codigo > 0) {
            txtCodigo.setText(String.valueOf(codigo));
            txtAutor.setText(String.valueOf(FP.getNome()));
            txtCodigoFocusLost(null);
            txtTitulo.requestFocus();
        } else txtCodigo.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
      int codigo = 0;
        try {
            codigo = Integer.parseInt(txtCodigo.getText());
            Livros L = new Livros();
            LivrosDAO DAO = new LivrosDAO();
            L.setLivros_id(codigo);
            
            Livros Li = new Livros();
            Li = DAO.busca(L); //Retorna um objeto com todos os dados do cliente
            
            if (!Li.getLivros_titulo().equals("")) {
                edicao = true;
                txtCodigo.setEditable(false);
                txtCodigo.setBackground(Color.LIGHT_GRAY);
                
                //Atualizando o formulário com os dados do cliente
                txtTitulo.setText(L.getLivros_titulo());
                txtAutor.setText(L.getLivros_autor());
                txtEditora.setText(L.getLivros_editora());
                selecionarSessao(L.getLivros_sessao());
                txtQuantidade.setText(String.valueOf(L.getLivros_quantidade()));
                txtPaginas.setText(String.valueOf(L.getLivros_numpag()));
                txtDescricao.setText(L.getLivros_descricao());
                
            } else {
                //Cliente não localizado
                edicao = false;

                txtCodigo.setText("");
                txtTitulo.setText("");
                txtAutor.setText("");
                txtQuantidade.setText("");
                txtEditora.setText(""); 
                txtPaginas.setText("");
                txtDescricao.setText("");
                txtSessao.setSelectedIndex(0);
                txtCodigo.setEditable(true);
                txtCodigo.setBackground(Color.WHITE);
            }
            
        } catch (NumberFormatException | NullPointerException ex) {
            codigo = 0;
            //JOptionPane.showMessageDialog(null, "Erro de código: " + ex);
        }
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
            java.util.logging.Logger.getLogger(FrameLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtEditora;
    private javax.swing.JTextField txtPaginas;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JComboBox<Object> txtSessao;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
