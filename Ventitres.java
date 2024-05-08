//TimeoutException

import java.util.concurrent.TimeoutException;
import java.util.Scanner;

public class Ventitres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tiempo límite (seg):");
        int tiempoLimite = Integer.parseInt(scanner.nextLine());

        try {
            if (tiempoLimite > 10) {
                throw new TimeoutException("Tiempo límite excedido");
            } else {
                System.out.println("Operación completada dentro del tiempo límite.");
            }
        } catch (TimeoutException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}