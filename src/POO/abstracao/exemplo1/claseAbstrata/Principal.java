package POO.abstracao.exemplo1.claseAbstrata;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        Retangulo retangulo = new Retangulo(3,4);

        double areaCirculo = circulo.calcularArea();
        double areaRetangulo = retangulo.calcularArea();

        System.out.println("A área do círculo é " + areaCirculo);
        System.out.println("A área do retangulo é " + areaRetangulo);

        FormaGeometricaAbstract quadrado = new Retangulo(2,2);
        System.out.println("Area do quadrado é " + quadrado.calcularArea());
    }
}
