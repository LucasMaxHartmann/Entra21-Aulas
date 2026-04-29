package POO.Polimorfismo.exemplo3;

public class Boleto extends MetodoPagamento{
    @Override
    public void pagarAvista() {
        super.pagarAvista();
        System.out.println("Pagando com Boleto!");
    }
}
