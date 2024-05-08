//UnknownServiceException

import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownServiceException;
import java.util.Scanner;

public class Venticinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una URL:");
        String urlString = scanner.nextLine();

        try {
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();
            connection.connect();
        } catch (UnknownServiceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}