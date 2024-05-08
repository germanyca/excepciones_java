//NoSuchFieldException

import java.lang.reflect.Field;
import java.util.Scanner;

public class Siete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del campo:");
        String fieldName = scanner.nextLine();

        try {
            Field field = MyClass.class.getField(fieldName);
        } catch (NoSuchFieldException e) {
            System.out.println("Error: No se encontró el campo.");
        }
    }
}

class MyClass {
    
}