//UnknownHostException

import java.util.Scanner;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class  DiesSiete{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del host:");
        String nombreHost = scanner.nextLine();

        try {
            InetAddress direccion = InetAddress.getByName(nombreHost); 
        } catch (UnknownHostException e) {
            System.out.println("No se pudo resolver la dirección del host.");
        } finally {
            scanner.close();
        }
    }
}