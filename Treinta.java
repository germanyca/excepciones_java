//FileLockInterruptionException

import java.nio.channels.FileLockInterruptionException;
import java.util.Scanner;

public class Treinta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Presione enter para interrumpir el bloqueo...");
            scanner.nextLine();
            throw new FileLockInterruptionException();
        } catch (FileLockInterruptionException e) {
            System.out.println("El bloqueo de archivo fue interrumpido.");
        } finally {
            scanner.close();
        }
    }
}