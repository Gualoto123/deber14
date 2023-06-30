import java.util.Scanner;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {

        return 2 * Math.PI * radio;
    }

    @Override
    public void leerPuntos(Scanner scanner) {

    }
    @Override
    public void leerPuntos(Scanner scanner, int cantidadPuntos) {
        System.out.println("Ingrese las coordenadas de los " + cantidadPuntos + " puntos del triángulo:");
        for (int i = 1; i <= cantidadPuntos; i++) {
            System.out.print("Ingrese la coordenada x del punto " + i + ": ");
            double x = scanner.nextDouble();
            System.out.print("Ingrese la coordenada y del punto " + i + ": ");
            double y = scanner.nextDouble();
            Punto punto = new Punto(x, y);
            agregarPunto(punto);
        }
    }
}
