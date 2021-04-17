
package model.bean;


public class Locacao {
    
private int locacao_id;
private String locacao_dataretirada;
private String locacao_dataentrega;
private int locaca_livro;
private int locacao_cliente;

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

    public int getLocaca_livro() {
        return locaca_livro;
    }

    public void setLocaca_livro(int locaca_livro) {
        this.locaca_livro = locaca_livro;
    }

    public int getLocacao_cliente() {
        return locacao_cliente;
    }

    public void setLocacao_cliente(int locacao_cliente) {
        this.locacao_cliente = locacao_cliente;
    }
        
   
    
}
