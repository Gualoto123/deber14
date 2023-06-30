import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        ArrayList<Figura> figuras = new ArrayList<>();

        do {
            System.out.println("Escoja una opción:");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Círculo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 3) {
                Figura figura;
                double area = 0;
                double perimetro = 0;

                switch (opcion) {
                    case 1:
                        figura = new Triangulo();
                        leerPuntos(figura, scanner, 3);
                        area = figura.calcularArea();
                        perimetro = figura.calcularPerimetro();
                        break;
                    case 2:
                        figura = new Cuadrado();
                        leerPuntos(figura, scanner, 2);
                        area = figura.calcularArea();
                        perimetro = figura.calcularPerimetro();
                        break;
                    case 3:
                        System.out.print("Ingrese el radio del círculo: ");
                        double radio = scanner.nextDouble();
                        figura = new Circulo(radio);
                        area = figura.calcularArea();
                        perimetro = figura.calcularPerimetro();
                        break;
                    default:
                        continue;
                }

                figuras.add(figura);

                System.out.println("El área de la figura es: " + area);
                System.out.println("El perímetro de la figura es: " + perimetro);
            }
        } while (opcion != 0);

        System.out.println("Lista de figuras ingresadas:");
        for (Figura figura : figuras) {
            System.out.println("Tipo: " + figura.getClass().getSimpleName());
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("-------------------------");
        }
    }

    private static void leerPuntos(Figura figura, Scanner scanner, int cantidadPuntos) {
        figura.leerPuntos(scanner, cantidadPuntos);
    }
}