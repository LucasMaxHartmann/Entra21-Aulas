package POO.Polimorfismo.exemplo3;

public class Pix extends MetodoPagamento{
    @Override
    public void pagarAvista() {
        super.pagarAvista();
        System.out.println("Pagando a vista com Pix!");
    }
}
