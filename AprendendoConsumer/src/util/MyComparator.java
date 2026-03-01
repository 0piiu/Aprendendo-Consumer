package util;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.getPrice().compareTo(p2.getPrice());
	}

}
