//UnsupportedOperationException

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quince {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lista = new ArrayList<>();
        lista.add("Java");

        System.out.println("Ingrese un texto para agregar a la lista:");
        String nuevoElemento = scanner.nextLine();

        try {
            lista.add(nuevoElemento);
        } catch (UnsupportedOperationException e) {
            System.out.println("No se puede modificar una lista inmutable.");
        } finally {
            scanner.close();
        }
    }
}