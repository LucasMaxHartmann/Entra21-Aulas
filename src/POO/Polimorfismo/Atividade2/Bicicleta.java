package POO.Polimorfismo.Atividade2;

public class Bicicleta extends  Veiculo {

    @Override
    public void mover() {
        super.mover();
        System.out.println("Bicicleta em movimento");
    }
}
