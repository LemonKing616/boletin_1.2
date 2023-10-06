import java.util.Scanner;

public class Ejer_6_if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la velocidad");
        String vehiculo = scanner.nextLine();

        int speed;

        if (vehiculo.equalsIgnoreCase("car")) {
            speed = 120;
        } else if (vehiculo.equalsIgnoreCase("motorcycle")) {
            speed = 90;
        } else if (vehiculo.equalsIgnoreCase("truck")) {
            speed = 80;
        } else {
            System.out.println("Invalid vehicle type.");
            return;
        }

        System.out.println("The speed of the " + vehiculo + " is " + speed + " km/h.");
    }
}
