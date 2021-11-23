/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Restaurant.Order;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class Customer {
    
    private final List<Order> orders = new ArrayList<>();
    
    private UserAccount useraccount;
    
    private String address;
    

    public Customer(String name, String phoneNo, String email, String userName, String password) {
        useraccount = new UserAccount(name, phoneNo, email, userName, password, Role.Customer);
        useraccount.setParentClass(this);
    }

    public UserAccount getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }
    
    
    
    
    
    
}
