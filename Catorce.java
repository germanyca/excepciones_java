//ClassCastException

import java.util.Scanner;

public class Catorce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto:");
        String texto = scanner.nextLine();

        try {
            Object objeto = texto;
            Integer numero = (Integer) objeto;
        } catch (ClassCastException e) {
            System.out.println("No es posible convertir un String a un Integer.");
        } finally {
            scanner.close();
        }
    }
}