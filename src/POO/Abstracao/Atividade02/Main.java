package POO.Abstracao.Atividade02;

public class Main {
    public static void main(String[] args) {

        Veiculo Carro = new Carro("Sentra");
        Veiculo Bicicleta = new Bicicleta("Magrela");

        Carro.mover();
        Bicicleta.mover();
    }
}
