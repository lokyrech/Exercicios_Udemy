package Exe01;

import java.util.Scanner;

public class Main {

//    Enunciado: Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
//
//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escolha um número inteiro: ");

        int x = teclado.nextInt();
        System.out.print("\n O número escolhido é: ");

        if (x > 0){
            System.out.print("Positivo.");
        } else if (x < 0){
            System.out.print("Negativo.");
        } else {
            System.out.print("Nulo.");
        }

        teclado.close();
    }

}