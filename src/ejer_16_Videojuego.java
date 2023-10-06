import java.util.Scanner;

//Este programa solicitará al usuario ingresar su género favorito de videojuego y luego utilizará un
// switch  con pattern matching para imprimir un mensaje personalizado basado en el género ingresado.
// Por ejemplo, si el género es "Acción", imprimirá "¡Te encanta la emoción y la aventura!".
// Los otros géneros disponibles son "Aventura", "Estrategia" y "Rol". Si se ingresa un género
// no reconocido, se mostrará el mensaje "No se reconoce ese género de videojuego".

public class ejer_16_Videojuego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su género favorito de videojuego: ");
        String genero = scanner.nextLine();

        switch (genero.toLowerCase()) {
            case "acción" -> System.out.println("¡Te encanta la emoción y la aventura!");
            case "aventura" -> System.out.println("¡Disfrutas explorar nuevos mundos y resolver misterios!");
            case "estrategia" -> System.out.println("¡Te gusta planificar y tomar decisiones estratégicas!");
            case "rol" -> System.out.println("¡Sumérgete en una historia épica y desarrolla a tu personaje!");
            default -> System.out.println("No se reconoce ese género de videojuego.");
        }
    }
}