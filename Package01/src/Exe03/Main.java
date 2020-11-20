package Exe03;

import java.util.Scanner;

public class Main {

//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1007.java

//    Enunciado: Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//    de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

    public static void main(String[] args) {
        int A, B, C, D, DIFERENCA;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        A = teclado.nextInt();
        System.out.println("Informe o segundo número número:");
        B = teclado.nextInt();
        System.out.println("Informe o terceiro número:");
        C = teclado.nextInt();
        System.out.println("Informe o quarto número número:");
        D = teclado.nextInt();

        DIFERENCA = (A * B - C * D);
        System.out.println(A + " * " + B + " - " + C + " * " + D + " = " + DIFERENCA);

        teclado.close();
    }

}
