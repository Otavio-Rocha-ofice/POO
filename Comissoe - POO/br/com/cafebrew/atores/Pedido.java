package br.com.cafebrew.atores;

import java.util.ArrayList;
import java.util.List;

import br.com.cafebrew.constantes.FormasdePagamento;

public class Pedido {

    private Cliente cliente;
    private List<Produto> produtos;
    private FormasdePagamento formaPagamento;

    public Pedido(Cliente cliente, FormasdePagamento formaPagamento) {
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;

        for (Produto p : produtos) {
            total += p.getPreco();
        }

        return total;
    }

    public double calcularTotalComDesconto() {
        double total = calcularTotal();

        return total - (total * formaPagamento.getDesconto());
    }

    public void exibirResumo() {
        System.out.println("\n===== PEDIDO =====");
        System.out.println("Cliente: " + cliente.getNome());

        for (Produto p : produtos) {
            System.out.println(p);
        }

        System.out.println("Total: R$ " + calcularTotal());
        System.out.println("Pagamento: " + formaPagamento);
        System.out.println("Total Final: R$ " + calcularTotalComDesconto());
    }
}