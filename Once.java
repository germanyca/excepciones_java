//ReflectiveOperationException

import java.lang.reflect.Method;
import java.util.Scanner;

public class Once {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la clase:");
        String className = scanner.nextLine();

        try {
            Class<?> clazz = Class.forName(className);
            Method method = clazz.getMethod("someMethod");
        } catch (ReflectiveOperationException e) {
            System.out.println("Error: No se pudo acceder al método o a la clase.");
        }
    }
}