import java.util.Scanner;

public class Ejer_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingresa la operación a realizar (suma, resta, multiplicación, división): ");
        String operacion = scanner.next();

        double resultado;

        switch (operacion) {
            case "suma":
            case "+":
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case "resta":
            case "-":
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case "multiplicación":
            case "*":
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case "división":
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Indeterminacion");
                }
                break;
            default:
                System.out.println("Operación inválida.");
        }
    }
}
