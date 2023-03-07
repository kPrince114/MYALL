package com.Question1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class implementsAll implements interface1 {
	
	@Override
	public void createDepartment() {
		try (Connection con = utily.provideConnection()) {
			String sql = "CREATE TABLE Department ( did int primary key auto_increment,dname varchar(12) NOT NULL,location varchar(12) NOT NULL)";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Created table Department in given database...");
		}

		catch (SQLException e) {
			e.printStackTrace();
			
		}

	}

	@Override
	public void createTableEmpoly() {
		try (Connection con = utily.provideConnection()) {
			String sql = "CREATE TABLE Employee ( empId int primary key auto_increment,ename varchar(12) not null,address varchar(12),email varchar(20) not null unique, password varchar(12),salary int,deptId int,foreign key(deptId) references Department(did))";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Created table Employee in given database...");
			
		}

		catch (SQLException e) {
			e.printStackTrace();

		}
		
	}

	@Override
	public String addNewDept( String name, String location) {
		String msg="not insert";
		try(Connection conn= utily.provideConnection()) {
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
	public String addWithDepID(String name, String address, String email, String password, int salary) {
		String msg="not insert";
		try(Connection conn= utily.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("insert into Employee (ename,address,email,password,salary) values('prince','patna','abc@gamil.com','123',3000)");
			
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
	public String loginEmp(int id,String email) {
		String msg="not login";
		try(Connection conn= utily.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("select * from Employee where empId=? and email=?");
			ps.setInt(1, id);
			ps.setString(2,email); 
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
				System.out.println("welcome:- "+" name is : "+rs.getString("ename") + " address is "+rs.getString("address"));
				System.out.println();
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
		String msg="not row";
		try(Connection conn= utily.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("select * from Department");
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
				System.out.println("namedept is : "+rs.getString("dname") +" location is  "+rs.getString("location"));
				msg= "print all Successfully....!";
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		
		return msg;
	}

	@Override
	public String updatedept(String location,int id) {
		String msg="not id there";
		try(Connection conn= utily.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("update Department set location=? where did=?");
			ps.setString(1,location);
			ps.setInt(2, id);
			int s= ps.executeUpdate();
			
			if(s>0)
				
				msg= "change location Successfully....!";
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		
		return msg;
	}

	@Override
	public String updateEmpolyPassword(int id, int password) {
		String msg="not emp";
		try(Connection conn= utily.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("update Employee set password=? where empId=?");
			
			ps.setInt(1,password);
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
	public String DeleteDept(int id) {
		String msg="not delect";
		try(Connection conn= utily.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("delete from Department where did=? ");
			ps.setInt(1,id);
			int s= ps.executeUpdate();
			PreparedStatement ps1= conn.prepareStatement("update Employee set depId= Null where depId=?");
			ps1.setInt(1, id);
			ps.executeUpdate();
			if(s>0) {
				
				msg= "delect  Successfully............!";
			}
				
				
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		
		return msg;
	}
	
	

}
