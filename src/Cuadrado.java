import java.util.Scanner;

public class Cuadrado extends Figura {
    @Override
    public double calcularArea() {
        Punto a = puntos.get(0);
        Punto b = puntos.get(1);
        double lado = a.calcularDistancia(b);
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        Punto a = puntos.get(0);
        Punto b = puntos.get(1);
        double lado = a.calcularDistancia(b);
        return 4 * lado;
    }

    @Override
    public void leerPuntos(Scanner scanner) {
        System.out.println("Ingrese las coordenadas de los 4 puntos del cuadrado:");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Ingrese la coordenada x del punto " + i + ": ");
            double x = scanner.nextDouble();
            System.out.print("Ingrese la coordenada y del punto " + i + ": ");
            double y = scanner.nextDouble();
            Punto punto = new Punto(x, y);
            agregarPunto(punto);
        }
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