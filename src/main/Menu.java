package main;

import java.util.ArrayList;

public class Menu {
	private String jenisMakanan;
	
	public Menu(String jenisMakanan) {
		this.jenisMakanan = jenisMakanan;
	}
	
	public String getJenisMakanan() {
		return jenisMakanan;
	}
	
	private ArrayList<Food> foods = new ArrayList<Food>();
	
	public void add(Food food) {
		foods.add(food);
	}
	
	public ArrayList<Food> getFoods(){
		return foods;
	}
}
