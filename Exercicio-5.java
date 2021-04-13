import java.util.Scanner;

class Break { // Classe começa com letra maiúscula ANIMAL!
    public static void main(String args[]) {
        int valor = 0, n = 7;
        String volta;
        for (int i = 0; i <= 1; i++) {
            for (int j = 1; j <= 3; j++) {
                Scanner leitura = new Scanner(System.in);
                System.out.println("Insira um valor:");
                valor = leitura.nextInt();
                if (valor > n) {
                    System.out.println("Menor!");
                } else if (valor < n) {
                    System.out.println("Maior!");
                } else if (valor == n) {
                    System.out.println("Acertou!");
                    break;
                } else {
                    System.out.println("caracter invalido!");
                }
                System.out.println("Tente novamente!!!!");
            }

            Scanner retorno = new Scanner(System.in);
            System.out.println("Você deseja recomeçar, invocador? s/n ");
            volta = retorno.next();
            if (volta.equals("s")) {
                i++;
            } else if (volta.equals("n")) {
                System.out.println("Lhe-falta ódio!");
                break;

            }
        }
    }
}