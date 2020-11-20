package Exe02;

import java.util.Scanner;

public class Main {

//    Enunciado: Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
//
//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escolha um número inteiro: ");

        int x = teclado.nextInt();
        System.out.print("\n O número escolhido é: ");

        if (x%2 == 1){
            System.out.print("Impar.");
        } else{
            System.out.print("Par.");
        }

        teclado.close();
    }

}
