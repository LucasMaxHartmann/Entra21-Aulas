package POO.Basico.Encapsulamento.Exercício03;

public class Identidade {

    private String cpf;
    private String nome;

    //Construtor
    public Identidade(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    //Getter do cpf
    public String getCpf() {
        return cpf;
    }

    //Getters do nome
    public String getNome() {
        return nome;
    }
}

