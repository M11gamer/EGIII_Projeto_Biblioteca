
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
import model.bean.Cliente;


public class ClienteDAO {
    public void create(Cliente C){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            
            stmt = con.prepareStatement("insert into cliente("
                        + "cliente_id, "
                        + "cliente_nome, "
                        + "cliente_senha, "
                        + "cliente_telefone, "
                        + "cliente_cpf, "
                        + "cliente_rg, "
                        + "cliente_cidade, "
                        + "cliente_descricao)"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setInt(1, C.getCliente_id());
            stmt.setString(2, C.getCliente_nome());
            stmt.setString(3, C.getCliente_senha());
            stmt.setString(4, C.getCliente_telefone());
            stmt.setString(5, C.getCliente_cpf());
            stmt.setString(6, C.getCliente_rg()); 
            stmt.setInt(7, C.getCliente_cidade());
            stmt.setString(8, C.getCliente_descricao());
            stmt.executeUpdate();            
            JOptionPane.showMessageDialog(null, "Aluno Inserido com Sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
public void update(Cliente C){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("update cliente set "
                        + "cliente_id = ?, "
                        + "cliente_nome = ?,"
                        + "cliente_senha = ?,"
                        + "cliente_telefone = ?,"
                        + "cliente_cpf = ?,"
                        + "cliente_rg = ?,"
                        + "cliente_cidade = ?,"
                        + "cliente_descricao = ?"
                        + "where cliente_id = ?");
            stmt.setInt(1, C.getCliente_id());
            stmt.setString(2, C.getCliente_nome());
            stmt.setString(3, C.getCliente_senha());
            stmt.setString(4, C.getCliente_telefone());
            stmt.setString(5, C.getCliente_cpf());
            stmt.setString(6, C.getCliente_rg()); 
            stmt.setInt(7, C.getCliente_cidade());
            stmt.setString(8, C.getCliente_descricao());
            stmt.setInt(9, C.getCliente_id());
            stmt.executeUpdate();                     
            JOptionPane.showMessageDialog(null, "Aluno Atualizado com Sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

public void delete(Cliente C){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("delete from cliente where cliente_id = ?");
            stmt.setInt(1, C.getCliente_id());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

public List<Cliente> readPesquisa(String nome){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente> cli = new ArrayList<>();
        try {
            stmt = con.prepareStatement("select * from cliente where cliente_nome like ? order by cliente_nome");
            stmt.setString(1,"%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()){
                Cliente cliente = new Cliente();
                cliente.setCliente_id(rs.getInt("cliente_id"));
                cliente.setCliente_nome(rs.getString("cliente_nome"));
                cliente.setCliente_senha(rs.getString("cliente_senha"));
                cliente.setCliente_telefone(rs.getString("cliente_telefone"));
                cliente.setCliente_cpf(rs.getString("cliente_cpf"));
                cliente.setCliente_rg(rs.getString("cliente_rg"));
                cliente.setCliente_cidade(rs.getInt("cliente_cidade"));
                cliente.setCliente_descricao(rs.getString("cliente_descricao"));
                cli.add(cliente);
            }                        
        } catch(SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return cli;
    }

public List<Cliente> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente> cli = new ArrayList<>();
        try {
                stmt = con.prepareStatement("select " 
                                           + "cliente.cliente_id," 
                                           + "cliente.cliente_nome," 
                                           + "cliente.cliente_senha," 
                                           + "cliente.cliente_telefone," 
                                           + "cliente.cliente_cpf,"
                                           + "cliente.cliente_rg," 
                                           + "cliente.cliente_descricao," 
                                           + "cliente.cliente_cidade," 
                                           + "cidade.cidade_id," 
                                           + "cidade.cidade_nome" 
                                           + " from cliente inner join cidade on "
                                           + "cliente.cliente_cidade = cidade.cidade_nome ");                                          

                                            
            rs = stmt.executeQuery();
            while (rs.next()){
                Cliente cliente = new Cliente();
                cliente.setCliente_id(rs.getInt("cliente_id"));
                cliente.setCliente_nome(rs.getString("cliente_nome"));
                cliente.setCliente_senha(rs.getString("cliente_senha"));
                cliente.setCliente_telefone(rs.getString("cliente_telefone"));
                cliente.setCliente_cpf(rs.getString("cliente_cpf"));
                cliente.setCliente_rg(rs.getString("cliente_rg"));
                cliente.setCliente_cidade(rs.getInt("cliente_cidade"));
                cliente.setCliente_descricao(rs.getString("cliente_descricao"));
                cli.add(cliente);
            }                        
        } catch(SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return cli;
    }

 public String buscanome(Cliente C){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String nome = "";
        try {                               
            stmt = con.prepareStatement("select cliente_nome from cliente where cliente_id = ?");
            stmt.setInt(1, C.getCliente_id());
            rs = stmt.executeQuery();
            while (rs.next()){            
                nome = rs.getString("cliente_nome");
            }
        } catch(SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }               
        return nome;
        
    }

public Cliente busca(Cliente C){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cliente Cli = new Cliente();
        try {                               
            stmt = con.prepareStatement("select "
                    + "cliente_id,"
                    + " cliente_nome,"
                    + " cliente_senha,"
                    + " cliente_telefone,"
                    + " cliente_cpf, "
                    + "cliente_rg,"
                    + " cliente_cidade,"
                    + " cliente_descricao "
                    + "from cliente where cliente_id = ?");
            stmt.setInt(1, C.getCliente_id());
            rs = stmt.executeQuery();
            while (rs.next()){                            
                Cli.setCliente_id(rs.getInt("cliente_id"));
                Cli.setCliente_nome(rs.getString("cliente_nome"));
                Cli.setCliente_senha(rs.getString("cliente_senha"));
                Cli.setCliente_telefone(rs.getString("cliente_telefone"));
                Cli.setCliente_cpf(rs.getString("cliente_cpf"));
                Cli.setCliente_rg(rs.getString("cliente_rg"));
                Cli.setCliente_cidade(rs.getInt("cliente_cidade"));
                Cli.setCliente_descricao(rs.getString("cliente_descricao"));   
            }
            
        } catch(SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }       
        
        return Cli;
    } 


public int max(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int codigomax = 0;
        try {                               
            stmt = con.prepareStatement("select max(cliente_id) as total from cliente");
            rs = stmt.executeQuery();
            while (rs.next()){                            
                codigomax = rs.getInt("total") + 1;
            }
        } catch(SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }               
        return codigomax;
    }




}
