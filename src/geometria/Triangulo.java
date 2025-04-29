package geometria;

public class Triangulo extends Formas {
    private String tipo;

    public Triangulo(double base, double altura, String tipo) {
        super(base, altura);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return null;
    }

    

}
