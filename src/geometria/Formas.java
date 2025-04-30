package geometria;

public abstract class Formas {
    protected double base;
    protected double altura;

    public Formas(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public abstract double calcularArea();

    @Override
    public abstract String toString();
}
