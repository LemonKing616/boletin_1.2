import java.util.Scanner;

public class Ejer_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuál es tu nivel?: ");
        int nivel = scanner.nextInt();

        System.out.print("¿Cuántas misiones especiales has completado?: ");
        int misionesCompletadas = scanner.nextInt();

        if (nivel > 10 && misionesCompletadas > 20) {
            System.out.println("¡Acceso concedido!");
        } else {
            System.out.println("No tienes acceso.");
        }
    }
}