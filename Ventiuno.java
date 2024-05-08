//SQLException

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Ventiuno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la URL de la base de datos:");
        String url = scanner.nextLine();

        try {
            Connection conexion = DriverManager.getConnection(url);
            System.out.println("Conexión exitosa.");
        } catch (SQLException e) {
            System.out.println("Error: No se puede conectar a la base de datos.");
        } finally {
            scanner.close();
        }
    }
}