package Interfaces;

import Financiamentos.Financiamento;

import java.util.Scanner;

public class InterfaceUsuario {

    Financiamento fin1 = new Financiamento(1000, 1, 0.1);

    Scanner sc = new Scanner(System.in);

    public double pedirValorImovel(int i) {
        System.out.println("Qual o valor do imóvel " + i + "?" );
        fin1.valorImovel = sc.nextDouble();
        if (fin1.valorImovel <= 0) {
            System.out.println("O valor do imóvel não pode ser menor que zero.");
            return pedirValorImovel(i);
        }

        return fin1.valorImovel;
    }

    public int pedirPrazoFinanciamento(int i) {
        System.out.println("Qual o prazo do financiamento " + i +"? (Em Anos)");
        fin1.prazoFinanciamento = sc.nextInt();

        if (fin1.prazoFinanciamento <= 0) {
            System.out.println("O prazo do financiamento não pode ser menor que zero anos.");
            return pedirPrazoFinanciamento(i);
        } else if (fin1.prazoFinanciamento > 30) {
            System.out.println("O prazo do financiamento não pode ser maior que 30 anos.");
            return pedirPrazoFinanciamento(i);
        }

        return fin1.prazoFinanciamento;
    }

    public double pedirTaxaJurosAnual() {
        System.out.println("Qual a taxa de juros anual? (Máximo de 20%)");
        fin1.taxaJurosAnual = sc.nextDouble();
        if (fin1.taxaJurosAnual <= 1) {
            System.out.println("A taxa de juros anual não pode ser negativa.");
            return pedirTaxaJurosAnual();
        } else if (fin1.taxaJurosAnual > 20) {
            System.out.println("A taxa de juros anual não pode ser maior que 20%.");
            return pedirTaxaJurosAnual();
        }
        return fin1.taxaJurosAnual;
    }
}