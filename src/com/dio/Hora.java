package com.dio;

import java.util.Scanner;

public class Hora {

    private static final Scanner scan = new Scanner(System.in);

    public static String obterHora(){

        int hora;
        System.out.println("Digite a hora em sua região (sem os minutos ou segundos; formato 24H):");
        hora = scan.nextInt();

        if (hora >= 6 && hora < 12 ){
            return "Tenha um bom dia!";
        } else if(hora >=12 && hora < 18){
            return "Tenha uma boa tarde!";
        } else if((hora >=18 && hora < 24) || (hora >=0 && hora < 6)){
            return "Tenha uma boa noite!";
        }
        return "Valor digitado não válido. Programa encerrado";
    }
}
