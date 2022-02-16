package com.dio;

import java.util.Scanner;
/**
 * Exercício DIO — Entendendo Métodos Java:
 * Crie uma aplicação que resolva as seguintes situações:
 * — Calcule as 4 operações básicas. Sempre 2 valores devem ser passados;
 * — A partir da hora do dia, informe a mensagem adequada (Bom dia, boa tarde, boa noite);
 * — Calcule o valor final de um empréstimo, a partir do valor solicitado.
 * */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual função você deseja utilizar? (1:Calculadora, 2: Mensagem do dia, 3: Calcular empréstimo, outros valores: Finaliza programa.):");
        int numFuncao = scan.nextInt();

        switch(numFuncao){
            case 1:
                System.out.println("Opção escolhida calculadora:");
                System.out.println(Calculadora.calcularValor());
                break;
            case 2:
                System.out.println("Opção escolhida mensagem:");
                System.out.println(Hora.obterHora());
                break;
            case 3:
                System.out.println("Opção escolhida calcular empréstimo:");
                System.out.println(Emprestimo.pedirEmprestimo());
                break;
            default:
                System.out.println("Valor digitado não corresponde a nenhuma função. Programa finalizado");
        }



    }
}
