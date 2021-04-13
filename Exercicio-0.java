package olamundo;

public class OlaMundo {

    public static void main(String[] args) {
        // a linha a seguir representa um objeto de " apilido " p1.
        Pessoa p1 = new Pessoa();
        Pessoa px = new Pessoa();
        px.setNome("AndrÃ© Rafael");    
        System.out.println(p1.getNome() + "\n" + px.getNome()); // retornando  o mÃ©todo
        p1.setanoNasc(17);
        p1.setALtura(1.83);
        p1.setPeso(63, true);
        System.out.println("Altura = " + p1.getAltura()+ " | Peso = " + p1.getpeso());
        System.out.println(p1.getSitImc());
    }

}