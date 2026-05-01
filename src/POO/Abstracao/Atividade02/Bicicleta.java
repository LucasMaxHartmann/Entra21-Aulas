package POO.Abstracao.Atividade02;

public class Bicicleta extends Veiculo {

    public Bicicleta(String nome) {
        super(nome);
    }

    @Override
    public void mover() {
        System.out.println("Andando com a Magrela");
    }
}
