package POO.Polimorfismo.Atividade03;

public class Professor extends Funcionario {

    @Override
    public void trabalhar() {
        super.trabalhar();
        System.out.println("Professor dando aula");
    }
}
