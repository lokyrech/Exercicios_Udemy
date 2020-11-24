package Exe03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

//    Enunciado: Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//    de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//    conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//    peso 5.
//
//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1079.java

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int n = teclado.nextInt();
        double valor1 = 0;
        double valor2 = 0;
        double valor3 = 0;
        double media = 0;

        for(int i = 0; i < n; i++) {
            valor1 = teclado.nextDouble();
            valor2 = teclado.nextDouble();
            valor3 = teclado.nextDouble();
            media = ((valor1 * 2.0) + (valor2 * 3.0) + (valor3 * 5.0)) / 10.0;
            System.out.printf("A média é: %.1f.%n", media);
        }

        teclado.close();

    }

}
