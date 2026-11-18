import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection connection(){
        String url="jdbc:ucanaccess://src//db//pos.accdb";
        Connection connection;
        try {
            connection= DriverManager.getConnection(url);
            if(connection != null){
                System.out.println("database Connected");
                return connection;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void main(String[] args) {
        MyConnection.connection();
    }
}
