package POO.AtividadeRefatoracao01;

public class Produto {

    // Atributos
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {

        this.nome = nome;
        setPreco(preco);
        setQuantidade(quantidade);
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {

        // Validação do preço
        if (preco < 0) {

            System.out.println("Preço negativo não permitido. Valor definido como 0.");
            this.preco = 0;

        } else {

            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {

        // Validação da quantidade
        if (quantidade < 0) {

            System.out.println("Quantidade negativa não permitida. Valor definido como 0.");
            this.quantidade = 0;

        } else {

            this.quantidade = quantidade;
        }
    }

    // Método para exibir detalhes
    public void exibirDetalhes() {

        System.out.println(
                "Produto: " + nome +
                        " | Preço: R$ " + preco +
                        " | Quantidade: " + quantidade
        );
    }
}