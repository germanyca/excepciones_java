//IllegalStateException

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese elementos a la lista (ingrese 'fin' para terminar):");
        String input = scanner.nextLine();
        while (!input.equals("fin")) {
            lista.add(input);
            input = scanner.nextLine();
        }

        try {
            if (!lista.isEmpty()) {
                Collections.sort(lista);
                System.out.println("Lista ordenada: " + lista);
            } else {
                throw new IllegalStateException("Error: La lista está vacía.");
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}