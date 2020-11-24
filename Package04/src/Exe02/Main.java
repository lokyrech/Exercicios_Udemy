package Exe02;

import java.util.Scanner;

public class Main {

//    Enunciado: Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//    Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//    essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
//
//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1072.java

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int n = teclado.nextInt();
        int valor = 0;
        int in = 0;
        int out = 0;

        for(int i = 0; i < n; i++){
            valor = teclado.nextInt();
            if(valor >= 10 && valor <= 20){
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        teclado.close();

    }

}
