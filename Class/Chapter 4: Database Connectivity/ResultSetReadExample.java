import java.sql.*;
import java.sql.SQLException;

class ResultSetReadExample {
    public static void main(String[] args) throws SQLException {
        String host = "jdbc:mysql://localhost:3306/java";
        String uname = "root";
        String password = "Thankyougod@123";

        Connection conn = DriverManager.getConnection(host, uname, password);

        if(conn!=null) {
            System.out.println("Database connected");

            //Read Query
            String readSql = "SELECT * FROM student";
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery(readSql);
            rs.last();
            System.out.println(rs.getString("name"));

            rs.first();
            System.out.println(rs.getString("name"));

            rs.absolute(2);
            System.out.println(rs.getString("name"));
        }
    }
}