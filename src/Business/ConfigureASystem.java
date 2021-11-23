package Business;

import Area.AreaName;
import Area.AreaNetwork;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.SysAdmin.SysAdminDirectory;
import java.util.Date;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        system.setSysAdminDirectory(new SysAdminDirectory());
        system.getSysAdminDirectory().createSysAdmin("RootUser", "6174351707", "vishnurupa.v@northeastern.edu", "rootuser", "rootpassword");
        System.out.println("Inside configureASystem-under- setSysAdminDirectory"+ system.getSysAdminDirectory().getSysAdmins().get(0).getUserAccount().getUserName()
        +" "+ system.getSysAdminDirectory().getSysAdmins().get(0).getUserAccount().getPassword());
        
        system.setCustomerDirectory(new CustomerDirectory());
        system.getCustomerDirectory().getCustomers().add(new Customer("gunasekhar", "3475126978", "guna.v@customer.com", "gunacustomer", "password"));
        
        RestaurantDirectory heathStRestaurantDirectory = new RestaurantDirectory();
        heathStRestaurantDirectory.getRestaurants().add(new Restaurant("Mela", "6789121784", "360 Huntington Avenue", "mela@gmail.com"));
        
        heathStRestaurantDirectory.getRestaurants().get(0).getEmployeeDirectory().getEmployeeList().add(
            new Employee("Akash-Mela Manager", "3472171808", "heath.m@restaurant.com", "melamanager", "password"));
        
        DeliveryManDirectory heathDeliveryManDirectory = new DeliveryManDirectory();
        system.getAreaNetworks().add(new AreaNetwork(AreaName.HeathSt, heathStRestaurantDirectory, heathDeliveryManDirectory));
        
        return system;
    }
    
}
