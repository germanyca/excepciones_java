//IllegalThreadStateException

public class Cuatro {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Hilo en ejecución...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hilo completado.");
        });
        
        thread.start();

        try {
            thread.start();
        } catch (IllegalThreadStateException e) {
            System.out.println("Error: Intento de iniciar un hilo ya iniciado.");
        }
    }
}