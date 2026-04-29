package POO.Encapsulamento.Exercício02;

public class Principal {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "2025");

        //Testando Getters
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());


        //Testando Setters
        carro.setMarca("Honda");
        carro.setModelo("Civic");

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
    }
}
