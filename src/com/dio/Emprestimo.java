package com.dio;

import java.util.Scanner;

public class Emprestimo {

    private static final Scanner scan = new Scanner(System.in);

    public static String pedirEmprestimo() {

        double valorPedido;
        int qtdParcelas;
        System.out.println("Digite o valor que você deseja pedir empréstimo:");
        valorPedido = scan.nextDouble();

        System.out.println("Digite a quantidade de parcelas que deseja pagar(min: 1 parcela, máx: 12 parcelas):");
        qtdParcelas = scan.nextInt();

        return "Valor total a ser pago: R$" + calculaValor(valorPedido, qtdParcelas);
    }

    private static double calculaValor(double valorEmprestado, int parcelas){

        double valorParaPagar = valorEmprestado;
        double taxaOperacao = 25 + valorEmprestado * 0.05;
        if(valorEmprestado <=0){
            return 0;
        }

        System.out.println("Taxa de operação: R$25 + 5% do valor pedido");
        System.out.println("Qtd de parcelas:" + parcelas);


        switch (parcelas){
            case 1:
                valorParaPagar += valorEmprestado * 0.01 + taxaOperacao;
                System.out.println("1 parcela com juros e taxas de: R$" + (valorParaPagar / parcelas));
                break;
            case 2:
                valorParaPagar += valorEmprestado * 0.01 + taxaOperacao;
                System.out.println("2 parcela com juros e taxas de: R$" + (valorParaPagar / parcelas));
                break;
            case 3:
                valorParaPagar += valorEmprestado * 0.02 + taxaOperacao;
                System.out.println("3 parcela com juros e taxas de: R$" + (valorParaPagar / parcelas));
                break;
            case 4:
                valorParaPagar += valorEmprestado * 0.02 + taxaOperacao;
                System.out.println("4 parcela com juros e taxas de: R$" + (valorParaPagar / parcelas));
                break;
            case 5:
                valorParaPagar += valorEmprestado * 0.03 + taxaOperacao;
                System.out.println("5 parcela com juros e taxas de: R$" + (valorParaPagar / parcelas));
                break;
            case 6:
                valorParaPagar += valorEmprestado * 0.04 + taxaOperacao;
                System.out.println("6 parcela com juros e taxas de: R$" + (valorParaPagar / parcelas));
                break;
            case 7:
                valorParaPagar += valorEmprestado * 0.05 + taxaOperacao;
                System.out.println("7 parcela com juros e taxas de: R$" + (valorParaPagar / parcelas));
                break;
            case 8:
                valorParaPagar += valorEmprestado * 0.06 + taxaOperacao;
                System.out.println("8 parcela com juros e taxas de: R$" + (valorParaPagar / parcelas));
                break;
            case 9:
                valorParaPagar += valorEmprestado * 0.07 + taxaOperacao;
                System.out.println("9 parcela com juros e taxas de: R$" + (valorParaPagar / parcelas));
                break;
            case 10:
                valorParaPagar += valorEmprestado * 0.08 + taxaOperacao;
                System.out.println("10 parcela com juros e taxas de: R$" + (valorParaPagar / parcelas));
                break;
            case 11:
                valorParaPagar += valorEmprestado * 0.09 + taxaOperacao;
                System.out.println("11 parcela com juros e taxas de: R$" + (valorParaPagar / parcelas));
                break;
            case 12:
                valorParaPagar += valorEmprestado * 0.10 + taxaOperacao;
                System.out.println("12 parcela com juros e taxas de: R$" + (valorParaPagar / parcelas));
                break;
            default:
                System.out.println("Valor de parcela não aceito. Transação encerrada.");
                return 0;
        }
        return valorParaPagar;
    }
}
