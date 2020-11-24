package Exe07;

import java.util.Scanner;

public class Main {

//    Enunciado: Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//    começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//    exemplo.
//
//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1143.java

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor: ");
        int n = teclado.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
        }

        System.out.println("Programa finalizado.");

        teclado.close();

    }

}