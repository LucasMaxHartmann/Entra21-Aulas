package POO.AtividadeRefatoracao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n--- Inventário ---");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Calcular Valor Total do Estoque");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    adicionarProduto(sc);
                    break;

                case 2:
                    listarProdutos();
                    break;

                case 3:
                    calcularTotal();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }

    // Método para adicionar produto
    public static void adicionarProduto(Scanner sc) {

        System.out.print("Nome do Produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço do Produto: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade do Produto: ");
        int quantidade = sc.nextInt();

        sc.nextLine();

        Produto produto = new Produto(nome, preco, quantidade);

        produtos.add(produto);

        System.out.println("Produto adicionado com sucesso!");
    }

    // Método para listar produtos
    public static void listarProdutos() {

        System.out.println("\n--- Lista de Produtos ---");

        if (produtos.isEmpty()) {

            System.out.println("Nenhum produto cadastrado.");

        } else {

            for (Produto produto : produtos) {

                produto.exibirDetalhes();
            }
        }
    }

    // Método para calcular valor total do estoque
    public static void calcularTotal() {

        double total = 0;

        for (Produto produto : produtos) {

            total += produto.getPreco() * produto.getQuantidade();
        }

        System.out.println("Valor total do estoque: R$ " + total);
    }
}