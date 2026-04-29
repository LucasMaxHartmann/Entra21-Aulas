package POO.Basico.Herança.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Fernando", 18);
        Aluno aluno = new Aluno("Luigi", 18, "3w4s5drftyg");

        aluno.apresentar();

        System.out.println("Nome aluno: " + aluno.getNome());
        System.out.println("Idade aluno: " + aluno.getIdade());
        System.out.println("Matrícula aluno: " + aluno.getMatricula());
    }
}
