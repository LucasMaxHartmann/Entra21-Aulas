package POO.Encapsulamento.Exercício01;

public class Livro {

    private String titulo;
    private String autor;

    //Construtor
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    //Getters do titulo
    public String getTitulo() {
        return titulo;
    }
    //Getters do autor
    public String getAutor() {
        return autor;
    }
}
// COLOCAR UMA OBRIGATORIEDADE, O livro PRECISA ter um nome, não pode ser nulo (null);