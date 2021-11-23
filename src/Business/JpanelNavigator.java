/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Area.AreaNetwork;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CustomerRole.CustomerAreaJPanel;
import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;
import userinterface.RestaurantAdminRole.RestaurantAdminWorkAreaJPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author gunav
 */
public class JpanelNavigator {
    
    public static JPanel getMasterPanel(JPanel userProcessContainer, EcoSystem ecoSystem, UserAccount userLogged){
        
        return new SystemAdminWorkAreaJPanel(userProcessContainer, ecoSystem, userLogged);
    }
    
    public static JPanel getRestaurantManagerPanel(JPanel userProcessContainer, EcoSystem ecoSystem, UserAccount userLogged,
        Restaurant restaurant, AreaNetwork areaNetwork) {
        
        return new RestaurantAdminWorkAreaJPanel( userProcessContainer, ecoSystem, userLogged,restaurant,areaNetwork);
    }
    
    public static JPanel getCustomerAreaPanel(JPanel userProcessContainer, EcoSystem ecoSystem, UserAccount userAccount){
        
        return new CustomerAreaJPanel(userProcessContainer, ecoSystem, userAccount);
    }
    
    public static JPanel getDeliveryManMainPanel(JPanel userProcessContainer, EcoSystem ecoSystem, AreaNetwork areaNetwork, UserAccount userAccount) {
        
        return new DeliveryManWorkAreaJPanel(userProcessContainer, ecoSystem, areaNetwork, userAccount);
    }
    
}
