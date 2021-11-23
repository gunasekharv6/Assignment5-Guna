/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
        
    private List<DeliveryMan> deliveryMan = new ArrayList<>();
  
    public DeliveryManDirectory() {
    }

    public List<DeliveryMan> getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(List<DeliveryMan> deliveryMan) {
        this.deliveryMan = deliveryMan;
    }
}
