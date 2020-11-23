package Exe01;

import java.util.Scanner;

public class Main {

//    Enunciado: Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//    incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//    impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
//
//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1114.java

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senha = teclado.nextLine();

        while (!senha.equals("2002")){
            System.out.println("Acesso Negado.");
            System.out.print("Digite a senha novamente: ");
            senha = teclado.nextLine();
        }

        System.out.println("\nAcesso Permitido!");

        teclado.close();
    }

}
