package in.ac.jyothyit.DB_programs;
import java.sql.*;

public class Students_display{
	public static void main(String args[]) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/institute";
		String username= "root";
		String password = "";
		
		String sql = "select * from students";
		 try {
	            Class.forName(driver);
	            connection = DriverManager.getConnection(url,username,password);
	            statement=connection.createStatement();
	            resultSet=statement.executeQuery(sql);
	            while(resultSet.next())
	            {
	            	System.out.println(resultSet.getString("USN")+" "+resultSet.getString("Name")+" "
	            +resultSet.getString("Gender")+" "+resultSet.getString("Age")+" "+resultSet.getString("Email")+" "
	            			+resultSet.getString("City"));
	            }
	            statement.close();
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