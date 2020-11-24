package Exe06;

import java.util.Scanner;

public class Main {

//    Enunciado: Ler um número inteiro N e calcular todos os seus divisores.
//
//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1157.java

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor: ");
        int n = teclado.nextInt();

        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }

        System.out.println("Programa finalizado.");

        teclado.close();

    }

}
