import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InterfaceUsuario ui = new InterfaceUsuario();
        Financiamento fnc = new Financiamento(1,1,1);

        System.out.println("Sistema de Financiamento bancario!");


        fnc.valorImovel = ui.pedirValorImovel();


        fnc.prazoFinanciamento = ui.pedirPrazoFinanciamento();


        fnc.taxaJurosAnual = ui.pedirTaxaJurosAnual();

        System.out.println("O valor a ser pago mensalmente é de R$ " + fnc.calcularPagamentoMensal());
        System.out.println("O valor total a ser pago é de R$ " + fnc.calcularTotalPagamento());

    }
}
class Financiamento {
    double valorImovel;

    int prazoFinanciamento;

    double taxaJurosAnual;

    Financiamento(double valorInicial, int prazoInicial, double taxaJurosInicial) {
        this.valorImovel = valorInicial;
        this.prazoFinanciamento = prazoInicial;
        this.taxaJurosAnual = taxaJurosInicial;
    }

    double calcularPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    double calcularTotalPagamento() {
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }


}
 class InterfaceUsuario {

     Financiamento fin1 = new Financiamento(1000, 1, 0.1);
     Scanner sc = new Scanner(System.in);

     double pedirValorImovel() {
         System.out.println("Qual o valor do imovel?");
         return fin1.valorImovel = sc.nextDouble();
     }

     int pedirPrazoFinanciamento() {
         System.out.println("Qual o prazo do financiamento? (Em Anos)");
         return fin1.prazoFinanciamento = sc.nextInt();
     }

     double pedirTaxaJurosAnual() {
         System.out.println("Qual a taxa de juros anual?");
         return fin1.taxaJurosAnual = sc.nextDouble();
     }
}