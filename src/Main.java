// e) Clase principal que usa polimorfismo para recorrer un arreglo de figuras
public class Main {
    public static void main(String[] args) {
        // Arreglo de tipo Figura con instancias de cada subclase
        Figura[] figuras = {
                new Circulo("Rojo", 3.5),
                new Rectangulo("Verde", 4, 6),
                new Triangulo("Azul", 3, 4, 5)
        };

        // Polimorfismo: cada figura se comporta según su tipo real
        for (Figura f : figuras) {
            System.out.println("Tipo de figura: " + f.getClass().getSimpleName());
            f.mostrarColor(); // Muestra el color
            System.out.println("Área: " + f.calcularArea()); // Calcula área
            System.out.println("Perímetro: " + f.calcularPerimetro()); // Calcula perímetro
            System.out.println("-----------------------------");
        }
    }
}
