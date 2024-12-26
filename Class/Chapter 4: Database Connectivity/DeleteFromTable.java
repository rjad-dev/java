import java.sql.*;

class DeleteFromTable {
    public static void main(String[] args) throws SQLException {
        String host = "jdbc:mysql://localhost:3306/java";
        String uname = "root";
        String password = "Thankyougod@123";

        Connection conn = DriverManager.getConnection(host, uname, password);

        if (conn != null) {
            System.out.println("Database connected");

            String deleteSql = "DELETE FROM student WHERE id = 1";

            Statement st = conn.createStatement();
            int no_of_rows_affected = st.executeUpdate(deleteSql);
            if (no_of_rows_affected > 0) {
                System.out.println("Data deleted successfully.");
            }
        }
    }
}