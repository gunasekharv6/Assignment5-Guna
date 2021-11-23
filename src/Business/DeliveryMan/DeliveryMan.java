/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Order;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gunav
 */
public class DeliveryMan {
    
    private UserAccount useraccount;
    
    private List<Order> orders = new ArrayList<>();

    public DeliveryMan(String name, String phoneNo, String email, String userName, String password) {
        
        this.useraccount = new UserAccount(name, phoneNo, email, userName, password, Role.DeliveryMan);
        this.useraccount.setParentClass(this);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public UserAccount getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }
       
    @Override
    public String toString() {
        return this.useraccount.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
