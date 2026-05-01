package POO.Polimorfismo.Atividade03;

public class Programador extends Funcionario {

    @Override
    public void trabalhar() {
        super.trabalhar();
        System.out.println("Silêncio. Estou Codando...");
    }
}
