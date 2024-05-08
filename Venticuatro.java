//TooManyListenersException

import java.util.EventListener;
import java.util.TooManyListenersException;
import java.util.Scanner;

public class Venticuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de escuchadores:");
        int numEscuchadores = Integer.parseInt(scanner.nextLine());

        try {
            if (numEscuchadores > 2) {
                throw new TooManyListenersException("Demasiados escuchadores");
            } else {
                System.out.println("Número de escuchadores aceptable.");
            }
        } catch (TooManyListenersException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}