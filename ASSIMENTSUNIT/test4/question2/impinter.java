package question2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import class4Week4.commonFun;

public class impinter implements inter {

	@Override
	public String printall() {
		String msg="not insert";
		try(Connection conn= commonFun.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("select * from product1");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()){
				System.out.println("Roll is :"+rs.getInt("id"));
				System.out.println("Name is :"+rs.getString("name"));
				System.out.println("Address is :"+rs.getInt("price"));
				System.out.println("Marks is :"+rs.getInt("quantity"));
			
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			//throw new exception();
		}
		return msg;
	}

	@Override
	public String delect(String name) {
		String msg="not insert";
		try(Connection conn= commonFun.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("delect from product1 where name=?");
			
			int x= ps.executeUpdate();
			
			while(x>0){
				
			
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			//throw new exception();
		}
		return msg;
	}

//	@Override
//	public String first() throws exception {
//		String msg="not insert";
//		try(Connection conn= commonFun.provideConnection()) {
//			PreparedStatement ps= conn.prepareStatement("insert into Product1 values(1,'book',12,13)");
//			
//			int x= ps.executeUpdate();
//			
//			if(x > 0)
//				msg= "Record Inserted Sucessfully..!";
//			
//		}
//		catch (SQLException e) {
//			e.printStackTrace();
//			throw new exception();
//		}
//		
//		
//		return msg;
//	}
	

}
