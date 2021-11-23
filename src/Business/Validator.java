/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Area.AreaNetwork;
import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.SysAdmin.SysAdmin;

/**
 *
 * @author gunav
 */
public class Validator {
    
    public static boolean checkUserNameAlreadyExists(EcoSystem ecoSystem, String userName) {
        
        for(SysAdmin sysAdmin:ecoSystem.getSysAdminDirectory().getSysAdmins()) {
            if(sysAdmin.getUserAccount().getUserName().contentEquals(userName)){
                return true;
            }
        }
        
        for(Customer customer:ecoSystem.getCustomerDirectory().getCustomers()) {
            if(customer.getUseraccount().getUserName().contentEquals(userName)) {
                return true;
            }
        }
        
        for(AreaNetwork areaNetwork:ecoSystem.getAreaNetworks()) {
            for(DeliveryMan deliveryMan:areaNetwork.getDeliveryManDirectory().getDeliveryMan()){
                if(deliveryMan.getUseraccount().getUserName().contentEquals(userName)){
                    return true;
                }
            }
            
            for(Restaurant restaurant:areaNetwork.getRestaurantDirectory().getRestaurants()) {
                for(Employee restaurantEmployee:restaurant.getEmployeeDirectory().getEmployeeList()) {
                    if(restaurantEmployee.getUseraccount().getUserName().contentEquals(userName)) {
                        return true;
                    }
                }
            }
        }
        return false;

    }
    
    public static boolean checkEmailAlreadyExists(EcoSystem ecoSystem, String email) {
        
        for(SysAdmin sysAdmin:ecoSystem.getSysAdminDirectory().getSysAdmins()) {
            if(sysAdmin.getUserAccount().getEmail().contentEquals(email)){
                return true;
            }
        }
        
        for(Customer customer:ecoSystem.getCustomerDirectory().getCustomers()) {
            if(customer.getUseraccount().getEmail().contentEquals(email)) {
                return true;
            }
        }
        
        for(AreaNetwork areaNetwork:ecoSystem.getAreaNetworks()) {
            for(DeliveryMan deliveryMan:areaNetwork.getDeliveryManDirectory().getDeliveryMan()){
                if(deliveryMan.getUseraccount().getEmail().contentEquals(email)){
                    return true;
                }
            }
            
            for(Restaurant restaurant:areaNetwork.getRestaurantDirectory().getRestaurants()) {
                for(Employee restaurantEmployee:restaurant.getEmployeeDirectory().getEmployeeList()) {
                    if(restaurantEmployee.getUseraccount().getEmail().contentEquals(email)) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    public static boolean checkPhoneNoAlreadyExists(EcoSystem ecoSystem, String phoneNo) {
        
        for(SysAdmin sysAdmin:ecoSystem.getSysAdminDirectory().getSysAdmins()) {
            if(sysAdmin.getUserAccount().getPhoneNo().contentEquals(phoneNo)){
                return true;
            }
        }
        
        for(Customer customer:ecoSystem.getCustomerDirectory().getCustomers()) {
            if(customer.getUseraccount().getPhoneNo().contentEquals(phoneNo)) {
                return true;
            }
        }
        
        for(AreaNetwork cityNetwork:ecoSystem.getAreaNetworks()) {
            for(DeliveryMan deliveryMan:cityNetwork.getDeliveryManDirectory().getDeliveryMan()){
                if(deliveryMan.getUseraccount().getPhoneNo().contentEquals(phoneNo)){
                    return true;
                }
            }
            
            for(Restaurant restaurant:cityNetwork.getRestaurantDirectory().getRestaurants()) {
                for(Employee restaurantEmployee:restaurant.getEmployeeDirectory().getEmployeeList()) {
                    if(restaurantEmployee.getUseraccount().getPhoneNo().contentEquals(phoneNo)) {
                        return true;
                    }
                }
            }
        }
        return false;

    }    
    
}
