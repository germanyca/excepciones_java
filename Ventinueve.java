//ReadOnlyBufferException

import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.Scanner;

public class Ventinueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String cadena = scanner.nextLine();

        try {
            ByteBuffer buffer = ByteBuffer.allocate(10);
            buffer.put(cadena.getBytes());
            buffer.flip();
            buffer.asReadOnlyBuffer();
            buffer.put((byte) 'x'); 
        } catch (ReadOnlyBufferException e) {
            System.out.println("El buffer está en modo de solo lectura.");
        } finally {
            scanner.close();
        }
    }
}