import java.util.Scanner;
import Interfaces.InterfaceUsuario;
import Financiamentos.Financiamento;

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

