package in.ac.jyothyit.DB_programs;
import java.sql.*;

public class CheckConnection{
	public static void main(String args[]) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/institute";
		String username= "root";
		String password = "";
		Connection connection = null;
		 try {
	            Class.forName(driver);
	            connection = DriverManager.getConnection(url,username,password);
	            System.out.println("connection successful...");
	            connection.close();
	        }
	        catch(ClassNotFoundException cnfe)
	        {
	            System.out.println(cnfe);
	        }
	        catch(SQLException sqle)
	        {
	            System.out.println(sqle);
	        }
	}
}