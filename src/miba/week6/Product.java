package miba.week6;

public class Product {
	protected String name,price;
	public Product(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	
	

}
