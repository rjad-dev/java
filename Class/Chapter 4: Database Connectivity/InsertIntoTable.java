import java.sql.*;
import java.sql.SQLException;

class InsertIntoTable {
    public static void main(String[] args) throws SQLException {
        String host = "jdbc:mysql://localhost:3306/java";
        String uname = "root";
        String password = "Thankyougod@123";

        Connection conn = DriverManager.getConnection(host, uname, password);

        if(conn != null) {
            System.out.println("Database connected");

            //Create Query
            String insertSqlQuery = "INSERT INTO student (id, name, age) VALUES (3, 'Sunil', 22)";
            Statement st = conn.createStatement();
            int no_of_rows_affected = st.executeUpdate(insertSqlQuery);
            if ( no_of_rows_affected > 0 ) {
                System.out.println("Data inserted successfully.");
            }
        }
    }
}