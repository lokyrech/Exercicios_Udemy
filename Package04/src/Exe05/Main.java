package Exe05;

import java.util.Scanner;

public class Main {

//    Enunciado: Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//    Lembrando que, por definição, fatorial de 0 é 1.
//
//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1153.java

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o número de cálculos a serem realizados: ");
        int n = teclado.nextInt();
        int fat = 1;

        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }

        System.out.println(fat);

        teclado.close();

    }
}
