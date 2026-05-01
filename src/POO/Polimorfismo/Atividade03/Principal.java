package POO.Polimorfismo.Atividade03;

public class Principal {

    public static void main(String[] args) {


        Funcionario funcionarioGenerico = new Funcionario();
        Funcionario FernandoEntra21 = new Professor();
        Funcionario lucas = new Programador();
        Funcionario Ian = new Designer();

        FernandoEntra21.trabalhar();
        lucas.trabalhar();
        Ian.trabalhar();

    }
}
