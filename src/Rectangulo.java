// CARLOS MERO
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    // Constructor que inicializa color, base y altura
    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    // d) Implementación del método calcularArea() con fórmula del rectángulo
    @Override
    public double calcularArea() {
        return base * altura;
    }

    // d) Implementación del método calcularPerimetro() con fórmula del rectángulo
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
