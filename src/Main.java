import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Figura figura = null;

        int opcionFigura;
        do {
            System.out.println("MENU DE FIGURAS");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Círculo");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción de figura: ");
            opcionFigura = sc.nextInt();

            switch (opcionFigura) {
                case 1:
                    figura = new Triangulo();
                    figura.ingresarPuntos();
                    break;
                case 2:
                    figura = new Cuadrado();
                    ((Cuadrado) figura).ingresarLado();
                    break;
                case 3:
                    figura = new Circulo();
                    ((Circulo) figura).ingresarRadio();
                    break;
                case 4:
                    System.out.println("¡Hasta Pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            if (figura != null && opcionFigura != 4) {
                int opcionCalculo;
                do {
                    System.out.println("\nMENU DE CÁLCULO");
                    System.out.println("1. Calcular perímetro");
                    System.out.println("2. Calcular área");
                    System.out.println("3. Regresar al menú de figuras");
                    System.out.print("Ingrese la opción de cálculo: ");
                    opcionCalculo = sc.nextInt();

                    switch (opcionCalculo) {
                        case 1:
                            double perimetro = figura.calcularPerimetro();
                            System.out.println("El perímetro es: " + perimetro);
                            break;
                        case 2:
                            double area = figura.calcularArea();
                            System.out.println("El área es: " + area);
                            break;
                        case 3:
                            System.out.println();
                            break;
                        default:
                            System.out.println("Opción inválida. Intente nuevamente.");
                            break;
                    }
                } while (opcionCalculo != 3);
            }
        } while (opcionFigura != 4);
    }
}