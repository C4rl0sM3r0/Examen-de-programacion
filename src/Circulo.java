//CARLOS MERO
public class Circulo extends Figura {
    private double radio; // Atributo específico

    // Constructor que inicializa color y radio
    public Circulo(String color, double radio) {
        super(color); // Llama al constructor de Figura
        this.radio = radio;
    }

    // d) Implementación del método calcularArea() con fórmula del círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // d) Implementación del método calcularPerimetro() con fórmula del círculo
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
