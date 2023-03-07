package firstProject.masai;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private int ProductID;
	private String Productname;
	private int price;
	private int quantity;
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String Productname) {
		this.Productname = Productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(int productID, String Productname, int price, int quantity) {
		super();
		ProductID = productID;
		this.Productname = Productname;
		this.price = price;
		this.quantity = quantity;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [ProductID=" + ProductID + ", Productname=" + Productname + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	
	
}
