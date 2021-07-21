import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCBank {
   //static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
	static final String DB_URL = "jdbc:mysql://database-mysql.ck2jovupcm0u.us-east-2.rds.amazonaws.com/database1";
	static final String USER = "admin";
	static final String PASS = "testadmin";

	public static void main(String[] args) {
	      System.out.println("Connecting to a selected database...");
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {		      
	         System.out.println("Connected database successfully...");  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
   }
}