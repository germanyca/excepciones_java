//ClosedByInterruptException

import java.nio.channels.ClosedByInterruptException;
import java.util.Scanner;

public class Ventisiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Presione enter para interrumpir la operación...");
            scanner.nextLine();
            throw new ClosedByInterruptException();
        } catch (ClosedByInterruptException e) {
            System.out.println("La operación fue interrumpida.");
        } finally {
            scanner.close();
        }
    }
}