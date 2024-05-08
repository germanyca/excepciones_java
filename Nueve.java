//NullPointerException

import java.util.Scanner;

public class Nueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String cadena = scanner.nextLine();

        try {
            if (cadena != null) {
                System.out.println("La longitud de la cadena es: " + cadena.length());
            } else {
                throw new NullPointerException("Error: La cadena no puede ser nula.");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}