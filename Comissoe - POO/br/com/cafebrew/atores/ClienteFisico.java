package br.com.cafebrew.atores;

public class ClienteFisico extends Cliente {

    private String cpf;

    public ClienteFisico(String endereco, String nome, String email, String cpf) {
        super(endereco, nome, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente Físico: " + getNome() + "\nCPF: " + cpf + "\nEmail: " + getEmail();
    }
}