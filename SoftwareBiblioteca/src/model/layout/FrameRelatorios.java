
package model.layout;

import connection.ConnectionFactory;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class FrameRelatorios extends javax.swing.JFrame {

    
    public FrameRelatorios() {
        initComponents();
        //setExtendedState(MAXIMIZED_BOTH);
    }

    
    
    
    
    
    
    
    
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_clientes.png"))); // NOI18N
        jButton1.setText("Relatorios de Alunos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 180, 210, 59);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_livros.png"))); // NOI18N
        jButton2.setText("Relatorio de Livros");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(80, 182, 210, 60);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_retirada.png"))); // NOI18N
        jButton3.setText("Movimentação");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(320, 180, 210, 60);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_sair_int.png"))); // NOI18N
        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(40, 339, 117, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/icon/icone_fundo_azul.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 900, 500);

        setSize(new java.awt.Dimension(916, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       java.sql.Connection conn = ConnectionFactory.getConnection();

        String src = "ReportLivros.jasper";

        JasperPrint jasperPrint = null;

        try {
            jasperPrint = JasperFillManager.fillReport(src, null, conn);
        } catch (JRException ex) {
            System.out.println("Error: "+ex);
        }

        JasperViewer view = new JasperViewer(jasperPrint,false);

        view.setVisible(true);

        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       java.sql.Connection conn = ConnectionFactory.getConnection();

        String src = "ReportAluno.jasper";

        JasperPrint jasperPrint = null;

        try {
            jasperPrint = JasperFillManager.fillReport(src, null, conn);
        } catch (JRException ex) {
            System.out.println("Error: "+ex);
        }

        JasperViewer view = new JasperViewer(jasperPrint,false);

        view.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       java.sql.Connection conn = ConnectionFactory.getConnection();

        String src = "ReportMovimento.jasper";

        JasperPrint jasperPrint = null;

        try {
            jasperPrint = JasperFillManager.fillReport(src, null, conn);
        } catch (JRException ex) {
            System.out.println("Error: "+ex);
        }

        JasperViewer view = new JasperViewer(jasperPrint,false);

        view.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRelatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    // End of variables declaration//GEN-END:variables
}
