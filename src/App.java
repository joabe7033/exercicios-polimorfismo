import geometria.Circulo;
import geometria.Quadrado;
import geometria.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quadrado = new Quadrado(5.0, "Azul");
        System.out.println("----- QUADRADO -----");
        System.out.println(quadrado.toString());
        System.out.println("Cor do quadrado: " + quadrado.getCor());

        Circulo circulo = new Circulo(3.0);
        System.out.println("\n----- CÍRCULO -----");
        System.out.println(circulo.toString());
        System.out.println("Circunferência do círculo: " + circulo.calcularCircunferencia());

        Triangulo triangulo = new Triangulo(6.0, 4.0, "Equilátero");
        System.out.println("\n----- TRIÂNGULO -----");
        System.out.println(triangulo.toString());
        System.out.println("Tipo do triângulo: " + triangulo.getTipo());
    }
}
