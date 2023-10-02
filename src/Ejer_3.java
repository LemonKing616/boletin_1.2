import java.util.Scanner;

public class Ejer_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la calificación del primer examen: ");
        double examen1 = scanner.nextDouble();

        System.out.print("Ingresa la calificación del segundo examen: ");
        double examen2 = scanner.nextDouble();

        System.out.print("Ingresa la calificación del tercer examen: ");
        double examen3 = scanner.nextDouble();

        double promedio = (examen1 + examen2 + examen3) / 3;
        System.out.println("Tu promedio es: " + promedio);
    }
}