//ArrayIndexOutOfBoundsException

public class Dos {
   
        public static void main(String[] args) {
            int[] numeros = {1, 2, 3, 4, 5};
    
            try {
                System.out.println(numeros[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: el indice esta fuera de rango.");
            }
        }
    }

