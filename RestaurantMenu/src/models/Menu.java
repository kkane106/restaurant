package models;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private String name;
	private List<MenuItem> menuItems;
	
	public Menu() {
		this("",new ArrayList<MenuItem>());
	}
	
	public Menu(String name) {
		this(name, new ArrayList<MenuItem>());
	}

	public Menu(String name, List<MenuItem> menuItems) {
		super();
		this.name = name;
		this.menuItems = menuItems;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}


}
