//VirtualMachineError

public class Ventiseis {
    public static void main(String[] args) {
        try {
            throw new OutOfMemoryError("No hay suficiente memoria disponible");
        } catch (VirtualMachineError e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}