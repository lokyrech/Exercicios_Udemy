package Exe04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java

//    Enunciado: Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//    hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//    decimais.

    public static void main(String[] args) {
        int n, h;
        double ph, salary;

        Locale.setDefault(Locale.US);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número de série do funcionário:");
        n = teclado.nextInt();
        System.out.println("Informe o número de horas trabalhadas pelo funcionário:");
        h = teclado.nextInt();
        System.out.println("Informe o salário pago por hora:");
        ph = teclado.nextDouble();

        salary = h * ph;

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", n, salary);

        teclado.close();

    }


}
