package Exe04;

import java.util.Scanner;

public class Main {

//    Enunciado: Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//    segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
//
//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1116.java

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número de cálculos a serem realizados: ");
        int n = teclado.nextInt();
        int numerador = 0;
        int denominador = 0;
        double resultado = 0.0;

        for(int i = 0; i < n; i++) {
            System.out.print("Informe o numerador seguido do denominador: ");
            numerador = teclado.nextInt();
            denominador = teclado.nextInt();

            if(denominador != 0){
                resultado = (double) numerador / denominador;
                System.out.printf("A divisão é: %.1f.%n", resultado);
            } else {
                System.out.println("Divisão impossível.");
            }
        }

        System.out.println("Programa finalizado.");

        teclado.close();

    }

}
