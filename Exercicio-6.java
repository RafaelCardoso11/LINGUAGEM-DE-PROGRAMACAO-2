import java.util.Scanner;
public class pessoa {
    private String name;
    private float altura;
    private int anoNasc;
    private int idade;
   
     public void getUsuario(String name){
   
        system.out.println("Ola, imforme o seu nome: ");
         this.name = input.next();
       
    }
    public float setAltura(){
         system.out.println("Imforme sua altura: ");
          this.altura = input.nextInt();
          return this.altura;
    }
    public int setCalcIdade(int anoAtual){
        anoAtual = 2020;
        this.idade = this.anoAtual - this.anoNasc;
        return this.idade;
    }

}


public class pessoaTest (int idade, float altura, String name) {
public static void main(String[] args) {

    system.out.println("Nome do usuario: "+ name);
    system.out.println("Idade:" + idade);
    system.out.println("Altura:" + altura);

    }
}