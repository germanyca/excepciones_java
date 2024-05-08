//ParseException

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Veinte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una fecha (formato: dd/MM/yyyy):");
        String fechaStr = scanner.nextLine();

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fecha = formatoFecha.parse(fechaStr);
            System.out.println("Fecha ingresada: " + fecha);
        } catch (ParseException e) {
            System.out.println("La fecha ingresada no tiene el formato correcto.");
        } finally {
            scanner.close();
        }
    }
}