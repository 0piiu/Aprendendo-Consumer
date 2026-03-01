package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.MyComparator;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Notebook", 1000.0));
		list.add(new Product("Televisao", 400.0));
		list.add(new Product("Sofa", 1800.0));
		list.add(new Product("Micro-ondas", 800.0));

		list.sort(new MyComparator());
		list.forEach(Product:: staticConsumerMethod);
		list.forEach(System.out::println);
	}
}
