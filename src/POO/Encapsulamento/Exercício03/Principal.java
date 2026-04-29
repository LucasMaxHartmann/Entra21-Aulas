package POO.Encapsulamento.Exercício03;

public class Principal {
    public static void main(String[] args) {

        Identidade identidade = new Identidade("123.456.789-10", "Fernando");

        System.out.println(identidade.getCpf());
        System.out.println(identidade.getNome());
    }
}
