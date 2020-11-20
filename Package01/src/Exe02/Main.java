package Exe02;

import java.util.Scanner;

public class Main {

//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1002.java

//    Enunciado:
//    Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//    casas decimais conforme exemplos.
//
//    Fórmula da área: area = π . raio2
//    Considere o valor de π = 3.14159

    public static void main(String[] args) {
        double raio, area, pi;
        pi = 3.14159;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o raio do círculo:");
        raio = teclado.nextDouble();
        area = pi * Math.pow(raio, 2);
        System.out.printf("A área do círculo é: %.4f", area);

        teclado.close();
    }

}
