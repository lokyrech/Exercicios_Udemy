package Exe03;

import java.util.Scanner;

public class Main {

//    Enunciado: Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//    Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//    ordem crescente ou decrescente.
//
//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escolha dois números inteiros: ");

        int x = teclado.nextInt();
        int y = teclado.nextInt();

        if (x>y){
            if (x%y == 0){
                System.out.println("Os números são múltiplos.");
            } else {
                System.out.println("Os números não são múltiplos.");
            }
        } else {
            if (y%x == 0){
                System.out.println("Os números são múltiplos.");
            } else {
                System.out.println("Os números não são múltiplos.");
            }
        }

        teclado.close();

    }


}
