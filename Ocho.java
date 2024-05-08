//NoSuchMethodException

import java.lang.reflect.Method;
import java.util.Scanner;

public class Ocho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del método:");
        String methodName = scanner.nextLine();

        try {
            Method method = MyClass.class.getMethod(methodName);
        } catch (NoSuchMethodException e) {
            System.out.println("Error: No se encontró el método especificado.");
        }
    }
}

class MyClass {
}