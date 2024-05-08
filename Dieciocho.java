//BindException

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;

public class Dieciocho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de puerto:");
        int puerto = Integer.parseInt(scanner.nextLine());

        try {
            ServerSocket servidor = new ServerSocket(puerto);
            System.out.println("Servidor en espera en el puerto " + puerto);
        } catch (IOException e) {
            System.out.println("No es posible enlazar el servidor al puerto especificado.");
        } finally {
            scanner.close();
        }
    }
}