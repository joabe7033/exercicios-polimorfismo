import geometria.Circulo;
import geometria.Quadrado;

public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quadrado = new Quadrado(5.0, "Azul");
        System.out.println("----- QUADRADO -----");
        System.out.println(quadrado.toString());

        Circulo circulo = new Circulo(3.0);
        System.out.println("\n----- CÍRCULO -----");
        System.out.println(circulo.toString());
    }
}