package Exe08;

import java.util.Locale;
import java.util.Scanner;

public class Main {

//    Enunciado: Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//    que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//    qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//    Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//    mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
//
//    0 - 2000 = Isento
//    2000.01 - 3000 = 8%
//    3000.01 - 4500 = 18%
//    >4500 = 28%
//
//    Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//    salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//    de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//    duas casas decimais.
//
//    Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1051.java

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o salário: ");

        double x = teclado.nextDouble();
        double imposto;

        if (x <= 0) {
            System.out.println("Impossível. Vá arrumar um emprego descente.");
        } else {
            if (x <= 2000.0){
                System.out.println("Isento de imposto.");
            } else if (x > 2000.0 && x <= 3000.0) {
                imposto = (x - 2000.0) * 0.08;
                System.out.printf("O imposto a ser pago é: R$ %.2f.%n", imposto);
            } else if (x > 3000.0 && x <= 4500.0) {
                imposto = (x - 3000.0) * 0.18 + (1000.0 * 0.08);
                System.out.printf("O imposto a ser pago é: R$ %.2f.%n", imposto);
            } else if (x > 4500.0) {
                imposto = (x - 4500.0) * 0.28 + (1500.0 * 0.18) + (1000.0 * 0.08);
                System.out.printf("O imposto a ser pago é: R$ %.2f.%n", imposto);
            }
        }

        teclado.close();

    }

}
