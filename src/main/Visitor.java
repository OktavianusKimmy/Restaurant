package main;

public class Visitor {
	private String name;
	
	public Visitor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	private int totalPrice;
	
	public void setTotalPrice(int price) {
		totalPrice += price;
	}
	
	public void showTotalPrice() {
		System.out.println(name + "'s total price: " + totalPrice);
	}
}