package POO.Abstracao.Atividade01;

public class Main {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Bello ");
        Animal gato = new Gato("Zig ");

        cachorro.emitirSom();
        gato.emitirSom();
    }
}
