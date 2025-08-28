package Interfaces;

import Financiamentos.Financiamento;

import java.util.Scanner;

public class InterfaceUsuario {

    Financiamento fin1 = new Financiamento(1000, 1, 0.1);

    Scanner sc = new Scanner(System.in);

    public double pedirValorImovel() {
        System.out.println("Qual o valor do imovel?");
        return fin1.valorImovel = sc.nextDouble();
    }

    public int pedirPrazoFinanciamento() {
        System.out.println("Qual o prazo do financiamento? (Em Anos)");
        return fin1.prazoFinanciamento = sc.nextInt();
    }

    public double pedirTaxaJurosAnual() {
        System.out.println("Qual a taxa de juros anual?");
        return fin1.taxaJurosAnual = sc.nextDouble();
    }
}