import java.util.Scanner;

public class Ejer_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu superhéroe favorito (Spider-Man, Iron Man, Batman): ");
        String superheroe = scanner.nextLine();

        if (superheroe.equalsIgnoreCase("Spider-Man")) {
            System.out.println("¡Te gustan las telarañas!");
        } else if (superheroe.equalsIgnoreCase("Iron Man")) {
            System.out.println("¡Te gustan los trajes de alta tecnología!");
        } else if (superheroe.equalsIgnoreCase("Batman")) {
            System.out.println("¡Eres el Caballero de la Noche!");
        } else {
            System.out.println("Superhéroe no válido.");
        }
    }
}
