import java.util.Scanner;

public class Ejer_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu animal favorito (gato, sapo, búho): ");
        String animal = scanner.nextLine();

        System.out.print("Ingresa tu color favorito (rojo, azul, verde, amarillo): ");
        String color = scanner.nextLine();

        System.out.print("Ingresa tu asignatura favorita (Encantamientos, Herbología, Pociones): ");
        String asignatura = scanner.nextLine();

        String casa;

        if (animal.equalsIgnoreCase("gato") && color.equalsIgnoreCase("rojo")) {
            casa = "Gryffindor";
        } else if (animal.equalsIgnoreCase("sapo") && color.equalsIgnoreCase("azul")) {
            casa = "Ravenclaw";
        } else if (animal.equalsIgnoreCase("búho") && color.equalsIgnoreCase("verde") && asignatura.equalsIgnoreCase("Encantamientos")) {
            casa = "Slytherin";
        } else {
            casa = "Hufflepuff";
        }

        System.out.println("¡Perteneces a la casa " + casa + "!");
    }
}
