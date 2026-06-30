package br.com.cafebrew.constantes;

public enum FormasdePagamento { //Uma classe enum tem a serventia de enumerar CONSTANTES
    //---Contantes referentes aos valores de desconto de cada tipo de pagamento
    PIX (0.15),
    BOLETO (0.0),
    CREDITO (0.0),
    DEBITO(0.0);

    private double desconto; //valor de desconto no pagamento final

    private FormasdePagamento(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

}
