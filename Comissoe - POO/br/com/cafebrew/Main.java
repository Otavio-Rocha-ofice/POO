package br.com.cafebrew;

import br.com.cafebrew.atores.*;
import br.com.cafebrew.constantes.FormasdePagamento;

public class Main {

    public static void main(String[] args) {

        //Cliente Físico
        Cliente clienteFisico = new ClienteFisico(
                "Rua das Flores, 123",
                "Otavio Barcelos",
                "otavio@email.com",
                "123.456.789-00"
        );

        Produto cafe = new Produto("Café Expresso", 8.50);
        Produto pao = new Produto("Pão de Queijo", 7.00);

        Pedido pedidoFisico = new Pedido(clienteFisico, FormasdePagamento.PIX);
        pedidoFisico.adicionarProduto(cafe);
        pedidoFisico.adicionarProduto(pao);

        //Cliente Jurídico
        Cliente clienteJuridico = new ClienteJuridico(
                "Av. Empresarial, 456",
                "Comercial Café & Cia",
                "contato@cafeecia.com",
                "12.345.678/0001-90",
                "Café & Cia Comércio de Alimentos LTDA"
        );

        Produto cafeGraos = new Produto("Café em Grãos (1kg)", 45.00);
        Produto capsulas = new Produto("Caixa de Cápsulas (50un)", 90.00);

        Pedido pedidoJuridico = new Pedido(clienteJuridico, FormasdePagamento.BOLETO);
        pedidoJuridico.adicionarProduto(cafeGraos);
        pedidoJuridico.adicionarProduto(capsulas);

        //Atendimento
        AtendenteVirtual atendente = new AtendenteVirtual("CaféBrew Bot");
        atendente.AtenderCliente(clienteFisico);
        atendente.AtenderCliente(clienteJuridico);

        //Resumo dos pedidos
        pedidoFisico.exibirResumo();
        pedidoJuridico.exibirResumo();

        //Demonstrando o toString() de cada tipo de cliente
        System.out.println("\nDADOS DO CLIENTE FÍSICO");
        System.out.println(clienteFisico);

        System.out.println("\nDADOS DO CLIENTE JURÍDICO");
        System.out.println(clienteJuridico);
    }
}