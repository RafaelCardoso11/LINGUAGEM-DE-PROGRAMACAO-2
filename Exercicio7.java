import javax.swing.JOptionPane; // biblioteca para interface gráfica; JOptionPanne é a janelinha
import java.util.Scanner;
class blebleble{
        public static void main(String args[]){
            String nome, resposta;
            int idade;
            nome = JOptionPane.showInputDialog("Digite seu nome: "); // envia a janela para receber os dados do usuário que são armazenados na variavel nome;para strings
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));// dados de entrada são convertidos pra int
            JOptionPane.showMessageDialog(null,nome + " você tem " + idade + " anos de idade."); // null centraliza a janela na tela do usuário
            JOptionPane.showMessageDialog(null,nome + " você tem " + (idade + 2) + " anos de idade.") ; // só mostra a mensagem, sem solicitar a entrada de dados
        
            resposta = JOptionPane.showInputDialog("Você gosta de batata? "); 
            if((resposta.equalsIgnoreCase("Sim"))){
                JOptionPane.showMessageDialog(null,"Que legal! ");
    }else{
        JOptionPane.showMessageDialog(null,"comassim? ");
}
}
}

/*
class Salario{
    public static void main(String args[]){
        double salario,salariom, qtdsal;
        Scanner ble = new Scanner(System.in);
        System.out.println("Digite o seu salário: ");
        salario = ble.nextDouble();
        System.out.println("Digite o salário mínimo: ");
        salariom = ble.nextDouble();
        qtdsal = salario / salariom;
        System.out.println("Você ganha " + qtdsal + " salarios mínimos.");
        
        
    }
}
class Tabuada{
    public static void main(String args[]){
     int numero,vetor[];
     numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para saber sua tabuada: "));
     for(int i = 1; i < 11; i++){
         JOptionPane.showMessageDialog(null,numero + " X " + i + " = " + (numero * i));
        }
    }
}
class Deposito{
    public static void main(String args[]){
        double deposito, taxa, rendimento, total;
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
        taxa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da taxa sobre o depósito: "));
        rendimento = taxa * deposito;
        total = rendimento + deposito;
        JOptionPane.showMessageDialog(null,"O rendimento é de: R$" + rendimento);
        JOptionPane.showMessageDialog(null,"O total é de: R$" + total);
        }
}
class Idade{
    public static void main(String args[]){
        int idade, dias, meses, horas, minutos;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        meses = idade * 30;
        JOptionPane.showMessageDialog(null,"Você está vivo a " + meses + " meses.");
        dias = idade * 365;
        JOptionPane.showMessageDialog(null,"Você está vivo a " + dias + " dias.");
        horas = idade * (dias * 24);
        JOptionPane.showMessageDialog(null,"Você está vivo a " + horas + " horas.");
        minutos = idade * (horas * 60);
        JOptionPane.showMessageDialog(null,"Você está vivo a " + minutos + " minutos.");
    }
    }*/