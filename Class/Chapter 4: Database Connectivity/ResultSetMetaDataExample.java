import java.sql.*;
import java.sql.SQLException;

public class ResultSetMetaDataExample {
    public static void main(String[] args) throws SQLException {
        String host = "jdbc:mysql://localhost:3306/java";
        String uname = "root";
        String password = "Thankyougod@123";
    
        Connection conn = DriverManager.getConnection(host, uname, password);
    
        if (conn != null) {
            System.out.println("Database connected");
    
            // Read Query
            String readSql = "SELECT * FROM student";
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery(readSql);

            ResultSetMetaData rmd = rs.getMetaData();

            int column_count = rmd.getColumnCount();
            System.out.println("No. of columns: " + column_count);

            for (int i=1;i<=column_count;i++) {
                System.out.println("Column name: " + rmd.getColumnName(i));
                System.out.println("Size: " + rmd.getColumnDisplaySize(i));
                System.out.println("Type: " + rmd.getColumnType(i));
                System.out.println();
            }

            conn.close();
        }
    }
}
