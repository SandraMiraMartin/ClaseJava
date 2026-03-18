
import java.sql.*;

public class EjemploJDBC {

    // Constantes de conexión (NUNCA hardcodeadas en producción)
    private static final String URL = "jdbc:mysql://localhost:3306/mi_tienda";
    private static final String USUARIO = "app_user";
    private static final String PASSWORD = "app_password";

    public static void main(String[] args) {
        EjemploJDBC ejemplo = new EjemploJDBC();
        ejemplo.listarProductos();
    }

    public void listarProductos() {
        String sql = "SELECT id, nombre, precio FROM productos WHERE precio > ?";

        try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Parámetro: productos con precio mayor a 10
            pstmt.setDouble(1, 10.0);

            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println("=== PRODUCTOS CON PRECIO > 10 ===");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    double precio = rs.getDouble("precio");

                    System.out.printf("ID: %d | %s | %.2f€%n", id, nombre, precio);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error al listar productos: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
