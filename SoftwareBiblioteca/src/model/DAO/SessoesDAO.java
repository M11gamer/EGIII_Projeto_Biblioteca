
package model.DAO;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Sessoes;


public class SessoesDAO {
     public void create(Sessoes S){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            
            stmt = con.prepareStatement("insert into sessoes("
                        + "sessoes_id, "
                        + "sessoes_num, "
                        + "sessoes_descricao)"
                    + "values (?, ?, ?)");
            stmt.setInt(1, S.getSessoes_id());
            stmt.setString(2, S.getSessoes_num());
            stmt.setString(3, S.getSessoes_descricao());
            stmt.executeUpdate();         
            
            JOptionPane.showMessageDialog(null, "Seção inserida com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
     
     public void update(Sessoes S){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("update sessoes set "
                       + "sessoes_id = ?, "
                        + "sessoes_num = ?, "
                        + "sessoes_descricao = ? "
                    + " where sessoes_id = ?");
            stmt.setInt(1, S.getSessoes_id());
            stmt.setString(2, S.getSessoes_num());
            stmt.setString(3, S.getSessoes_descricao());
            stmt.setInt(4, S.getSessoes_id());
            stmt.executeUpdate();  
            
            JOptionPane.showMessageDialog(null, "Seção atualizada com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

 public void delete(Sessoes S){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("delete from sessoes where sessoes_id = ?");
            stmt.setInt(1, S.getSessoes_id());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Seção removida com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não é possivel remover esta seção pois tem livros assosiados!");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

     public List<Sessoes> readPesquisa(String nome){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Sessoes> ses = new ArrayList<>();
        try {
            stmt = con.prepareStatement("select * from sessoes where sessoes_id like ? order by sessoes_num");
            stmt.setString(1,"%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()){
                Sessoes sessoes = new Sessoes();
                sessoes.setSessoes_id(rs.getInt("sessoes_id"));
                sessoes.setSessoes_num(rs.getString("sessoes_num"));
                sessoes.setSessoes_descricao(rs.getString("sessoes_descricao"));
                ses.add(sessoes);
            }                        
        } catch(SQLException ex) {
            Logger.getLogger(SessoesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return ses;
    }  
    
     public List<Sessoes> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Sessoes> ses = new ArrayList<>();
        try {
            stmt = con.prepareStatement("select * from sessoes order by sessoes_num");
            rs = stmt.executeQuery();

            while (rs.next()){
               Sessoes sessoes = new Sessoes();
                sessoes.setSessoes_id(rs.getInt("sessoes_id"));
                sessoes.setSessoes_num(rs.getString("sessoes_num"));
                sessoes.setSessoes_descricao(rs.getString("sessoes_descricao"));
                ses.add(sessoes);
            }                        
        } catch(SQLException ex) {
            Logger.getLogger(SessoesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return ses;
    }
     public Sessoes busca(Sessoes S){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Sessoes Ses = new Sessoes();
        try {                               
            stmt = con.prepareStatement("select "
                    + "sessoes_id, "
                    + "sessoes_num, "
                    + "sessoes_descricao"
                    + " from sessoes where sessoes_id = ?");
            stmt.setInt(1, S.getSessoes_id());
            rs = stmt.executeQuery();
            while (rs.next()){                            
                Ses.setSessoes_id(rs.getInt("sessoes_id"));
                Ses.setSessoes_num(rs.getString("sessoes_num"));
                Ses.setSessoes_descricao(rs.getString("sessoes_descricao"));
               
            }
        } catch(SQLException ex) {
            Logger.getLogger(SessoesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }               
        return Ses;
    }
     
     public int max(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int codigomax = 0;
        try {                               
            stmt = con.prepareStatement("select max(sessoes_id) as total from sessoes");
            rs = stmt.executeQuery();
            while (rs.next()){                            
                codigomax = rs.getInt("total") + 1;
            }
        } catch(SQLException ex) {
            Logger.getLogger(SessoesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }               
        return codigomax;
    }    
     
     
}
