
package model.bean;


public class Cidade {
    
    
 private int cidade_id;
 private String cidade_nome;
 private String cidade_uf;

    public int getCidade_id() {
        return cidade_id;
    }

    public void setCidade_id(int cidade_id) {
        this.cidade_id = cidade_id;
    }

    public String getCidade_nome() {
        return cidade_nome;
    }

    public void setCidade_nome(String cidade_nome) {
        this.cidade_nome = cidade_nome;
    }

    public String getCidade_uf() {
        return cidade_uf;
    }

    public void setCidade_uf(String cidade_uf) {
        this.cidade_uf = cidade_uf;
    }
 
    @Override
    public String toString() {
        return this.getCidade_nome()+ "/" + this.getCidade_uf();
        
    }
    
}
