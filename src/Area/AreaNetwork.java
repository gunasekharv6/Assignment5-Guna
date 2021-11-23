/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Area;

import Business.DeliveryMan.DeliveryManDirectory;
import Business.Restaurant.RestaurantDirectory;
import java.util.Date;

/**
 *
 * @author gunav
 */
public class AreaNetwork{
    
    private AreaName areaName;
        
    private RestaurantDirectory restaurantDirectory = new RestaurantDirectory();
    
    private DeliveryManDirectory deliveryManDirectory = new DeliveryManDirectory();

    public AreaNetwork(AreaName areaName, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory) {
        this.areaName = areaName;
        this.restaurantDirectory = restaurantDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public AreaNetwork(AreaName areaName) {
        this.areaName = areaName;
    }
    
    public AreaName getAreaName() {
        return areaName;
    }

    public void setAreaName(AreaName areaName) {
        this.areaName = areaName;
    }

    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
}
