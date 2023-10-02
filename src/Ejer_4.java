import java.util.Scanner;

public class Ejer_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la distancia a tu destino en kilómetros: ");
        double distancia = scanner.nextDouble();

        System.out.print("Ingresa la velocidad a la que viajarás en km/h: ");
        double velocidad = scanner.nextDouble();

        double tiempoEnHoras = distancia / velocidad;
        int tiempoEnMinutos = (int) (tiempoEnHoras * 60);

        System.out.println("El tiempo estimado de viaje es de " + (int) tiempoEnHoras + " horas y " + tiempoEnMinutos + " minutos.");
    }
}