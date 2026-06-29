package br.com.cafebrew.atores;
import java.util.List;
import java.util.ArrayList;

public class AtendenteVirtual {
    private String nomeAtendente;
    private List<Cliente> listaclientesatendidos = new ArrayList<>();
    
    public AtendenteVirtual(String nomeAtendente) {
        this.nomeAtendente = nomeAtendente;
    }

    public void AtenderCliente(Cliente clienteatendido){
        this.listaclientesatendidos.add(clienteatendido);
        System.out.println("O atendente " + nomeAtendente + "esta atendendo o client" + clienteatendido.getNome());
    }

    

    
}
