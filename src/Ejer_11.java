import java.util.Scanner;

public class Ejer_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingresa el planeta (Tierra, Marte, Júpiter): ");
        String planeta = scanner.next();

        double edadEnPlaneta;

        if (planeta.equalsIgnoreCase("Marte")) {
            edadEnPlaneta = edad / 1.88;
        } else if (planeta.equalsIgnoreCase("Júpiter")) {
            edadEnPlaneta = edad / 11.86;
        } else {
            edadEnPlaneta = edad;
        }

        System.out.println("Tu edad en " + planeta + " es " + edadEnPlaneta);
    }
}
