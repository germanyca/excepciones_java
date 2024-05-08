//ArithmeticException

import java.util.Scanner;

public class Uno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el dividendo:");
        int dividendo = scanner.nextInt();
        
        System.out.println("Introduce el divisor:");
        int divisor = scanner.nextInt();
        
        try {
            int resultado = dividir(dividendo, divisor);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }
        
        scanner.close();
    }
    
    public static int dividir(int dividendo, int divisor) {
        return dividendo / divisor;
    }
}