//CARLOS MERO
public class Figura {
    // Atributo protegido color
    protected String color;

    // Constructor que inicializa el color
    public Figura(String color) {
        this.color = color;
    }

    // b) Método calcularArea() con mensaje
    public double calcularArea() {
        System.out.println("Estoy calculando el área");
        return 0;
    }

    // b) Método calcularPerimetro() con mensaje
    public double calcularPerimetro() {
        System.out.println("Estoy Calculando el Perimetro");
        return 0;
    }

    // b) Método mostrarColor() que imprime el nombre del color
    public void mostrarColor() {
        System.out.println("Color: " + color);
    }
}
