package question2;

import java.sql.Connection;
import java.sql.DriverManager;

public class common {

	private static Connection con;
	public static Connection getConnection() {
		try {
			if(con==null) {
				String url="jdbc:mysql://localhost:3306/sys";
				String username="root";
				String password="Prince@123";
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con=DriverManager.getConnection(url,username,password);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}
