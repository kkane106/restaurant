package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import data.RestaurantDAO;
import models.Cuisine;
import models.Restaurant;
import models.State;

@Controller
public class RestaurantController {
	
	@Autowired
	private RestaurantDAO restaurantDAO;
	
	/*
	 * Go home
	 */
	@RequestMapping(method=RequestMethod.GET, value="home.do")
	public ModelAndView home() {
		return new ModelAndView("../index");
	}
	/*
	 * Editable Index
	 */
	@RequestMapping(method=RequestMethod.GET, value="editRestaurants.do")
	public ModelAndView editRestaurants() {
		return new ModelAndView("editRestaurants", "restaurants", restaurantDAO.getRestaurants());
	}
	
	/*
	 * Restaurant index
	 */
	@RequestMapping(method=RequestMethod.GET, value="listRestaurants.do")
	public ModelAndView listRestaurants() {
		ModelAndView mv = new ModelAndView("restaurants", "restaurants", restaurantDAO.getRestaurants());
		mv.addObject("cuisines", Cuisine.getCuisines());
		return mv;
	}
	
	/*
	 * Index of restaurants by cuisine
	 */
	@RequestMapping(method=RequestMethod.GET, value="getCuisine.do")
	public ModelAndView getCuisine(@RequestParam(value="cuisine") String cuisine) {
		ModelAndView mv = new ModelAndView("restaurants", "restaurants", restaurantDAO.getCuisine(cuisine));
		mv.addObject("cuisines", Cuisine.getCuisines());
		return mv;
	}
	
	/*
	 * Show restaurant
	 */
	@RequestMapping(method=RequestMethod.GET, value="getRestaurant.do")
	public ModelAndView getRestaurant(@RequestParam(value="id") int id) {
		Restaurant rest = restaurantDAO.getRestaurant(id);
		if (rest != null) {
			return new ModelAndView("restaurant", "restaurant", rest);
		} else {
			return new ModelAndView("error", "error", 404);
		}
	}
	
	/*
	 * New restaurant
	 */
	@RequestMapping(method=RequestMethod.GET, value="newRestaurant.do")
	public ModelAndView newRestaurant() {
		return new ModelAndView("newRestaurant", "cuisines", Cuisine.getCuisines());
	}

	/*
	 * Edit Restaurant (a single one)
	 */
	@RequestMapping(method=RequestMethod.GET, value="editRestaurant.do")
	public ModelAndView editRestaurant(@RequestParam(value="id") int id) {
		ModelAndView mv = new ModelAndView("editRestaurant", "restaurant", restaurantDAO.getRestaurant(id));
		mv.addObject("states", State.getAbbreviations());
		return mv;
	}
	
	/*
	 * Create restaurant
	 */
	@RequestMapping(method=RequestMethod.POST, value="createRestaurant.do")
	public ModelAndView createRestaurant(@RequestParam(value="name") String name,
			@RequestParam(value="phone") String phoneNumber,
			@RequestParam(value="cuisine") String cuisine) {
		Restaurant newRest = restaurantDAO.createRestaurant(name, phoneNumber, cuisine);
		if (newRest != null) {
			ModelAndView mv = new ModelAndView("restaurantUpdate", "restaurant", newRest);
			mv.addObject("states", State.getAbbreviations());
			return mv;
		} else {
			return new ModelAndView("error", "error", 500);
		}
	}

	/*
	 * Create Address For Restaurant
	 */
	@RequestMapping(method=RequestMethod.POST, value="addAddress.do")
	public ModelAndView addAddress(	@RequestParam(value="street") String street,
			@RequestParam(value="city") String city,
			@RequestParam(value="state") String state,
			@RequestParam(value="zip") String zip,
			@RequestParam(value="restID") int id) {
		return new ModelAndView("restaurantUpdate", "restaurant", restaurantDAO.addAddress(id, street, city, state, zip));
	}
	
	/*
	 * Update Restaurant
	 */
	@RequestMapping(method=RequestMethod.POST, value="updateRestaurant.do")
	public ModelAndView updateRestaurant(	@RequestParam(value="id") int id,
			@RequestParam(value="name") String name,
			@RequestParam(value="phone") String phone,
			@RequestParam(value="street") String street,
			@RequestParam(value="city") String city,
			@RequestParam(value="state") String state,
			@RequestParam(value="zip") String zip) {
		Restaurant updatedRest = restaurantDAO.updateRestaurant(id, name, phone, street, city, state, zip);
		return new ModelAndView("restaurant", "restaurant", updatedRest);
	}
	
	/*
	 * Delete Restaurant
	 */
	@RequestMapping(method=RequestMethod.POST, value="deleteRestaurant.do")
	public ModelAndView deleteRestaurant(@RequestParam(value="id") int id) {
		restaurantDAO.deleteRestaurant(id);
		return new ModelAndView("editRestaurants", "restaurants", restaurantDAO.getRestaurants());
	}
}
