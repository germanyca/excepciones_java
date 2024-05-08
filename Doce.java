//RuntimeException

import java.util.Scanner;

public class Doce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = Integer.parseInt(scanner.nextLine());

        try {
            if (numero < 0) {
                throw new RuntimeException("El número ingresado debe ser positivo.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}