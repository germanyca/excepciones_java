//IndexOutOfBoundsException

import java.util.ArrayList;

public class Cinco {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        
        try {
            System.out.println("Elemento en el índice 3: " + numeros.get(3)); 
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango.");
        }
    }
}