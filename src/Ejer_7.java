import java.util.Scanner;

public class Ejer_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿De qué tipo prefieres tu Pokémon (fuego, agua o planta)?: ");
        String tipo = scanner.nextLine(); //INPUT

        String eleccion;                  //OUTPUT

        if (tipo.equalsIgnoreCase("fuego")) {
            eleccion = "Charmander";
        } else if (tipo.equalsIgnoreCase("agua")) {
            eleccion = "Squirtle";
        } else if (tipo.equalsIgnoreCase("planta")) {
            eleccion = "Bulbasaur";
        } else {
            System.out.println("Ese tipo no es válido.");
            return;
        }

        System.out.println("Tu Pokémon es " + eleccion + ". ¡Enhorabuena!");
    }
}