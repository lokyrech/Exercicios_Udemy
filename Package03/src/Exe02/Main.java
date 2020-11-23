package Exe02;

import java.util.Scanner;

public class Main {

//    Enunciado: Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//    cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//    menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
//
//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1115.java

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Determine a coordenada: ");
        int coordX = teclado.nextInt();
        int coordY = teclado.nextInt();

        while (coordX != 0 && coordY != 0){
            if (coordX > 0 && coordY > 0) {
                System.out.println("Primeiro quadrante.");
            }
            else if (coordX < 0 && coordY > 0) {
                System.out.println("Segundo quadrante.");
            }
            else if (coordX < 0 && coordY < 0) {
                System.out.println("Terceiro quadrante.");
            }
            else if (coordX > 0 && coordY < 0){
                System.out.println("Quarto quadrante.");
            }
            System.out.println("Digite 0 0  para sair.");
            System.out.print("Determine uma nova coordenada: ");
            coordX = teclado.nextInt();
            coordY = teclado.nextInt();

        }
        System.out.println("Você informou o centro.");
        System.out.println("Programa finalizado!");

        teclado.close();
    }

}
