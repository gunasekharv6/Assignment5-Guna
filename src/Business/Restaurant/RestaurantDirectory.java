/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gunav
 */
public class RestaurantDirectory {
    
    private List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantDirectory(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public RestaurantDirectory() {
    }
    
    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
    
    public void addRestarunt(Restaurant e){
        this.restaurants.add(e);
    }
}
