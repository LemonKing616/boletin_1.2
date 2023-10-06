import java.util.Scanner;

public class Ejer_13_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu comida rápida favorita (Hamburguesa, Pizza, Tacos, Ensalada): ");
        String comida = scanner.nextLine();

        switch (comida) {
            case "Hamburguesa":
                System.out.println("¡Amante de las hamburguesas!");
                break;
            case "Pizza":
                System.out.println("¡Amante de la masa y el queso!");
                break;
            case "Tacos":
                System.out.println("¡Amante de los tacos!");
                break;
            case "Ensalada":
                System.out.println("¡Amante de las ensaladas!");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}
