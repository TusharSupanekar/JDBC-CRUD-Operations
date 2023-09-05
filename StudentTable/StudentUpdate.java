package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentUpdate {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		
		Connection connection=null;
		
		String sql="UPDATE student set name='Siddhesh',email='sid@mail.com' WHERE id=5";
		
		//step 1 Load/Register the driver (mysql)
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		//step 2 Establish Connection
			 connection=DriverManager.getConnection(url, username, password);
		
		//step 3 Create Statement
			Statement statement=connection.createStatement();
			
		//step 4 Execute Statement
			statement.executeUpdate(sql);
			
		
			System.out.println("Values Added Successfully");
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//step 5 Close Connection
		finally {
			try {
				connection.close();
				//step for confirmation
				System.out.println("Connection Closed ");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
