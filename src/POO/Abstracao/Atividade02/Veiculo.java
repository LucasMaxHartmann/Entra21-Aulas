package POO.Abstracao.Atividade02;

public abstract class Veiculo {

    private String modelo;

    public Veiculo(String modelo){
        this.modelo = modelo;
    }

    public abstract void mover();
}
