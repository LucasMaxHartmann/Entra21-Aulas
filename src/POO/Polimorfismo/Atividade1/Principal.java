package POO.Polimorfismo.Atividade1;

public class Principal {
    public static void main(String[] args) {
        Animal animalGenerico = new Animal();
        Animal pandora = new Cachorro();
        Animal floco = new Gato();

        animalGenerico.emitirSom();
        pandora.emitirSom();
        floco.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.perseguirCarteiro();
    }
}
