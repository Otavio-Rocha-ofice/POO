package br.com.cafebrew;

import br.com.cafebrew.atores.*;
import br.com.cafebrew.constantes.FormasdePagamento;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new ClienteFisico(
                "Rua das Flores, 123",
                "Otavio Barcelos",
                "otavio@email.com",
                "123.456.789-00"
        );

        Produto cafe = new Produto("Café Expresso", 8.50);
        Produto pao = new Produto("Pão de Queijo", 7.00);

        Pedido pedido = new Pedido(cliente, FormasdePagamento.PIX);

        pedido.adicionarProduto(cafe);
        pedido.adicionarProduto(pao);

        AtendenteVirtual atendente = new AtendenteVirtual("CaféBrew Bot");
        atendente.AtenderCliente(cliente);

        pedido.exibirResumo();
    }
}