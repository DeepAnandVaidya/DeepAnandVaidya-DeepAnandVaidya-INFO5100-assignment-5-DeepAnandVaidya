/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author deepv
 */
public class RestaurantDirectory {

    private ArrayList<Restaurant> restaurants;

    public RestaurantDirectory() {
        restaurants = new ArrayList<>();
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public Restaurant getRestaurant(String name) {
        Restaurant restaurant = new Restaurant();
        restaurant = restaurants.stream().filter(x -> x.getName().equals(name)).findAny().orElse(null);
        return restaurant;
    }

    public Restaurant addRestaurant() {
        Restaurant restaurant = new Restaurant();
        restaurants.add(restaurant);
        return restaurant;
    }

}
