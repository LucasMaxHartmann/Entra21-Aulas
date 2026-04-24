package POO.Basico.Exercicios.Exercícios01e02;

public class Aluno {

    String nome;
    int idade;

    // Construtor vazio para incluir mais de 1 nome de aluno
    public Aluno() {}

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void estudar () {
        System.out.println(this.nome + " está estudando");
    }
}
