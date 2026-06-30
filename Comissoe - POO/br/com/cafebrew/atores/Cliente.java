package br.com.cafebrew.atores;

public abstract class Cliente { //classe pai de Clientes que servira de herança para clientesfisicos e juridicos
    private String endereço;
    private String nome;
    private String email;
    
    
    
    public Cliente(String endereço, String nome, String email) {
        this.endereço = endereço;
        this.nome = nome;
        this.email = email;
    }


    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}