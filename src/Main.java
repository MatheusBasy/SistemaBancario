import Interfaces.InterfaceUsuario;
import Financiamentos.Financiamento;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        InterfaceUsuario ui = new InterfaceUsuario();
        Financiamento fnc = new Financiamento(1, 1, 1);
        ArrayList<String> listaFinanciamentos = new ArrayList<>();

        System.out.println("Sistema de Financiamento bancario!");

        // Solicitar taxa de juros
        fnc.taxaJurosAnual = ui.pedirTaxaJurosAnual();


        for (int i = 1; i < 5; i++) {
            // Solicitar valor do imovel
            fnc.valorImovel = ui.pedirValorImovel(i);
            // Solicitar prazo de financiamento
            fnc.prazoFinanciamento = ui.pedirPrazoFinanciamento(i);
            listaFinanciamentos.add("Financiamento "+ i + " - valor do imóvel: R$ " + String.format("%.2f", fnc.valorImovel) + ", valor do financiamento: R$ " + String.format("%.2f", fnc.calcularTotalPagamento()) + "." );
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(listaFinanciamentos.get(i));
        }

        System.out.println("Taxa de juros anual de: " + String.format("%.2f",fnc.taxaJurosAnual) + "%");


        // Resultado final
        //System.out.println("O valor a ser pago mensalmente é de R$ " + String.format("%.2f", fnc.calcularPagamentoMensal()));
        //System.out.println("O valor total a ser pago é de R$ " + String.format("%.2f",fnc.calcularTotalPagamento()));

    }
}

