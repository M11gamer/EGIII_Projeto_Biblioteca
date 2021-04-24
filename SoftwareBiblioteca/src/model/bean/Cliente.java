
package model.bean;

public class Cliente {
    
    
    private int cliente_id;
    private String cliente_nome;
    private String cliente_senha;
    private String cliente_telefone;
    private String cliente_cpf;
    private String cliente_rg;
    private int cliente_cidade;
    private String cliente_descricao;

    public int getCliente_cidade() {
        return cliente_cidade;
    }

    public void setCliente_cidade(int cliente_cidade) {
        this.cliente_cidade = cliente_cidade;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getCliente_nome() {
        return cliente_nome;
    }

    public void setCliente_nome(String cliente_nome) {
        this.cliente_nome = cliente_nome;
    }

    public String getCliente_senha() {
        return cliente_senha;
    }

    public void setCliente_senha(String cliente_senha) {
        this.cliente_senha = cliente_senha;
    }

    public String getCliente_telefone() {
        return cliente_telefone;
    }

    public void setCliente_telefone(String cliente_telefone) {
        this.cliente_telefone = cliente_telefone;
    }

    public String getCliente_cpf() {
        return cliente_cpf;
    }

    public void setCliente_cpf(String cliente_cpf) {
        this.cliente_cpf = cliente_cpf;
    }

    public String getCliente_rg() {
        return cliente_rg;
    }

    public void setCliente_rg(String cliente_rg) {
        this.cliente_rg = cliente_rg;
    }

    public String getCliente_descricao() {
        return cliente_descricao;
    }

    public void setCliente_descricao(String cliente_descricao) {
        this.cliente_descricao = cliente_descricao;
    }

    
    
}
