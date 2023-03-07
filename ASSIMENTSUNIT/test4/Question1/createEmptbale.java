package Question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createEmptbale {
	public static void main(String [] args) {
//		System.out.println(" prince kumar is good boy");
		 try {
			 String url="jdbc:mysql://localhost:3306/prince";
				String username="root";
				String password="Prince@123";
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con=DriverManager.getConnection(url,username,password);
		            Statement stmt = con.createStatement();
		            String sql="CREATE TABLE Employee1 ( empId int primary key auto_increment,ename varchar(12) not null,address varchar(12),email varchar(20) not null unique, password varchar(12),salary int,deptId int,foreign key(deptId) references Department(did))";
		          
		            stmt.executeUpdate(sql);
		            System.out.println("Created table Employee in given database...");
					//con.close();
	        } catch (Exception e) {
	        	e.printStackTrace();
	            
	        }
	}
}
