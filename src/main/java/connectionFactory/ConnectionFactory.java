package connectionFactory;

//import java.sql.Connection;
//        import java.sql.DriverManager;
//        import java.sql.SQLException;
//
//public class ConnectionFactory {
//
//    private static final String URL = "jdbc:mysql://localhost:3306/Users";
//
//    private static final String USER_NAME = "root";
//
//    private static final String PASSWORD = "password";
//
//    public static Connection getConnection() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
//    }
//
//}
import java.sql.Connection;

        import java.sql.DriverManager;

        import java.sql.SQLException;

public class ConnectionFactory {

    public Connection con;
    private static final String URL = "jdbc:mysql://localhost:3306/Users";

    private static final String USER_NAME = "root";

    private static final String PASSWORD = "password";


    public Connection getCon(){

        try {

            Class.forName("com.mysql.jdbc.Driver");

            con =  DriverManager.getConnection(URL, USER_NAME,PASSWORD);

        } catch (ClassNotFoundException e) {

// TODO Auto-generated catch block

            e.printStackTrace();

        } catch (SQLException e) {

// TODO Auto-generated catch block

            e.printStackTrace();

        }

        return con;

    }}