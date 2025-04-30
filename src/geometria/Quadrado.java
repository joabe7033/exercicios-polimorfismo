package geometria;

public class Quadrado extends Formas {
    private String cor;

    public Quadrado(double lado, String cor) {
        super(lado, lado);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Quadrado [lado=" + base + ", cor=" + cor + ", área=" + calcularArea() + "]";
    }
}
