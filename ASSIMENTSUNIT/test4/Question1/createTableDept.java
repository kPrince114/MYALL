package Question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createTableDept {
	public static void main(String [] args) {
//		System.out.println(" prince kumar is good boy");
		 try {
			 String url="jdbc:mysql://localhost:3306/prince";
				String username="root";
				String password="Prince@123";
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con=DriverManager.getConnection(url,username,password);
		            Statement stmt = con.createStatement();
		            String sql="CREATE TABLE Department ( did int primary key auto_increment,dname varchar(12) NOT NULL,location varchar(12) NOT NULL)";
		            		
		            stmt.executeUpdate(sql);
		            System.out.println("Created table Department in given database...");
					//con.close();
	        } catch (Exception e) {
	        	e.printStackTrace();
	            
	        }
	}
}
