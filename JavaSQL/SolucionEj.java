
import java.sql.*;

public class SolucionEj {

    private static final String URL = "jdbc:mysql://localhost:3306/clientes";
    private static final String USUARIO = "root"; // o el que uses en XAMPP
    private static final String PASSWORD = "";     // en XAMPP suele estar vacío

    public static void main(String[] args) {
        listarClientesMadrid();
    }

    public static void listarClientesMadrid() {

        String sql = "SELECT nombre FROM clientes WHERE ciudad = ? AND puntos > ?";

        try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Parámetros
            pstmt.setString(1, "Madrid");
            pstmt.setInt(2, 100);

            try (ResultSet rs = pstmt.executeQuery()) {

                System.out.println("=== CLIENTES DE MADRID CON MÁS DE 100 PUNTOS ===");

                while (rs.next()) {
                    String nombre = rs.getString("nombre");
                    System.out.println(nombre);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error al consultar clientes: " + e.getMessage());
        }
    }
}
