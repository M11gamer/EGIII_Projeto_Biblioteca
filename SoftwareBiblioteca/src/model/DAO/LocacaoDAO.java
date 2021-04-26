
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
import model.bean.Locacao;


public class LocacaoDAO {
    public void create(Locacao L){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            
            stmt = con.prepareStatement("insert into locacao("
                        + "locacao_id, "
                        + "locacao_dataretirada, "
                        + "locacao_dataentrega, "
                        + "locacao_livro, "
                        + "locacao_cliente, "
                        + "locacao_nome) "
                    + " values (?, ?, ?, ?, ?, ?)");
            stmt.setInt(1, L.getLocacao_id());
            stmt.setString(2, L.getLocacao_dataretirada());
            stmt.setString(3, L.getLocacao_dataentrega());
            stmt.setInt(4, L.getLocacao_livro());
            stmt.setInt(5, L.getLocacao_cliente());
            stmt.setString(6, L.getLocacao_nome());
            stmt.executeUpdate();         
            
            JOptionPane.showMessageDialog(null, "Emprestimo de livro realizado com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fazer emprestimo: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

public void update(Locacao L){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("update locacao set "
                        + "locacao_id = ?, "
                        + "locacao_dataretirada = ?, "
                        + "locacao_dataentrega = ?,"
                        + "locacao_livro = ?,"
                        + "locacao_cliente = ?"
                    + " where locacao_id = ?");
            stmt.setInt(1, L.getLocacao_id());
            stmt.setString(2, L.getLocacao_dataretirada());
            stmt.setString(3, L.getLocacao_dataentrega());
            stmt.setInt(4, L.getLocacao_livro());
            stmt.setInt(5, L.getLocacao_cliente());
            stmt.setString(6, L.getLocacao_nome());
            stmt.setInt(7, L.getLocacao_id());
            stmt.executeUpdate();   
            
            JOptionPane.showMessageDialog(null, "Emprestimo atualizado com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

 public void delete(Locacao L){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("delete from locacao where locacao_id = ?");
            stmt.setInt(1, L.getLocacao_id());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Emprestimo removida com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

public List<Locacao> readPesquisa(String nome){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Locacao> loc = new ArrayList<>();
        try {
            stmt = con.prepareStatement("select * from locacao where locacao_id like ? order by locacao_id");
            stmt.setString(1,"%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()){
                Locacao locacao = new Locacao();
                locacao.setLocacao_id(rs.getInt("locacao_id"));
                locacao.setLocacao_dataretirada(rs.getString("locacao_dataretirada"));
                locacao.setLocacao_dataentrega(rs.getString("locacao_dataentrega"));
                locacao.setLocacao_nome(rs.getString("locacao_nome"));
                locacao.setLocacao_livro(rs.getInt("locacao_livro"));
                locacao.setLocacao_cliente(rs.getInt("locacao_cliente"));
               
            }                        
        } catch(SQLException ex) {
            Logger.getLogger(LocacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return loc;
    }

public List<Locacao> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Locacao> loc = new ArrayList<>();
        try {
            stmt = con.prepareStatement("select * from locacao order by locacao_id");
            rs = stmt.executeQuery();

            while (rs.next()){
                Locacao locacao = new Locacao();
                locacao.setLocacao_id(rs.getInt("locacao_id"));
                locacao.setLocacao_dataretirada(rs.getString("locacao_dataretirada"));
                locacao.setLocacao_dataentrega(rs.getString("locacao_dataentrega"));
                locacao.setLocacao_livro(rs.getInt("locacao_livro"));
                locacao.setLocacao_cliente(rs.getInt("locacao_cliente"));
                locacao.setLocacao_nome(rs.getString("locacao_nome"));
                loc.add(locacao);
            }                        
        } catch(SQLException ex) {
            Logger.getLogger(LocacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return loc;
    }


    public String buscanome(Locacao L){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String nome = "";
        try {                               
            stmt = con.prepareStatement("select locacao_cliente from locacao where locacao_id = ?");
            stmt.setInt(1, L.getLocacao_id());
            rs = stmt.executeQuery();
            while (rs.next()){            
                nome = rs.getString("locacao_cliente");
            }
        } catch(SQLException ex) {
            Logger.getLogger(LocacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }               
        return nome;
        
    }

    public Locacao busca(Locacao L){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Locacao loc = new Locacao();
        try {                               
            stmt = con.prepareStatement("select"
                    + " locacao_id,"
                    + " locacao_dataretirada,"
                    + " locacao_dataentrega,"
                    + " locacao_livro,"
                    + " locacao_cliente,"
                    + " locacao_nome "
                    + " from locacao where locacao_id = ?");
            stmt.setInt(1, L.getLocacao_id());
            rs = stmt.executeQuery();
            while (rs.next()){                            
                loc.setLocacao_id(rs.getInt("locacao_id"));
                loc.setLocacao_dataretirada(rs.getString("locacao_dataretirada"));
                loc.setLocacao_dataentrega(rs.getString("locacao_dataentrega"));
                loc.setLocacao_livro(rs.getInt("locaca_livro"));
                loc.setLocacao_cliente(rs.getInt("locacao_cliente"));
                loc.setLocacao_nome(rs.getString("locacao_nome"));
                
            }
            
        } catch(SQLException ex) {
            Logger.getLogger(LocacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }               
        return loc;
    
    }

    public int max(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int codigomax = 0;
        try {                               
            stmt = con.prepareStatement("select max(locacao_id) as total from locacao");
            rs = stmt.executeQuery();
            while (rs.next()){                            
                codigomax = rs.getInt("total") + 1;
            }
        } catch(SQLException ex) {
            Logger.getLogger(LocacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }               
        return codigomax;
    }


}
