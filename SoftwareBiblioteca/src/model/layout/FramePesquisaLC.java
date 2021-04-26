
package model.layout;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DAO.CidadeDAO;
import model.DAO.ClienteDAO;
import model.DAO.LivrosDAO;
import model.DAO.LocacaoDAO;
import model.DAO.MapaDAO;
import model.DAO.SessoesDAO;
import model.DAO.UsuarioDAO;

public class FramePesquisaLC extends javax.swing.JDialog {

    public String Objeto;
    private int Codigo;
    private String Nome;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
  
    public FramePesquisaLC(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        txtDescricao.requestFocus();
    }
    public void HideButton() {
        btnRetornarPesquisa.setVisible(false);
    }
    public void ShowButton() {
        btnRetornarPesquisa.setVisible(true);
    }
    
    
    public void readClientePesquisa(String nome){
            DefaultTableModel table = (DefaultTableModel) tblPesquisa.getModel();
            table.setNumRows(0);
            ClienteDAO CD = new ClienteDAO();
            CD.readPesquisa(nome).forEach((c)->{
                table.addRow(new Object[]{c.getCliente_id(), c.getCliente_nome()});
            });
        }
    
     public void readLivrosPesquisa(String nome){
            DefaultTableModel table = (DefaultTableModel) tblPesquisa.getModel();
            table.setNumRows(0);
            LivrosDAO L = new LivrosDAO();
            L.readPesquisa(nome).forEach((l)->{
                table.addRow(new Object[]{l.getLivros_id(), l.getLivros_titulo()});
            });
        }
     
     public void readSessoesPesquisa(String nome){
            DefaultTableModel table = (DefaultTableModel) tblPesquisa.getModel();
            table.setNumRows(0);
            SessoesDAO SS = new SessoesDAO();
            SS.readPesquisa(nome).forEach((s)->{
                table.addRow(new Object[]{s.getSessoes_id(), s.getSessoes_num()});
            });
        }
     
      public void readCidadePesquisa(String nome){
            DefaultTableModel table = (DefaultTableModel) tblPesquisa.getModel();
            table.setNumRows(0);
            CidadeDAO SC = new CidadeDAO();
            SC.readPesquisa(nome).forEach((c)->{
                table.addRow(new Object[]{c.getCidade_id(), c.getCidade_nome()});
            });
        }
     
        public void readUsuarioPesquisa(String nome){
            DefaultTableModel table = (DefaultTableModel) tblPesquisa.getModel();
            table.setNumRows(0);
            UsuarioDAO U = new UsuarioDAO();
            U.readPesquisa(nome).forEach((c)->{
                table.addRow(new Object[]{c.getUsuario_id(), c.getUsuario_nome()});
            });
        }
        public void readMapaPesquisa(String nome){
            DefaultTableModel table = (DefaultTableModel) tblPesquisa.getModel();
            table.setNumRows(0);
            MapaDAO M = new MapaDAO();
            M.readPesquisa(nome).forEach((c)->{
                table.addRow(new Object[]{c.getMapa_id(), c.getMapa_nome()});
            });
        }
    
         public void readEmprestimoPesquisa(String nome){
            DefaultTableModel table = (DefaultTableModel) tblPesquisa.getModel();
            table.setNumRows(0);
            LocacaoDAO Lo = new LocacaoDAO();
            Lo.readPesquisa(nome).forEach((c)->{
                table.addRow(new Object[]{c.getLocacao_id(), c.getLocacao_nome()});
            });
        }
        
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPesquisa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        btnRetornarPesquisa = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        tblPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(tblPesquisa);
        if (tblPesquisa.getColumnModel().getColumnCount() > 0) {
            tblPesquisa.getColumnModel().getColumn(0).setMinWidth(100);
            tblPesquisa.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblPesquisa.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 140, 600, 360);

        jLabel1.setText("Pesquisar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 70, 30);

        txtDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescricaoFocusGained(evt);
            }
        });
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyPressed(evt);
            }
        });
        getContentPane().add(txtDescricao);
        txtDescricao.setBounds(70, 30, 490, 30);

        btnRetornarPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_retornar_pesquisa.png"))); // NOI18N
        btnRetornarPesquisa.setText("Retornar Pesquisa");
        btnRetornarPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarPesquisaActionPerformed(evt);
            }
        });
        btnRetornarPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRetornarPesquisaKeyPressed(evt);
            }
        });
        getContentPane().add(btnRetornarPesquisa);
        btnRetornarPesquisa.setBounds(81, 83, 171, 39);

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
        btnCancelar.setBounds(270, 80, 120, 39);

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
        btnSair.setBounds(410, 80, 109, 39);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_telas.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 610, 520);

        setSize(new java.awt.Dimension(616, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetornarPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarPesquisaActionPerformed
         if (tblPesquisa.getSelectedRow() != -1) {
            setCodigo((int) tblPesquisa.getValueAt(tblPesquisa.getSelectedRow(), 0));
            setNome(String.valueOf(tblPesquisa.getValueAt(tblPesquisa.getSelectedRow(), 1)));
            dispose();
        } else JOptionPane.showMessageDialog(null, "Selecione um registro no grid!");
    }//GEN-LAST:event_btnRetornarPesquisaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        setCodigo(0);
        setNome("");
        dispose();
        ShowButton();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtDescricao.setText("");
        txtDescricao.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtDescricaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoFocusGained
        txtDescricao.setText("");
        //Para pesquisar Clientes
        if ("Cliente".equals(Objeto)) {
            readClientePesquisa(txtDescricao.getText());
        }
        // Para pesquisar Livros
        if ("Livro".equals(Objeto)) {
            readLivrosPesquisa(txtDescricao.getText());
        }        
        //Para pesquisar Sessoes
        if ("Sessao".equals(Objeto)) {
            readSessoesPesquisa(txtDescricao.getText());
        } 
        
        //Para pesquisar Cidade
        if ("Cidade".equals(Objeto)) {
            readCidadePesquisa(txtDescricao.getText());
        } 
       
        //Para pesquisar Usuario
        if ("Usuario".equals(Objeto)) {
            readUsuarioPesquisa(txtDescricao.getText());
        } 
        
        //Para pesquisar Mapa
        if ("Mapa".equals(Objeto)) {
            readMapaPesquisa(txtDescricao.getText());
        } 
        
        //Para pesquisar Emprestimo
        if ("Emprestimo".equals(Objeto)) {
            readEmprestimoPesquisa(txtDescricao.getText());
        }
        
        
    }//GEN-LAST:event_txtDescricaoFocusGained

    private void txtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyPressed
        //Para pesquisar Clientes
        if ("Cliente".equals(Objeto)) {
            readClientePesquisa(txtDescricao.getText());
        }
        // Para pesquisar Livros
        if ("Livro".equals(Objeto)) {
            readLivrosPesquisa(txtDescricao.getText());
        }        
        //Para pesquisar Sessoes
        if ("Sessao".equals(Objeto)) {
            readSessoesPesquisa(txtDescricao.getText());
        } 
        //Para pesquisar Cidade
        if ("Cidade".equals(Objeto)) {
            readCidadePesquisa(txtDescricao.getText());
        } 
        //Para pesquisar Usuario
        if ("Usuario".equals(Objeto)) {
            readUsuarioPesquisa(txtDescricao.getText());
        } 
        //Para pesquisar Mapa
        if ("Mapa".equals(Objeto)) {
            readMapaPesquisa(txtDescricao.getText());
        } 
        //Para pesquisar Emprestimo
        if ("Emprestimo".equals(Objeto)) {
            readEmprestimoPesquisa(txtDescricao.getText());
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnRetornarPesquisa.requestFocus();
    }//GEN-LAST:event_txtDescricaoKeyPressed

    
    private void btnRetornarPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRetornarPesquisaKeyPressed
     if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnRetornarPesquisa.doClick();
    }//GEN-LAST:event_btnRetornarPesquisaKeyPressed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
      if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnCancelar.doClick();
    }//GEN-LAST:event_btnCancelarKeyPressed

    private void btnSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSairKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnSair.doClick();
    }//GEN-LAST:event_btnSairKeyPressed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(FramePesquisaLC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaLC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaLC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaLC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FramePesquisaLC dialog = new FramePesquisaLC(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRetornarPesquisa;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPesquisa;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables
}
