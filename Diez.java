//NumberFormatException

import java.util.Scanner;

public class Diez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        String input = scanner.nextLine();

        try {
            int numero = Integer.parseInt(input);
            System.out.println("El número es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: El formato del número ingresado es inválido.");
        } finally {
            scanner.close();
        }
    }
}