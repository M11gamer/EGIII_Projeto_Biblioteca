
package model.layout;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DAO.ClienteDAO;
import model.DAO.LivrosDAO;

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
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPesquisa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        btnRetornarPesquisa = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
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
        jScrollPane1.setBounds(0, 140, 590, 360);

        jLabel1.setText("Pesquisar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(27, 31, 60, 30);

        txtDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescricaoFocusGained(evt);
            }
        });
        getContentPane().add(txtDescricao);
        txtDescricao.setBounds(81, 28, 490, 30);

        btnRetornarPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_retornar_pesquisa.png"))); // NOI18N
        btnRetornarPesquisa.setText("Retornar Pesquisa");
        btnRetornarPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetornarPesquisa);
        btnRetornarPesquisa.setBounds(81, 83, 171, 39);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_cancelar.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 83, 109, 39);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_sair_int.png"))); // NOI18N
        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(397, 83, 109, 39);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_telas.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 610, 520);

        setSize(new java.awt.Dimension(606, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetornarPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarPesquisaActionPerformed
         if (tblPesquisa.getSelectedRow() != -1) {
            setCodigo((int) tblPesquisa.getValueAt(tblPesquisa.getSelectedRow(), 0));
            setNome(String.valueOf(tblPesquisa.getValueAt(tblPesquisa.getSelectedRow(), 1)));
            dispose();
        } else JOptionPane.showMessageDialog(null, "Selecione um registro no grid!");
    }//GEN-LAST:event_btnRetornarPesquisaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setCodigo(0);
        setNome("");
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtDescricao.setText("");
        txtDescricao.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

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
    }//GEN-LAST:event_txtDescricaoFocusGained

    
    
    
    
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
    private javax.swing.JButton btnRetornarPesquisa;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPesquisa;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables
}
