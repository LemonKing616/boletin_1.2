import java.util.Scanner;

//Este programa solicitará al usuario ingresar las longitudes de los tres lados
// del triángulo y luego determinará y mostrará el tipo de triángulo utilizando un
// switch  y la palabra clave  yield . Los posibles resultados son "Equilátero" si
// todos los lados son iguales, "Isósceles" si dos lados son iguales y "Escaleno"
// si todos los lados son diferentes.

public class ejer_15_TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del primer lado del triángulo: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Ingrese la longitud del segundo lado del triángulo: ");
        double lado2 = scanner.nextDouble();

        System.out.println("Ingrese la longitud del tercer lado del triángulo: ");
        double lado3 = scanner.nextDouble();

        String tipoTriangulo = determinarTipoTriangulo(lado1, lado2, lado3);

        System.out.println("El triángulo es de tipo: " + tipoTriangulo);
    }

    public static String determinarTipoTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}