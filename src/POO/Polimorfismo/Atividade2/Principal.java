package POO.Polimorfismo.Atividade2;

public class Principal {
    public static void main(String[] args) {

        Veiculo veiculoGenerico = new Veiculo();
        Veiculo porsche = new Carro();
        Veiculo magrela = new Bicicleta();

        veiculoGenerico.mover();

        porsche.mover();
        magrela.mover();

        Veiculo veiculo = new Veiculo();
    }
}
