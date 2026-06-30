package br.com.cafebrew.atores;

public class ClienteFisico extends Cliente{ //subclasse de client fisico (cpf), herdando da classe de cliente
    private String cpf;

    public ClienteFisico(String nome, String endereco, String email, String cpf){ //adicionar usando o super o atributo cpf na classe Cliente
        super(endereco, nome, email);
        this.cpf = cpf;
    }
}

