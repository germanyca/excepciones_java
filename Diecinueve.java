//MalformedURLException

import java.net.URL;
import java.net.MalformedURLException;
import java.util.Scanner;

public class Diecinueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la URL:");
        String urlStr = scanner.nextLine();

        try {
            URL url = new URL(urlStr);
            System.out.println("La URL es válida.");
        } catch (MalformedURLException e) {
            System.out.println("La URL ingresada no es válida.");
        } finally {
            scanner.close();
        }
    }
}