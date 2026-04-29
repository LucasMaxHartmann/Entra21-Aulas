package POO.Basico.Encapsulamento.Polimorfismo.exemplo3;

public class Carrinho {

    private double valorCompra;

    public Carrinho(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void realizarCompra(MetodoPagamento metodoPagamento) {
        metodoPagamento.pagarAvista();
        System.out.println("Compra realizada com sucesso!");
    }
}
