package POO.Polimorfismo.Atividade03;

public class Designer extends Funcionario {

    @Override
    public void trabalhar() {
        super.trabalhar();
        System.out.println("Designer em ação!!");
    }
}
