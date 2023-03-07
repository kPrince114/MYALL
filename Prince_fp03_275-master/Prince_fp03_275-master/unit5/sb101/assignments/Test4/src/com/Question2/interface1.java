package com.Question2;

import java.util.List;

public interface interface1  {
	public String createTable() throws ProductError ;
	public String addProduct(Product p) throws ProductError; 
	public  List<Product> printall() throws ProductError;
	public List<Product> LessThanQuaAllPro(int Quantity) throws ProductError;
	public String addProSomeData(int id,int Quantity)throws ProductError;
	public String deleteProductByName(String name) throws ProductError;
	public String deleteProductByFirstCharName(String firstCharname) throws ProductError;
	
}
