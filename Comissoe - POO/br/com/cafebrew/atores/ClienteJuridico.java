package br.com.cafebrew.atores;

public class ClienteJuridico extends Cliente {

    private String cnpj;
    private String razaoSocial;

    public ClienteJuridico(String endereco, String nome, String email, String cnpj, String razaoSocial) {
        super(endereco, nome, email);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "Cliente Jurídico: " + razaoSocial + "\nCNPJ: " + cnpj + "\nEmail: " + getEmail();
    }
}