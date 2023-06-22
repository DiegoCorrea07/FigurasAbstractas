import java.util.Scanner;

public class Circulo extends Figura {
    private double radio;

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public void ingresarRadio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo: ");
        radio = sc.nextDouble();
    }
}
