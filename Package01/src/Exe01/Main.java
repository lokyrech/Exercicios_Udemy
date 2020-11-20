package Exe01;

import java.util.Scanner;

public class Main {

//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java

//    Enunciado: Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//    mensagem explicativa, conforme exemplos.

    public static void main(String[] args) {
        int x, y, soma;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        x = teclado.nextInt();
        System.out.println("Informe o segundo número número:");
        y = teclado.nextInt();
        soma = x + y;

        System.out.println("A soma dos números informados é: " + soma);

        teclado.close();

    }

}
