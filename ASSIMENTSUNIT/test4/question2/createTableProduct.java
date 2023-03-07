package question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createTableProduct {
	public static void main(String [] args) {
//		System.out.println(" prince kumar is good boy");
		 try {
			 String url="jdbc:mysql://localhost:3306/prince";
				String username="root";
				String password="Prince@123";
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con=DriverManager.getConnection(url,username,password);
		            Statement stmt = con.createStatement();
		            String sql="CREATE TABLE Product1 ( productId int primary key,productName varchar(12) not null, price int, quantity int)";
		            stmt.executeUpdate(sql);
		            System.out.println("Created table Department in given database...");
					//con.close();
	        } catch (Exception e) {
	        	e.printStackTrace();
	            
	        }
	}
}
