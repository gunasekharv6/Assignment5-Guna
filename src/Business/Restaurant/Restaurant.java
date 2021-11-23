/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Employee.EmployeeDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gunav
 */


public class Restaurant {
    
    private String restaurantName;
    
    private String phoneNo;
    
    private String address;
    
    private String email;
    
    private List<Item> items = new ArrayList<>();
    
    private EmployeeDirectory employeeDirectory = new EmployeeDirectory();
    
    private List<Order> orders = new ArrayList<>();

    public Restaurant(String restaurantName, String phoneNo, String address, String email) {
        this.restaurantName = restaurantName;
        this.phoneNo = phoneNo;
        this.address = address;
        this.email = email;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setMenuItems(List<Item> items) {
        this.items = items;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return getRestaurantName(); //To change body of generated methods, choose Tools | Templates.
    }
   
}

