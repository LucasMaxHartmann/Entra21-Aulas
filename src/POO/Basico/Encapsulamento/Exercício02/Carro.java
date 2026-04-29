package POO.Basico.Encapsulamento.Exercício02;

public class Carro {

    private String marca;
    private String modelo;

    //Construtor
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    //Getters da marca
    public String getMarca() {
        return marca;
    }

    //Setter da marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Getters modelo
    public String getModelo() {
        return modelo;
    }

    //Setter do modelo
    public void setModelo(String modelo) {
        this.modelo = marca;
    }
}
