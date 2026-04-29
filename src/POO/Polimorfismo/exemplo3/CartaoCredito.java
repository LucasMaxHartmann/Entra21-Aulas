package POO.Polimorfismo.exemplo3;

public class CartaoCredito extends MetodoPagamento{
    @Override
    public void pagarAvista() {
        super.pagarAvista();
        System.out.println("Pagando no cartão de crédito!");
    }
}
