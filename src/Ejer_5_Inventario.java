import java.util.Scanner;

public class Ejer_5_Inventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monedasDeOro = 100;
        String nombreArma = "Espada";
        int nivelPersonaje = 10;
        double saludActual = 100.0;

        System.out.println("Inventario actual:");
        System.out.println("Monedas de oro: " + monedasDeOro);
        System.out.println("Arma equipada: " + nombreArma);
        System.out.println("Nivel del personaje: " + nivelPersonaje);
        System.out.println("Salud actual: " + saludActual);

        System.out.print("Ingresa el daño recibido: ");
        double danioRecibido = scanner.nextDouble();

        saludActual -= danioRecibido;

        System.out.println("Inventario actualizado:");
        System.out.println("Monedas de oro: " + monedasDeOro);
        System.out.println("Arma equipada: " + nombreArma);
        System.out.println("Nivel del personaje: " + nivelPersonaje);
        System.out.println("Salud actual: " + saludActual);
    }
}