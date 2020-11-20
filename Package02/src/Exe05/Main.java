package Exe05;

import java.util.Scanner;

public class Main {

//    Enunciado: Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//    seguir, calcule e mostre o valor da conta a pagar.
//    1 - Cachorro Quente - R$ 4.00
//    2 - X-Salada - R$ 4.50
//    3 - X-Bacon - R$ 5.00
//    4 - Torrada Simples - R$ 2.00
//    5 - Refrigerante - R$ 1.50
//
//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o item e quantidade: ");

        int cod = teclado.nextInt();
        int qtd = teclado.nextInt();

        double valorTotal;

        if (cod == 1){
            valorTotal = qtd * 4.0;
            System.out.printf("Total: R$ %.2f%n", valorTotal);
        } else if (cod == 2){
            valorTotal = qtd * 4.5;
            System.out.printf("Total: R$ %.2f%n", valorTotal);
        } else if (cod == 3){
            valorTotal = qtd * 5.0;
            System.out.printf("Total: R$ %.2f%n", valorTotal);
        } else if (cod == 4){
            valorTotal = qtd * 2.0;
            System.out.printf("Total: R$ %.2f%n", valorTotal);
        } else if (cod == 5){
            valorTotal = qtd * 1.5;
            System.out.printf("Total: R$ %.2f%n", valorTotal);
        } else {
            System.out.println("Código não cadastrado.");
        }

        teclado.close();

    }

}
