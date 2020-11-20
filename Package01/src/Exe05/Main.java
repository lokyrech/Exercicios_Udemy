package Exe05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1010.java

//    Enunciado: Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//    código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

    public static void main(String[] args) {
        int cod1, np1, cod2, np2;
        double valUn1, valUn2, valFinal;

        Locale.setDefault(Locale.US);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informações peça 1 (Código, Quantidade, Valor Unitário):");
        cod1 = teclado.nextInt();
        np1 = teclado.nextInt();
        valUn1 = teclado.nextDouble();
        System.out.println("Informações peça 2 (Código, Quantidade, Valor Unitário):");
        cod2 = teclado.nextInt();
        np2 = teclado.nextInt();
        valUn2 = teclado.nextDouble();

        valFinal = (np1 * valUn1) + (np2 * valUn2);

        System.out.printf("O valor total a pagar é: R$ %.2f", valFinal);

        teclado.close();

    }
}
