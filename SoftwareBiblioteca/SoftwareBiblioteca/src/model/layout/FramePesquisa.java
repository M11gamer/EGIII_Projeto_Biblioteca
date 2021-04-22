
package model.layout;
import javax.swing.JOptionPane;
import model.DAO.ClienteDAO;
import model.DAO.LivrosDAO;

import javax.swing.table.DefaultTableModel;


public class FramePesquisa extends javax.swing.JFrame {

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
   
     public FramePesquisa(java.awt.Frame parent, boolean modal) {
       
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
        LivrosDAO PD = new LivrosDAO();
        PD.readPesquisa(nome).forEach((c)->{
            table.addRow(new Object[]{c.getLivros_id(), c.getLivros_titulo()});
        });
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPesquisa = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Pesquisar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 70, 30);

        txtDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescricaoFocusGained(evt);
            }
        });
        getContentPane().add(txtDescricao);
        txtDescricao.setBounds(69, 34, 461, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_retornar_pesquisa.png"))); // NOI18N
        jButton1.setText("Retornar Pesquisa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 90, 155, 39);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_cancelar.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 90, 120, 39);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_sair_int.png"))); // NOI18N
        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(400, 90, 117, 39);

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
        jScrollPane1.setBounds(0, 160, 600, 321);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_telas.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 480);

        setSize(new java.awt.Dimension(616, 515));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (tblPesquisa.getSelectedRow() != -1) {
            setCodigo((int) tblPesquisa.getValueAt(tblPesquisa.getSelectedRow(), 0));
            setNome(String.valueOf(tblPesquisa.getValueAt(tblPesquisa.getSelectedRow(), 1)));
            dispose();
        } else JOptionPane.showMessageDialog(null, "Selecione um registro no grid!");
    }//GEN-LAST:event_jButton1ActionPerformed

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
        //Para pesquisa de Clientes
        if ("Cliente".equals(Objeto)) {
            readClientePesquisa(txtDescricao.getText());
        }
        if ("Produto".equals(Objeto)) {
            readLivrosPesquisa(txtDescricao.getText());
        }        
    }//GEN-LAST:event_txtDescricaoFocusGained

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
            java.util.logging.Logger.getLogger(FramePesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FramePesquisa dialog = new FramePesquisa(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPesquisa;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables
}
