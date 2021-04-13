
import java.util.Scanner;
import javax.swing.JOptionPane; // biblioteca para interface gráfica; JOptionPanne é a janelinha

class quilowatt {
    public static void main(String args[]) {
        double quilowatt;
        double calc;
        double calc2;
        double calc3;
        Scanner rafinha = new Scanner(System.in);
        System.out.println("Digite a quantidade de quilowatts gasta pela residência: ");
        quilowatt = rafinha.nextDouble();
        calc = 988 * 2 / 100;
        calc2 = calc * quilowatt;
        calc3 = calc2 * 15 / 100;
        System.out.println("Valor pago por cada quilowatt: R$" + calc + "/n Valor a ser pago pela residência R$" + calc2
                + "/n Com um desconto de 15% R$" + calc3);
    }
}
