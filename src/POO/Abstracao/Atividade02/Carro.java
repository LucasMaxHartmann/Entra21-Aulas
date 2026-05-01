package POO.Abstracao.Atividade02;

public class Carro extends Veiculo {

    public Carro(String nome) {
        super(nome);
    }

    @Override
    public void mover() {
        System.out.println("Andando de carro");
    }
}



