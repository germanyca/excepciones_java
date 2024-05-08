//SSLException

import javax.net.ssl.SSLException;
import java.util.Scanner;

public class Ventidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un mensaje:");
        String mensaje = scanner.nextLine();

        try {
            throw new SSLException("Error en la capa de seguridad SSL: " + mensaje); 
        } catch (SSLException e) {
            System.out.println("Error SSL: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}