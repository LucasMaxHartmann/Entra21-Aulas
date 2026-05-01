package POO.Polimorfismo.Atividade2;

public class Carro extends Veiculo {

    @Override
    public void mover() {
        super.mover();
        System.out.println("Carro em movimento");
    }
}
