import java.sql.*;

class CreateTable {
    public static void main(String[] args) throws SQLException {
        String host = "jdbc:mysql://localhost:3306/java";
        String uname = "root";
        String password = "Thankyougod@123";

        Connection conn = DriverManager.getConnection(host, uname, password);

        if (conn != null) {
            System.out.println("Database connected");

            String createSql = "CREATE TABLE student (" +
                    "id INTEGER PRIMARY KEY AUTO_INCREMENT," +
                    "name VARCHAR(50), " +
                    "age INTEGER)";
            Statement st = conn.createStatement();
            int no_of_rows_affected = st.executeUpdate(createSql);
            if (no_of_rows_affected > 0) {
                System.out.println("Student table created successfully.");
            }
        }
    }
}