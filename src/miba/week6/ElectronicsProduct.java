package miba.week6;

public class ElectronicsProduct extends Product implements TransactionInterface,ManageInterface {
	String brand;
	int warranty;
	public ElectronicsProduct(String name, String price, String brand, int warranty) {
		super(name, price);
		this.brand = brand;
		this.warranty = warranty;
	}
	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		System.out.println("purchase");
		
	}
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
		System.out.println("sell");
	}
	@Override
	public void exchange() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void damange() {
		// TODO Auto-generated method stub
		
	}
	

}
