package Que2;

import java.util.Comparator;

public class PriceComp implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.getPrice()>p2.getPrice()?-1:+1;
	}

}
