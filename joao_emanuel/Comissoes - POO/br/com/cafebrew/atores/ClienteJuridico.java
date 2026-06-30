package br.com.cafebrew.atores;

public class ClienteJuridico extends Cliente{
    private String cnpj;

    public ClienteJuridico(String nome, String endereco, String email, String cnpj){
        super(endereco, nome, email);
        this.cnpj = cnpj;
    }
}
