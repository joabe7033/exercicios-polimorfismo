package geometria;

public class Circulo extends Formas {
    private double circunferencia;

    public Circulo(double raio) {
        super(raio * 2, raio * 2); // base e altura representam o diâmetro
        this.circunferencia = 2 * Math.PI * raio;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    @Override
    public double calcularArea() {
        double raio = base / 2;
        return Math.PI * raio * raio;
    }

    public double calcularCircunferencia() {
        return circunferencia;
    }

    @Override
    public String toString() {
        double raio = base / 2;
        return "Círculo [raio=" + raio + ", circunferência=" + circunferencia + ", área=" + calcularArea() + "]";
    }
}
