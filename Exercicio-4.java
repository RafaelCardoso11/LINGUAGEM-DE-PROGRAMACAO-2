package Java;

import java.util.Scanner;
import java.text.DecimalFormat;

public class shaku {
    public static void main(String[] args) {
        Questao3();
    }

    public static void Questao1() {
        System.out.println("Desenvolvendo programas em Java!");
    }

    public static void Questao2() {
        int a, b;
        int soma;
        int sub;
        int divi;
        int multi;
        System.out.println("Digite um numero: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("Digite outro numero: ");
        b = in.nextInt();

        soma = a + b;
        divi = a / b;
        multi = a * b;
        sub = a - b;
        System.out.println("Resultado da soma: " + soma + "\nResultado da divisão: " + divi
                + "\nResultado da multiplicação: " + multi + "\nResultado da subtração: " + sub);
    }

    public static void  Questao3() {
          DecimalFormat df = new DecimalFormat(#.0000);
          System.out.println(Math.round(2.898));
                    System.out.println(df.format(2.4545455));
      }
}
