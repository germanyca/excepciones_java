//FileNotFoundException

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dieciseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del archivo:");
        String nombreArchivo = scanner.nextLine();

        try {
            File archivo = new File(nombreArchivo);
            Scanner lectorArchivo = new Scanner(archivo);
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encontró el archivo");
        } finally {
            scanner.close();
        }
    }
}