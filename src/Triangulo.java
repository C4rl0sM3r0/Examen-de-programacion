//CARLOS MERO
public class Triangulo extends Figura {
    private double lado1, lado2, lado3;

    // Constructor que inicializa color y lados
    public Triangulo(String color, double lado1, double lado2, double lado3) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // d) Implementación del método calcularArea() usando fórmula de Herón
    @Override
    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2; // semiperímetro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    // d) Implementación del método calcularPerimetro() sumando los lados
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
