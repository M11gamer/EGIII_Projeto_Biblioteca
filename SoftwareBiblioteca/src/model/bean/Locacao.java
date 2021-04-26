
package model.bean;


public class Locacao {
    
private int locacao_id;
private String locacao_dataretirada;
private String locacao_dataentrega;
private int locacao_livro;
private int locacao_cliente;
private String locacao_nome;

    public int getLocacao_id() {
        return locacao_id;
    }

    public void setLocacao_id(int locacao_id) {
        this.locacao_id = locacao_id;
    }

    public String getLocacao_dataretirada() {
        return locacao_dataretirada;
    }

    public void setLocacao_dataretirada(String locacao_dataretirada) {
        this.locacao_dataretirada = locacao_dataretirada;
    }

    public String getLocacao_dataentrega() {
        return locacao_dataentrega;
    }

    public void setLocacao_dataentrega(String locacao_dataentrega) {
        this.locacao_dataentrega = locacao_dataentrega;
    }

    public int getLocacao_livro() {
        return locacao_livro;
    }

    public void setLocacao_livro(int locaca_livro) {
        this.locacao_livro = locacao_livro;
    }

    public int getLocacao_cliente() {
        return locacao_cliente;
    }

    public void setLocacao_cliente(int locacao_cliente) {
        this.locacao_cliente = locacao_cliente;
    }

    public String getLocacao_nome() {
        return locacao_nome;
    }

    public void setLocacao_nome(String locacao_nome) {
        this.locacao_nome = locacao_nome;
    }
        
   
    
}
