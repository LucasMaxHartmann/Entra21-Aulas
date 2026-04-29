package POO.Basico.Encapsulamento.Exercício01;

public class Principal {
    public static void main(String[] args) {

        Livro livro = new Livro("Dom Casmurro", "Machado de Assis");

        System.out.println(livro.getTitulo());
        System.out.println(livro.getAutor());
    }
}
// COLOCAR UMA OBRIGATORIEDADE, O livro PRECISA ter um nome, não pode ser nulo (null);