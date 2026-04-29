package POO.Basico.Encapsulamento.Polimorfismo.exemplo1;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Miau miau >//<");
    }
}
