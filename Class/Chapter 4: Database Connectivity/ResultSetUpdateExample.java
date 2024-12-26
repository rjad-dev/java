import java.sql.*;
import java.sql.SQLException;

class ResultSetUpdateExample {
    public static void main(String[] args) throws SQLException {
        String host = "jdbc:mysql://localhost:3306/java";
        String uname = "root";
        String password = "Thankyougod@123";

        Connection conn = DriverManager.getConnection(host, uname, password);

        if(conn!=null) {
            System.out.println("Database connected");

            //Read Query
            String readSql = "SELECT * FROM student";
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(readSql);

            rs.first();
            rs.updateString("name", "Prashanna Parajuli");
            rs.updateRow();
            
            //TODO: To update the data of specific id, use 'while' loop as same as on ReadFromTable.java and implement 'if'
            conn.close();
        }
    }
}