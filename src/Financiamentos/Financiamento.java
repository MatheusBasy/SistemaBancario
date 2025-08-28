package Financiamentos;

public class Financiamento {
    public double valorImovel;

    public int prazoFinanciamento;

    public double taxaJurosAnual;

    public Financiamento(double valorInicial, int prazoInicial, double taxaJurosInicial) {
        this.valorImovel = valorInicial;
        this.prazoFinanciamento = prazoInicial;
        this.taxaJurosAnual = taxaJurosInicial;
    }

    public double calcularPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    public double calcularTotalPagamento() {
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }
}
