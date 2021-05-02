
package model.layout;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.DAO.ClienteDAO;
import model.DAO.LivrosDAO;
import model.DAO.LocacaoDAO;
import model.bean.Locacao;


public class FrameDevolver extends javax.swing.JFrame {

    public boolean edicao = false;
    private FramePesquisaLC FP;
    public FrameDevolver() {
        FP = new FramePesquisaLC(this, true);
        initComponents();
        LimpaFormulario();
    }
    
    public void LimpaFormulario(){
        edicao = false;
        txtCodigo.setText("");
        txtAluno.setText("");
        txtLivro.setText("");
        txtSenha.setText("");
        txtRetirada.setText("");
        txtRenovação.setText("");
        txtRetirada.setBackground(Color.LIGHT_GRAY);
        txtRetirada.setEditable(false);
        txtRenovação.setBackground(Color.LIGHT_GRAY);
        txtRenovação.setEditable(false);



        txtCodigo.setEditable(false);
        txtCodigo.setBackground(Color.LIGHT_GRAY);
        txtAluno.setEditable(false);
        txtAluno.setBackground(Color.LIGHT_GRAY);
        txtLivro.setEditable(false);
        txtLivro.setBackground(Color.LIGHT_GRAY);
        txtSenha.setEditable(true);
        txtSenha.setBackground(Color.WHITE);
        txtCodigo.requestFocus();  
        btnRenovar.setEnabled(false);


}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAluno = new javax.swing.JTextField();
        txtLivro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnRenovar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRetirada = new javax.swing.JFormattedTextField();
        txtRenovação = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Aluno");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 160, 50, 30);

        jLabel3.setText("Livro");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 160, 50, 30);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(32, 178, 0, 0);
        getContentPane().add(txtAluno);
        txtAluno.setBounds(87, 161, 183, 30);
        getContentPane().add(txtLivro);
        txtLivro.setBounds(320, 160, 182, 30);

        jLabel6.setText("Número da Retirada");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(36, 120, 130, 30);

        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(150, 121, 106, 30);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(110, 350, 117, 39);

        btnRenovar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_retornar_pesquisa.png"))); // NOI18N
        btnRenovar.setText("Devolver");
        btnRenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenovarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRenovar);
        btnRenovar.setBounds(240, 350, 117, 39);

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_sair_int.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(370, 350, 117, 39);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_devolver.png"))); // NOI18N
        jLabel7.setText("Devolução");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(182, 28, 135, 50);

        btnPesquisar.setText("...");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(262, 120, 50, 30);

        jLabel8.setText("Senha");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 280, 60, 30);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(70, 280, 170, 30);

        jLabel1.setText("Data de Retirada");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 200, 110, 30);

        jLabel5.setText("Data de Entrega");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 240, 100, 30);

        try {
            txtRetirada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtRetirada);
        txtRetirada.setBounds(120, 200, 123, 30);

        try {
            txtRenovação.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtRenovação);
        txtRenovação.setBounds(120, 240, 123, 30);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(62, 28, 0, 0);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_telas.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 600, 500);

        setSize(new java.awt.Dimension(616, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        FP.Objeto = "Devolver";
        FP.setLocationRelativeTo(null);
        FP.setVisible(true);
        
        //Busca o código retornado pelo frame de pesquisa
        int codigo = FP.getCodigo();
        if (codigo > 0) {
            txtCodigo.setText(String.valueOf(codigo));
            txtAluno.setText(String.valueOf(FP.getNome()));
            txtCodigoFocusLost(null);
            txtRenovação.requestFocus();
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
                ClienteDAO CDAO = new ClienteDAO();
                LivrosDAO LDAO = new LivrosDAO();
                
                //Atualizando o formulário com os dados do cliente
                txtAluno.setText(CDAO.busca_id(LOC.getLocacao_cliente()));
                txtLivro.setText(LDAO.busca_id(LOC.getLocacao_livro()));
                txtRetirada.setText(String.valueOf(LOC.getLocacao_dataretirada()));  
                txtRenovação.setText(String.valueOf(LOC.getLocacao_dataentrega()));  
                btnRenovar.setEnabled(true);
                
            } else {
                //Cliente não localizado
                edicao = false;
                txtCodigo.setText("");
                txtAluno.setText("");
                txtLivro.setText("");
                txtSenha.setText("");
                txtRetirada.setText("");
                txtRenovação.setText("");
                btnRenovar.setEnabled(false);
                

            }
            
        } catch (NumberFormatException | NullPointerException ex) {
            codigo = 0;
            //JOptionPane.showMessageDialog(null, "Erro de código: " + ex);
        }
    }//GEN-LAST:event_txtCodigoFocusLost

    private void btnRenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenovarActionPerformed
        if(edicao == true){   
            if (txtSenha.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Informe a Senha!");
                btnRenovar.requestFocus();
            } else {
                //Formulário validado
                String senha = "";
                Locacao L = new Locacao();
                LocacaoDAO DAO = new LocacaoDAO();
                ClienteDAO CDAO = new ClienteDAO();
                L.setLocacao_id(Integer.parseInt(txtCodigo.getText()));
                Locacao LOC = new Locacao();
                LOC = DAO.busca(L);
                L.setLocacao_dataentrega(txtRenovação.getText());
                L.setLocacao_situacao(1);
                senha = CDAO.busca_senha(LOC.getLocacao_cliente());
                String senha_campo = txtSenha.getText();
                if(senha.equals(senha_campo)){
                    DAO.update(L);
                    LimpaFormulario();
                    return;
                } else {
                    JOptionPane.showMessageDialog(null, "Senha Incorreta!");
                    txtSenha.setText("");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um emprestido no botão (...)!");
            return;
        }
    }//GEN-LAST:event_btnRenovarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LimpaFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameDevolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDevolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDevolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDevolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDevolver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRenovar;
    private javax.swing.JButton btnVoltar;
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
    private javax.swing.JTextField txtAluno;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtLivro;
    private javax.swing.JFormattedTextField txtRenovação;
    private javax.swing.JFormattedTextField txtRetirada;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
