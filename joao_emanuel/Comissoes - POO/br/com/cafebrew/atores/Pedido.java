package br.com.cafebrew.atores;
import br.com.cafebrew.constantes.*;
import br.com.cafebrew.interfaces.*;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<>();
    private FormasdePagamento formapagamento;
    private InterfacePagamento valorDoPedido;
    //private NotaFiscal notafiscal;
    
    public Pedido(Cliente cliente, FormasdePagamento formapagamento, InterfacePagamento valorDoPedido) {
        this.cliente = cliente;
        this.formapagamento = formapagamento;
        this.valorDoPedido = valorDoPedido;
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void calcularTotal(){
        double gastoTotal = 0;

        for(Produto p : produtos){ //para cada contagem de objetos Produto - p em produtos a à adição dos precos dos mesmos em gasto total
            gastoTotal += p.getPreco();
        }

        double descontoDoProduto = gastoTotal * formapagamento.getDesconto(); //desconto do produto = gasto total do cliente * o desconto da forma de pagamento
        double frete = InterfacePagamento.calcularfrete(gastoTotal);

        return (gastoTotal - descontoDoProduto) - frete;
    }

    
}
