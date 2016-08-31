package models;

public class MenuItem {
	private String name;
	private String description;
	private float price;
	private Category category;
	
	public MenuItem(String name, String description, float price, String category) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = Category.valueOfName(category);
	}
	
	public MenuItem() {
		this("","",0,"");
	}
	
	public Category getCuisineFromString(String string) {
		return Category.valueOfName(string);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
