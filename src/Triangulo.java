import java.util.Scanner;

public class Triangulo extends Figura {
    @Override
    public double calcularArea() {
        Punto a = puntos.get(0);
        Punto b = puntos.get(1);
        Punto c = puntos.get(2);
        double base = a.calcularDistancia(b);
        double altura = c.calcularDistancia(a);
        return base * altura / 2;
    }
    @Override
    public double calcularPerimetro() {
        Punto a = puntos.get(0);
        Punto b = puntos.get(1);
        Punto c = puntos.get(2);
        double ladoAB= a.calcularDistancia(b);
        double ladoBC= b.calcularDistancia(c);
        double ladoCA= c.calcularDistancia(a);
        return ladoAB+ladoBC+ladoCA;
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
