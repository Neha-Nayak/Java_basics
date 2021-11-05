package in.ac.jyothyit.DB_programs;
import java.sql.*;
import java.util.*;

public class Students_del_usn{
	public static void main(String args[]) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/institute";
		String username= "root";
		String password = "";
		
		String usn = null;
		String sql = "delete from students where usn = ?";
		Scanner scanner = new Scanner(System.in);
		System.out.println("USN : ");
		usn = scanner.next();
		scanner.close();
		try {
	            Class.forName(driver);
	            connection = DriverManager.getConnection(url,username,password);
	            
	            preparedStatement=connection.prepareStatement(sql);
	            preparedStatement.setString(1,usn);
	            int n = preparedStatement.executeUpdate();
	            if(n==1)
	            	System.out.println("Delete successful...");
	            else 
	            	System.out.println("Not found...");
	            
	            preparedStatement.close();
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