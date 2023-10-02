import java.util.Scanner;

public class Ejer_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de enemigos derrotados: ");
        int enemigosDerrotados = scanner.nextInt();

        int puntos;

        if (enemigosDerrotados > 50) {
            puntos = enemigosDerrotados * 2;
        } else {
            puntos = enemigosDerrotados;
        }

        System.out.println("Puntos totales: " + puntos);
    }
}
