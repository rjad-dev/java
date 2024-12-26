import java.sql.*;

class DropTable {
    public static void main(String[] args) throws SQLException {
        String host = "jdbc:mysql://localhost:3306/java";
        String uname = "root";
        String password = "Thankyougod@123";

        Connection conn = DriverManager.getConnection(host, uname, password);

        if (conn != null) {
            System.out.println("Database connected");

            String createSql = "DROP TABLE student";
            Statement st = conn.createStatement();
            System.out.println("Student table deleted successfully.");
        }
    }
}