
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
import model.bean.Usuario;


public class UsuarioDAO {
        public void create(Usuario U){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            
            stmt = con.prepareStatement("insert into usuario("
                        + "usuario_id, "
                        + "usuario_nome, "
                        + "usuario_senha)"
                    + "values (?, ?, ?)");
            stmt.setInt(1, U.getUsuario_id());
            stmt.setString(2, U.getUsuario_nome());
            stmt.setString(3, U.getUsuario_senha());
            stmt.executeUpdate();         
            
            JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
        
        public void update(Usuario U){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("update usuario set ("
                       + "usuario_id, "
                        + "usuario_nome, "
                        + "usuario_senha)"
                    + "where usuario_id = ?");
            stmt.setInt(1, U.getUsuario_id());
            stmt.setString(2, U.getUsuario_nome());
            stmt.setString(3, U.getUsuario_senha());
            
            stmt.executeUpdate();           
            JOptionPane.showMessageDialog(null, "Cidade atualizada com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
        
        public void delete(Usuario U){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("delete from Usuario where usuario_id = ?");
            stmt.setInt(1, U.getUsuario_id());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario removido com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
      public List<Usuario> readPesquisa(String nome){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usu = new ArrayList<>();
        try {
            stmt = con.prepareStatement("select * from usuario where usuario_nome like ? order by usuario_nome");
            stmt.setString(1,"%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()){
                Usuario Usuario = new Usuario();
                Usuario.setUsuario_id(rs.getInt("usuario_id"));
                Usuario.setUsuario_nome(rs.getString("usuario_nome"));
                Usuario.setUsuario_senha(rs.getString("usuario_senha"));
               
            }                        
        } catch(SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usu;
    }  
    
     public List<Usuario> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usu = new ArrayList<>();
        try {
            stmt = con.prepareStatement("select * from usuario order by usuario_nome");
            rs = stmt.executeQuery();

            while (rs.next()){
                Usuario usuario = new Usuario();
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setUsuario_nome(rs.getString("usuario_nome"));
                usuario.setUsuario_senha(rs.getString("usuario_senha"));
                usu.add(usuario);
            }                        
        } catch(SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usu;
    }  
    
    
    public String buscanome(Usuario U){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String nome = "";
        try {                               
            stmt = con.prepareStatement("select usuario_nome from usuario where usuario_id = ?");
            stmt.setInt(1, U.getUsuario_id());
            rs = stmt.executeQuery();
            while (rs.next()){            
                nome = rs.getString("usuario_nome");
            }
        } catch(SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }               
        return nome;
        
    }

    public Usuario busca(Usuario U){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usu = new Usuario();
        try {                               
            stmt = con.prepareStatement("select usuario_id, usuario_nome, usuario_senha from usuario where usuario_id = ?");
            stmt.setInt(1, U.getUsuario_id());
            rs = stmt.executeQuery();
            while (rs.next()){                            
                usu.setUsuario_id(rs.getInt("usuario_id"));
                usu.setUsuario_nome(rs.getString("usuario_nome"));
                usu.setUsuario_senha(rs.getString("usuario_senha"));
             
                
            }
            
        } catch(SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }               
        return usu;
    }


public int max(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int codigomax = 0;
        try {                               
            stmt = con.prepareStatement("select max(usuario_id) as total from usuario");
            rs = stmt.executeQuery();
            while (rs.next()){                            
                codigomax = rs.getInt("total") + 1;
            }
        } catch(SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }               
        return codigomax;
    }  
        
        
        
        
        
}
