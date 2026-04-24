package POO.Basico.Exemplo1;

import java.sql.SQLOutput;

public class Carro {
    String cor;
    String modelo;
    String marca;
    int ano;
    Pessoa dono;

    void ligar() {
        if (dono == null) {
            System.out.println("Carro sem dono");
        } else {
            dono.apresentar();
            System.out.println("Vruuuuuuuuuuuuuuuuuuuuuuuuun");
        }
    }
}

