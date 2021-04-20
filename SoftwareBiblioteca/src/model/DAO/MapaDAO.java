
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
import model.bean.Mapa;


public class MapaDAO {
    public void create(Mapa M){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            
            stmt = con.prepareStatement("insert into mapa("
                        + "mapa_id, "
                        + "mapa_nome, "
                        + "mapa_decricao,"
                        + " mapa_sessao)"
                    + "values (?, ?, ?, ?)");
            stmt.setInt(1, M.getMapa_id());
            stmt.setString(2, M.getMapa_nome());
            stmt.setString(3, M.getMapa_descricao());
            stmt.setString(3, M.getMapa_sessao());
            stmt.executeUpdate();         
            
            JOptionPane.showMessageDialog(null, "Mapa inserido com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void update(Mapa M){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("update mapa set ("
                        + "mapa_id, "
                        + "mapa_nome, "
                        + "mapa_decricao,"
                        + " mapa_sessao)"
                    + "values (?, ?, ?, ?)");
            stmt.setInt(1, M.getMapa_id());
            stmt.setString(2, M.getMapa_nome());
            stmt.setString(3, M.getMapa_descricao());
            stmt.setString(3, M.getMapa_sessao());
            stmt.executeUpdate();           
            JOptionPane.showMessageDialog(null, "Mapa atualizado com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    public void delete(Mapa M){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("delete from mapa where mapa_id = ?");
            stmt.setInt(1, M.getMapa_id());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Mapa removido com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Mapa> readPesquisa(String nome){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Mapa> map = new ArrayList<>();
        try {
            stmt = con.prepareStatement("select * from mapa where mapa_nome like ? order by mapa_nome");
            stmt.setString(1,"%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()){
                Mapa Mapa = new Mapa();
                Mapa.setMapa_id(rs.getInt("mapa_id"));
                Mapa.setMapa_nome(rs.getString("mapa_nome"));
                Mapa.setMapa_descricao(rs.getString("mapa_descricao"));
                Mapa.setMapa_sessao(rs.getString("mapa_sessao"));
               
            }                        
        } catch(SQLException ex) {
            Logger.getLogger(MapaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return map;
    }  
    
     public List<Mapa> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Mapa> map = new ArrayList<>();
        try {
            stmt = con.prepareStatement("select * from mapa order by mapa_nome");
            rs = stmt.executeQuery();

            while (rs.next()){
                Mapa Mapa = new Mapa();
                Mapa.setMapa_id(rs.getInt("mapa_id"));
                Mapa.setMapa_nome(rs.getString("mapa_nome"));
                Mapa.setMapa_descricao(rs.getString("mapa_descricao"));
                Mapa.setMapa_sessao(rs.getString("mapa_sessao"));
                map.add(Mapa);
            }                        
        } catch(SQLException ex) {
            Logger.getLogger(MapaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return map;
    }  
    
    
    public String buscanome(Mapa M){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String nome = "";
        try {                               
            stmt = con.prepareStatement("select mapa_nome from mapa where mapa_id = ?");
            stmt.setInt(1, M.getMapa_id());
            rs = stmt.executeQuery();
            while (rs.next()){            
                nome = rs.getString("mapa_nome");
            }
        } catch(SQLException ex) {
            Logger.getLogger(MapaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }               
        return nome;
        
    }

    public Mapa busca(Mapa M){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Mapa map = new Mapa();
        try {                               
            stmt = con.prepareStatement("select mapa_id, mapa_nome, mapa_descricao, mapa_sessao from mapa where mapa_id = ?");
            stmt.setInt(1, M.getMapa_id());
            rs = stmt.executeQuery();
            while (rs.next()){                            
                map.setMapa_id(rs.getInt("mapa_id"));
                map.setMapa_nome(rs.getString("mapa_nome"));
                map.setMapa_descricao(rs.getString("mapa_descricao"));
                map.setMapa_sessao(rs.getString("mapa_sessao")); 
            }
            
        } catch(SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }               
        return map;
    }


public int max(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int codigomax = 0;
        try {                               
            stmt = con.prepareStatement("select max(mapa_id) as total from mapa");
            rs = stmt.executeQuery();
            while (rs.next()){                            
                codigomax = rs.getInt("total") + 1;
            }
        } catch(SQLException ex) {
            Logger.getLogger(MapaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }               
        return codigomax;
    }
    
    
    
    
}
