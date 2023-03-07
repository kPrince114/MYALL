package class4Week4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import commanFun.firstFun;

public class implement1 implements first {
	String message = "Not Inserted..!";
	@Override
	public String Student(int roll, String name, String address, int marks) {
		try(Connection conn= commonFun.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("insert into student values(?,?,?,?)");
			
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setInt(4, marks);
			int x= ps.executeUpdate();
			
			if(x > 0)
				message = "Record Inserted Sucessfully..!";
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			message = e.getMessage();
		}
		
		return message;
	}
	@Override
	public String QuestionTwo(int roll,String name, String address) {
		
		try(Connection conn= commonFun.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("insert into student values(?,?,?,null)");
			
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setString(3,address);
			//ps.setInt(3,address);
			int x= ps.executeUpdate();
			
			if(x > 0)
				message = "Record Inserted Sucessfully..!";
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			message = e.getMessage();
			
		}
		
		return message;
	}
	@Override
	public String ThirdQ(int roll, int marks,String name) {
		String message = "Not Inserted..!";
		try(Connection conn = commonFun.provideConnection()){
				PreparedStatement ps= conn.prepareStatement("UPDATE student SET roll= ? , marks=? WHERE name=?");
			
			ps.setInt(1, roll);
			ps.setInt(2, marks);
			ps.setString(3, name);
			int x= ps.executeUpdate();
			
			if(x > 0)
				message = "Record Inserted Sucessfully..!";
			
		}
		catch(SQLException e){
			e.printStackTrace();
			message = e.getMessage();
		}
		return message;
	}
	@Override
	public String fouthQ() {
		String message = "Not Inserted..!";
		try(Connection conn = commonFun.provideConnection()){
				PreparedStatement ps= conn.prepareStatement("DELETE FROM student WHERE marks<100 or marks=null");
			
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				message = "Record Inserted Sucessfully..!";
			
		}
		catch(SQLException e){
			e.printStackTrace();
			message = e.getMessage();
		}
		return message;
	}

	

}



//  DELETE FROM table11 WHERE marks<100 or marks=null;
//UPDATE table11 SET roll= ? ,marks=? WHERE name=?;

