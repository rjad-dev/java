import java.sql.*;
import java.sql.SQLException;

class ReadFromTable {
    public static void main(String[] args) throws SQLException {
        String host = "jdbc:mysql://localhost:3306/java";
        String uname = "root";
        String password = "Thankyougod@123";

        Connection conn = DriverManager.getConnection(host, uname, password);

        if(conn!=null) {
            System.out.println("Database connected");

            //Read Query
            String readSql = "SELECT * FROM student";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(readSql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.print("Id: " + id + " ");
                System.out.print("Name: " + name + " ");
                System.out.print("Age: " + age + " ");
                System.err.println();
            }

        }
    }
}