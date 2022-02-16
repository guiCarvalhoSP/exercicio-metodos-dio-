package com.dio;

import java.util.Scanner;

public class Calculadora {

    private static final Scanner scan = new Scanner(System.in);

    public static String calcularValor(){

        double primeiroNum;
        double segundoNum;
        double resultado;

        String mensagemResultado;
        String operador;

        System.out.println("Digite o primeiro valor:");
        primeiroNum = scan.nextDouble();

        System.out.println("Escolha o operador (+, -, * ou /):");
        operador = scan.next();

        System.out.println("Digite o segundo valor:");
        segundoNum = scan.nextDouble();

        switch (operador){
            case "+":
                resultado = realizaSoma(primeiroNum, segundoNum);
                break;

            case "-":
                resultado = realizaSubtracao(primeiroNum, segundoNum);
                break;

            case "*":
                resultado = realizaMultiplicacao(primeiroNum, segundoNum);
                break;

            case "/":
                resultado = realizaDivisao(primeiroNum, segundoNum);
                break;

            default:
                return "Operador inválido. Programa encerrado.";
        }

        mensagemResultado = primeiroNum + " " + operador + " " + segundoNum + " = " + resultado;
        return mensagemResultado;
    }

    private static double realizaSoma(double primeiroNum, double segundoNum){
        double resultado;
        resultado = primeiroNum + segundoNum;
        return resultado;
    }

    private static double realizaSubtracao(double primeiroNum, double segundoNum){
        double resultado;
        resultado = primeiroNum - segundoNum;
        return resultado;
    }

    private static double realizaMultiplicacao(double primeiroNum, double segundoNum){
        double resultado;
        resultado = primeiroNum * segundoNum;
        return resultado;
    }

    private static double realizaDivisao(double primeiroNum, double segundoNum){
        double resultado;
        resultado = primeiroNum / segundoNum;
        return resultado;
    }


}
