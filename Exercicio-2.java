
import java.util.Scanner;
import javax.swing.JOptionPane; // biblioteca para interface gráfica; JOptionPanne é a janelinha

class Rafael {
    public static void main(String args[]) {
        double salario;
        double imposto;
        Scanner rafinha = new Scanner(System.in);
        System.out.println("Digite o valor do salario do funcionario: ");
        salario = rafinha.nextDouble();
        imposto = salario * 25 / 100;
        System.out.println("Resultado : " + imposto);

    }
}
