package Exe01;

import java.util.Scanner;

public class Main {

//    Enunciado: Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//    X, se for o caso.
//
//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1067.java

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int meta = teclado.nextInt();

        if(meta>0 && meta<=1000) {
            for (int i = 1; meta >= i; i++) {
                if(i%2 == 1){
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Valor fora do intervalo permitido.\nO valor informado deve ser maior do que 1 e menor do que 1000.");
        }

        System.out.println("Programa finalizado.");

        teclado.close();

    }

}
