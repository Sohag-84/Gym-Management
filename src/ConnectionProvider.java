
import java.sql.*;

public class ConnectionProvider {
  public static Connection getCon(){
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jym","root","");
          return con;
      }catch(ClassNotFoundException | SQLException e){
          return null;
      }
  }  
}
