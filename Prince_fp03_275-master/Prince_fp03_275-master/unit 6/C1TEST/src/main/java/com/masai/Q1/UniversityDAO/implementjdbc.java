package com.masai.Q1.UniversityDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.masai.Q1.Execption.StudentExecption;
import com.masai.Q1.common.DBUtil;

public class implementjdbc implements INTERFACEJDBC {
	
	@Override
	public String deleteStudentById(int id) throws StudentExecption {
		String delete=null;
		try(Connection conn= DBUtil.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("DELETE FROM Student where id=?");
			ps.setInt(1,id);
			int s= ps.executeUpdate();
			
			if(s>0) {
				delete="delecte your account";
				
			}
				
			
		}
		catch (SQLException e) {
			throw new StudentExecption("some essuse in implements");
		}
		
		return delete;
	}

	@Override
	public String updateStudentCGPA(int id, int cgpa)throws StudentExecption {
		String msg="no update ";
		String st;
		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement(
					"UPDATE Student SET cgpa = ?  WHERE id = ?");

			ps.setInt(1, cgpa);
			ps.setInt(2, id);
			int x = ps.executeUpdate();
			
			if (x > 0) {
				msg="uddate sucessfully ...";
			}

		} catch (SQLException e) {
			throw new StudentExecption(msg);
			
		}

		return msg;
	}

	

}
