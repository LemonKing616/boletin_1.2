import java.util.Scanner;

public class Ejer_2_temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
    }
}