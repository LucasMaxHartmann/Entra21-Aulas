package POO.Abstracao.Atividade03;

public class Main {
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Lucas", 2_000d,500d);

        System.out.println("O salario final com o fixo de " + vendedor.getSalarioBase() + " somado com a comissao de " + vendedor.getComissao() + " fica com um total de: " + (vendedor.getSalarioBase() + vendedor.getComissao()));
        System.out.println(vendedor.calcularSalario());
    }
}
