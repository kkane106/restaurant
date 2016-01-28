package models;

import java.util.ArrayList;
import java.util.List;

public enum Cuisine {
	
	AMERICAN("American")
	,ITALIAN("Italian")
	,THAI("Thai")
	,SUSHI("Sushi")
	,PIZZA("Pizza")
	,CHINESE("Chinese")
	,MEXICAN("Mexican")
	,MEDITERRANEAN("Mediterranean")
	,INDIAN("Indian");
	
	private String name;
	
	Cuisine (String name) {
		this.name = name;
	}
	
	public static List<String> getCuisines() {
		List<String> cuisines = new ArrayList<>();
		for (Cuisine c : values()) {
			cuisines.add(c.name);
		}
		return cuisines;
	}
	
	
    public static Cuisine valueOfName(final String name) {
        final String enumName = name.toUpperCase();
        try {
            return valueOf(enumName);
        } catch (final IllegalArgumentException e) {
            return Cuisine.AMERICAN;
        }
    }
}
