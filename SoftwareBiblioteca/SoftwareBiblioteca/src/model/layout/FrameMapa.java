
package model.layout;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.DAO.SessoesDAO;
import model.bean.Sessoes;
import model.DAO.MapaDAO;
import model.bean.Mapa;



public class FrameMapa extends javax.swing.JFrame {

    public boolean edicao = false;
    public FrameMapa() {
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
    
  
  public void LimpaFormulario(){
        
        edicao = false;
        
        txtCodigo.setText("");
        txtNome.setText("");
        txtDescricao.setText("");
        txtSessao.setSelectedIndex(0);
        
        txtCodigo.setEditable(false);
        txtCodigo.setBackground(Color.LIGHT_GRAY);
        txtNome.requestFocus();
         MapaDAO VD = new MapaDAO();
        //Gera o próximo código da sessão
        txtCodigo.setText(String.valueOf(VD.max()));
    }
    
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtSessao = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

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
        btnCancelar.setBounds(89, 396, 117, 39);

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
        btnSalvar.setBounds(224, 396, 117, 39);

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
        btnSair.setBounds(359, 396, 117, 39);

        jLabel2.setText("Mapa");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(64, 167, 40, 14);

        jLabel3.setText("Descrição");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 280, 60, 20);

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(115, 126, 80, 30);

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(114, 164, 200, 30);

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescricao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(114, 242, 360, 110);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_mapa.png"))); // NOI18N
        jLabel4.setText("Cadastro de Mapas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(201, 29, 214, 60);

        txtSessao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSessaoKeyPressed(evt);
            }
        });
        getContentPane().add(txtSessao);
        txtSessao.setBounds(114, 202, 120, 30);

        jLabel5.setText("Seção");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(64, 206, 40, 20);

        jLabel6.setText("Código");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(64, 129, 50, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_telas.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 500);

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
        } else if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o Nome do Mapa!");
            txtNome.requestFocus();
        } else if (txtDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe a Decrição!");
            txtDescricao.requestFocus();
        } else {
            //Formulário validado
            Mapa M = new Mapa();
            MapaDAO DAO = new MapaDAO();
            
            M.setMapa_id(Integer.parseInt(txtCodigo.getText()));
            M.setMapa_nome(txtNome.getText());
            M.setMapa_descricao(txtDescricao.getText());
            
            //Busca o código da cidade selecionada
            Sessoes sessoes = (Sessoes)txtSessao.getSelectedItem();
            M.setMapa_sessao(sessoes.getSessoes_num());
 
            if (!edicao) {
                DAO.create(M);
            } else {
                DAO.update(M);
            }
            
            
            LimpaFormulario();
        }
        
        
        
      
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtSessao.requestFocus();
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtSessaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSessaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) txtDescricao.requestFocus();
    }//GEN-LAST:event_txtSessaoKeyPressed

    private void txtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) btnSalvar.requestFocus();
    }//GEN-LAST:event_txtDescricaoKeyPressed

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
            java.util.logging.Logger.getLogger(FrameMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JComboBox<Object> txtSessao;
    // End of variables declaration//GEN-END:variables
}
