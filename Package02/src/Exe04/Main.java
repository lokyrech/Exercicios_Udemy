package Exe04;

import java.util.Scanner;

public class Main {

//    Enunciado: Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//    começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
//
//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a hora de inicio e a hora de fim da partida: ");

        int x = teclado.nextInt();
        int y = teclado.nextInt();

        int duracao;

        if (x < y){
            duracao = y - x;
        } else {
            duracao = 24 - x + y;
        }

        System.out.println("O jogo durou: " + duracao + " Hora(s).");

        teclado.close();

    }

}
