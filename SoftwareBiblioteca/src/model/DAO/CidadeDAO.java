
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
import model.bean.Cidade;

public class CidadeDAO {
        public void create(Cidade C){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            
            stmt = con.prepareStatement("insert into cidade("
                        + "cidade_id, "
                        + "cidade_nome, "
                        + "cidade_uf)"
                    + "values (?, ?, ?)");
            stmt.setInt(1, C.getCidade_id());
            stmt.setString(2, C.getCidade_nome());
            stmt.setString(3, C.getCidade_uf());
            stmt.executeUpdate();         
            
            JOptionPane.showMessageDialog(null, "Cidade inserida com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

public void update(Cidade C){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("update cidade set "
                        + "cidade_id = ?, "
                        + "cidade_nome = ?, "
                        + "cidade_uf = ?"
                    + "where cidade_id = ?");
            stmt.setInt(1, C.getCidade_id());
            stmt.setString(2, C.getCidade_nome());
            stmt.setString(3, C.getCidade_uf());
            stmt.setInt(4, C.getCidade_id());
            
            stmt.executeUpdate();           
            JOptionPane.showMessageDialog(null, "Cidade atualizada com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

 public void delete(Cidade C){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("delete from cidade where cidade_id = ?");
            stmt.setInt(1, C.getCidade_id());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cidade removida com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "A cidade não pode ser removida pois tem Alunos cadastrados nesta cidade!");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

 public List<Cidade> readPesquisa(String nome){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cidade> cid = new ArrayList<>();
        try {
            stmt = con.prepareStatement("select * from cidade where cidade_nome like ? order by cidade_nome");
            stmt.setString(1,"%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()){
                Cidade cidade = new Cidade();
                cidade.setCidade_id(rs.getInt("cidade_id"));
                cidade.setCidade_nome(rs.getString("cidade_nome"));
                cidade.setCidade_uf(rs.getString("cidade_uf"));
                cid.add(cidade);
               
            }                        
        } catch(SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return cid;
    }  
    
     public List<Cidade> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cidade> cid = new ArrayList<>();
        try {
            stmt = con.prepareStatement("select * from cidade order by cidade_nome");
            rs = stmt.executeQuery();

            while (rs.next()){
                Cidade cidade = new Cidade();
                cidade.setCidade_id(rs.getInt("cidade_id"));
                cidade.setCidade_nome(rs.getString("cidade_nome"));
                cidade.setCidade_uf(rs.getString("cidade_uf"));
                cid.add(cidade);
            }                        
        } catch(SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return cid;
    }  
    
    
    public String buscanome(Cidade C){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String nome = "";
        try {                               
            stmt = con.prepareStatement("select cidade_nome from cidade where cidade_id = ?");
            stmt.setInt(1, C.getCidade_id());
            rs = stmt.executeQuery();
            while (rs.next()){            
                nome = rs.getString("cidade_nome");
            }
        } catch(SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }               
        return nome;
        
    }

    public Cidade busca(Cidade C){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cidade cid = new Cidade();
        try {                               
            stmt = con.prepareStatement("select cidade_id, cidade_nome, cidade_uf from cidade where cidade_id = ?");
            stmt.setInt(1, C.getCidade_id());
            rs = stmt.executeQuery();
            while (rs.next()){                            
                cid.setCidade_id(rs.getInt("cidade_id"));
                cid.setCidade_nome(rs.getString("cidade_nome"));
                cid.setCidade_uf(rs.getString("cidade_uf"));
             
                
            }
            
        } catch(SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }               
        return cid;
    }


public int max(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int codigomax = 0;
        try {                               
            stmt = con.prepareStatement("select max(cidade_id) as total from cidade");
            rs = stmt.executeQuery();
            while (rs.next()){                            
                codigomax = rs.getInt("total") + 1;
            }
        } catch(SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }               
        return codigomax;
    }



}