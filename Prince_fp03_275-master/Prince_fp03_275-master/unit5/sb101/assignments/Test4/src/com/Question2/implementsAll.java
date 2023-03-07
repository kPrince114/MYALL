package com.Question2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Question1.utily;




public class implementsAll implements interface1 {
	String msg="not insest";
	@Override
	public String createTable() throws ProductError   {
		try (Connection con = utily.provideConnection()) {
			String sql = "CREATE TABLe Product ( Productid int primary key,Productname varchar(12) NOT NULL,price int , Quantity int)";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			msg="Created table Department in given database...";
		}

		catch (SQLException e) {
			e.printStackTrace();
			throw new ProductError(msg);
		}
		return msg;
		
	}
	@Override
	public String addProduct(Product p) throws ProductError {
		String msg="not insert";
		try(Connection conn= utily.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("insert into product (ProductId,productname,price,Quantity) values(?,?,?,?)");
			ps.setInt(1, p.getProductId());
			ps.setString(2, p.getProductName());
			ps.setInt(3, p.getPrice());
			ps.setInt(4, p.getQuantity());
			int x= ps.executeUpdate();
			
			if(x > 0)
				msg= "Record Inserted Sucessfully..!";
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			throw new ProductError(msg);
		}
		
		
		return msg;
	}
	@Override
	public List<Product> printall() throws ProductError {
		List<Product> list=new ArrayList<Product>();
		String msg="not insert";
		try(Connection conn= utily.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("select * from product");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()){
				
				int id=rs.getInt("productid");
				String name=rs.getString("productname");
				int price =rs.getInt("price");
				int quantity=rs.getInt("quantity");
				Product p=new Product(id, name, price, quantity);
				list.add(p);
			
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			throw new ProductError(null);
		}
		return list;
	}
	@Override
	public List<Product> LessThanQuaAllPro(int Quantity) throws ProductError {
		List<Product> list=new ArrayList<Product>();
		String msg="not insert";
		try(Connection conn= utily.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("select * from product where Quantity<? ");
			ps.setInt(1, Quantity);
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()){
				
				int id=rs.getInt("productid");
				String name=rs.getString("productname");
				int price =rs.getInt("price");
				int quantity=rs.getInt("quantity");
				Product p=new Product(id, name, price, quantity);
				list.add(p);
			
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			throw new ProductError(msg);
		}
		return list;
	}
	@Override
	public String addProSomeData(int id, int Quantity) throws ProductError {
		String msg="not insert";
		try(Connection conn= utily.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("insert into product (productid,Quantity) values(?,?)");
			ps.setInt(1,id);
			ps.setInt(2, Quantity);
			int x= ps.executeUpdate();
			
			if(x > 0)
				msg= "Record Inserted Sucessfully..!";
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			throw new ProductError(msg);
		}
		
		
		return msg;
	}
	@Override
	public String deleteProductByName(String name) throws ProductError {
		String msg="not insert";
		try(Connection conn= utily.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("delete from product where name=?");
			ps.setString(1, name);
			int x= ps.executeUpdate();
			
			while(x>0){
				msg="delect your product";
			
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			throw new ProductError(msg);
		}
		return msg;
		
	}
	@Override
	public String deleteProductByFirstCharName(String firstCharname) throws ProductError {
		String msg="not insert";
		try(Connection conn= utily.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("delete from product where name like ='?%' ");
			ps.setString(1, firstCharname);
			int x= ps.executeUpdate();
			
			while(x>0){
				msg="delect your product";
			
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			throw new ProductError(msg);
		}
		return msg;
	}
	
	
	

}
