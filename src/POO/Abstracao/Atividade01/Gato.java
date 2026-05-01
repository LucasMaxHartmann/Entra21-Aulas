package POO.Abstracao.Atividade01;

public class Gato extends Animal {

    public Gato(String nome){
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + "Diga: Miau!");
    }
}
