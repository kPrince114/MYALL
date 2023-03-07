package Question1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import class4Week4.commonFun;

public class implememt implements interface1 {

	@Override
	public String addNewDept() {
		String msg="not insert";
		try(Connection conn= commonFun.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("insert into Department (dname,location) values('springboot','patna')");
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				msg= "Record Inserted Sucessfully..!";
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		
		
		return msg;
	}

	@Override
	public String addEmpWithoutdid() {
		String msg="not insert";
		try(Connection conn= commonFun.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("insert into Employee1 (ename,address,email,password,salary) values('prince','patna','abc@gamil.com','123',3000)");
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				msg= "Record Inserted Sucessfully..!";
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		
		
		return msg;
	}

	@Override
	public String login(String email, String password, int did) {
		String msg="not login";
		try(Connection conn= commonFun.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("select * from Employee1 where email=? and password=? and empId=?");
			ps.setString(1, email);
			ps.setString(2, password);
			ps.setInt(3,did); 
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
				System.out.println("welcome:- "+" name is : "+rs.getString("ename") + " address is "+rs.getString("address")+" Salary is "+rs.getInt("salary"));
				msg= "login Successfully....!";
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		
		
		return msg;
	}

	@Override
	public String printalldept() {
		String msg="not login";
		try(Connection conn= commonFun.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("select * from Department");
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
				System.out.println("namedept is :"+rs.getString("dname") +"location is "+rs.getString("location"));
				msg= "print all Successfully....!";
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		
		return msg;
	}

	@Override
	public String changepassword(String pass, int id) {
		String msg="not login";
		try(Connection conn= commonFun.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("update Department set password=? where empId=?");
			ps.setString(1,pass);
			ps.setInt(2,id);
			int s= ps.executeUpdate();
			
			if(s>0)
				
				msg= "change all password Successfully....!";
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		
		return msg;
	}
		
		@Override
		public String deletedept(int id) {
			String msg="not delect";
			try(Connection conn= commonFun.provideConnection()) {
				PreparedStatement ps= conn.prepareStatement("delect from  Department where did=? ");
				ps.setInt(1,id);
				int s= ps.executeUpdate();
				
				if(s>0)
					
					msg= "delect  Successfully....!";
				
			}
			catch (SQLException e) {
				e.printStackTrace();
				msg = e.getMessage();
			}
			
			return msg;
		}

	


}
