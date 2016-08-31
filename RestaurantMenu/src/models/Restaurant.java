package models;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	private int id;
	private String name;
	private String phoneNumber;
	private Address address;
	private Cuisine cuisine;
	private Menu menu;
	private List<Review> reviews;
	private static int numCreated;
	
	public Restaurant() {
		this("","",null,null);
	}
	
	public Restaurant(String name, String phoneNumber) {
		this(name, phoneNumber, null, null);
		this.reviews = new ArrayList<Review>();
	}
	
	public Restaurant(String name, String phoneNumber, String cuisine) {
		this(name, phoneNumber, null, cuisine);
		this.reviews = new ArrayList<Review>();
	}
	
	public Restaurant (String name, String phoneNumber, Address address, String cuisine) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.cuisine = getCuisineFromString(cuisine);
		this.reviews = new ArrayList<Review>();
		this.id = ++numCreated;
	}
	
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	private Cuisine getCuisineFromString(String string) {
		return Cuisine.valueOfName(string);
	}
	
	public String formatPhoneNumber() {
		String phone = "";
		try {
			phone = phone + "(" + this.phoneNumber.substring(0, 3) + ") " +
					this.phoneNumber.substring(3, 6) + "-" + 
					this.phoneNumber.substring(6, 10);			
		} catch (Exception e) {
			phone = "(555) 555-5555";
		}
		return phone;
	}
	
	public String formatCuisine() {
		String cuis = this.cuisine.toString().toLowerCase();
		return cuis.substring(0, 1).toUpperCase() + cuis.substring(1);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Cuisine getCuisine() {
		return cuisine;
	}

	public void setCuisine(Cuisine cuisine) {
		this.cuisine = cuisine;
	}
	
	public List<Review> getReview() {
		return reviews;
	}

	public void setReview(List<Review> reviews) {
		this.reviews = reviews;
	}
	
	public int getId() {
		return this.id;
	}
	
}
