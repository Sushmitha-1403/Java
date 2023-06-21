package oops;

public class Product {
	private static double price;
	private static double quantity;
	
	public static void setPrice(double p) {
		price=p;
	}
	
	public static double getPrice() {
		return price;
	}
	public static double getPrice(double quantity) {
		return(quantity);
	}
	
	public static void main(String args[]) {
		Product.setPrice(34.345);
		System.out.println("Price:"+Product.getPrice());
		System.out.println("Quantity:"+Product.getPrice(3444.345));
		
	}
	
	

}
