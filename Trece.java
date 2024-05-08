//StringIndexOutOfBoundsExceptio

import java.util.Scanner;

public class Trece {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String cadena = scanner.nextLine();

        try {
            System.out.println("El primer caracter es: " + cadena.charAt(0));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("La cadena está vacía.");
        } finally {
            scanner.close();
        }
    }
}