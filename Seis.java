//NegativeArraySizeException

import java.util.Scanner;

public class Seis{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo:");
        int size = Integer.parseInt(scanner.nextLine());

        try {
            if (size >= 0) {
                int[] array = new int[size];
                System.out.println("Se ha creado un arreglo de tamaño " + size);
            } else {
                throw new NegativeArraySizeException("Error: El tamaño del arreglo no puede ser negativo.");
            }
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}