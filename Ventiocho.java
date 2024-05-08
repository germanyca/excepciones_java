//ProviderException

import java.security.ProviderException;
import java.util.Scanner;

public class Ventiocho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = Integer.parseInt(scanner.nextLine());

        try {
            if (numero < 0) {
                throw new ProviderException("El número no puede ser negativo.");
            } else {
                System.out.println("El número es: " + numero);
            }
        } catch (ProviderException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}