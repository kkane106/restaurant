package models;

import java.util.ArrayList;
import java.util.List;

public enum Category {
	APPETIZER("Appetizer")
	, BREAKFAST("Breakfast")
	, LUNCH("Lunch")
	, DINNER("Dinner")
	, DESERT("Desert")
	, BEVERAGE("Beverage")
	, UNKNOWN("Unkown");

	private String category;

	Category(String category) {
		this.category = category;
	}

	public static List<String> getCategories() {
		List<String> cats = new ArrayList<>();
		for (Category c : values()) {
			cats.add(c.category);
		}
		return cats;
	}

	public static Category valueOfName(final String name) {
		final String enumName = name.toUpperCase().replaceAll(" ", "_");
		try {
			return valueOf(enumName);
		} catch (final IllegalArgumentException e) {
			return Category.UNKNOWN;
		}
	}
}
