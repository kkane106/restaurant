package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import models.Address;
import models.Cuisine;
import models.Menu;
import models.MenuItem;
import models.Restaurant;

public class RestaurantDAO implements ApplicationContextAware {
	private List<Restaurant> restaurants;
	private ApplicationContext appContext;
	private String fileName;
	
	public RestaurantDAO(String fileName) {
		super();
		this.fileName = fileName;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext appContext) throws BeansException {
		this.appContext = appContext;
		populateList(this.appContext);
	}
	
	private String deformatPhoneNumber(String phoneNumber) {
		String[] nums = phoneNumber.split("\\D");
		String num = "";
		for (String s : nums) {
			num = num + s;
		}
		return num;
	}
	
	public void deleteRestaurant(int id) {
		Restaurant r = getRestaurant(id);
		restaurants.remove(r);
	}
	
	public Restaurant updateRestaurant(int id, String name, String phone, String street, 
			String city, String state, String zip) {
		Restaurant r = addAddress(id, street, city, state, zip);
		r.setName(name);
		r.setPhoneNumber(deformatPhoneNumber(phone));
		
		return r;
	}
	
	public Restaurant addAddress(int id, String street, String city, String state, String zip) {
		Address a = new Address(street, city, state, zip);
		Restaurant r = getRestaurant(id);
		r.setAddress(a);
		return r;
	}
	
	public Restaurant createRestaurant(String name, String phoneNumber, String cuisine) {
		Restaurant rest = new Restaurant(name, deformatPhoneNumber(phoneNumber), cuisine);
		restaurants.add(rest);
		return rest;
	}
	
	public Restaurant getRestaurant(int id) {
		Restaurant rest = null;
		for (Restaurant r : restaurants) {
			if (r.getId() == id) {
				rest = r;
			}
		}
		return rest;
	}
	
	public List<Restaurant> getCuisine(String cuisine) {
		List<Restaurant> cuisineRestaurants = new ArrayList<>();
		for (Restaurant r : this.restaurants) {
			if (r.getCuisine().equals(Cuisine.valueOfName(cuisine))) {
				cuisineRestaurants.add(r);
			}
		}
		return cuisineRestaurants;
	}
	
	/*
	 * Load in data from restaurants.csv
	 */
	private void populateList(ApplicationContext appContext) {
		List<Restaurant> restaurants = new ArrayList<>();
		try {
			File f = appContext.getResource(fileName).getFile();
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String nextLine;
			while ((nextLine = br.readLine()) != null) {
				String[] line = nextLine.split(",");
				Address a = new Address(line[3], 
										line[4], 
										line[5], 
										line[6]
										);
				Restaurant r = new Restaurant(	line[0], 
												line[1], 
												a, 
												line[2]
											 );
				Menu m = new Menu(line[7]);
				List<MenuItem> items = new ArrayList<>();
				
				int counter = 8;
				while (counter < line.length) {
					MenuItem mi = new MenuItem();
					for (int i = 0 ; i < 4 ; i++) {
						if (i==0) {
							mi.setName(line[counter]);
						} else if (i==1) {
							mi.setDescription(line[counter]);
						} else if (i==2) {
							mi.setPrice(Float.parseFloat(line[counter]));
						} else if (i==3) {
							mi.getCuisineFromString(line[counter]);
						}
						counter++;
					}
					items.add(mi);
				}
				m.setMenuItems(items);
				r.setMenu(m);
				restaurants.add(r);
			}
		} catch (IOException e) {
			System.err.println("Error: " + e);
			e.printStackTrace();
		}
		
		this.restaurants = restaurants;
	}
		
}
