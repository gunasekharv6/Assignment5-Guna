/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Area.AreaNetwork;
import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gunav
 */
public class Order {
    
    private final List<Item> items = new ArrayList<Item>();
    private Customer orderedBy;
    private Employee acceptedBy;
    private DeliveryMan assignedTo;
    private Double totalPrice;
    private OrderStatus orderStatus;
    private Restaurant restaurant;
    private AreaNetwork areaNetwork;
    
    private String customerInstructions;
    
    private String customerFeedBack;
    
    private String managerFeedback;
    
    private String deliveryPersonFeedback;
    
    private String address;
    
    private int customerDeliveryRating;
    
    private int deliveryPersonCustomerRating;
    
    private Date createdDate; 

    public Order(String customerInstructions, String customerFeedBack, String managerFeedback, String deliveryPersonFeedback, Customer orderedBy, Employee acceptedBy, String address, 
            int customerDeliveryRating, int deliveryPersonCustomerRating, Restaurant restaurant, AreaNetwork areaNetwork, OrderStatus orderStatus, Double totalPrice, DeliveryMan deliveryMan,
            Date createdDate) {
        this.orderedBy = orderedBy;
        this.acceptedBy = acceptedBy;
        this.assignedTo = assignedTo;
        this.totalPrice = totalPrice;
        this.orderStatus = orderStatus;
        this.restaurant = restaurant;
        this.areaNetwork = areaNetwork;
        this.customerInstructions = customerInstructions;
        this.customerFeedBack = customerFeedBack;
        this.managerFeedback = managerFeedback;
        this.deliveryPersonFeedback = deliveryPersonFeedback;
        this.address = address;
        this.customerDeliveryRating = customerDeliveryRating;
        this.deliveryPersonCustomerRating = deliveryPersonCustomerRating;
        this.createdDate = new Date();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    public Customer getOrderedBy() {
        return orderedBy;
    }

    public void setOrderedBy(Customer orderedBy) {
        this.orderedBy = orderedBy;
    }

    public Employee getAcceptedBy() {
        return acceptedBy;
    }

    public void setAcceptedBy(Employee acceptedBy) {
        this.acceptedBy = acceptedBy;
    }

    public DeliveryMan getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(DeliveryMan assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Item> getItems() {
        return items;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public AreaNetwork getAreaNetwork() {
        return areaNetwork;
    }

    public void setAreaNetwork(AreaNetwork areaNetwork) {
        this.areaNetwork = areaNetwork;
    }

    public String getCustomerInstructions() {
        return customerInstructions;
    }

    public void setCustomerInstructions(String customerInstructions) {
        this.customerInstructions = customerInstructions;
    }

    public String getCustomerFeedBack() {
        return customerFeedBack;
    }

    public void setCustomerFeedBack(String customerFeedBack) {
        this.customerFeedBack = customerFeedBack;
    }

    public String getManagerFeedback() {
        return managerFeedback;
    }

    public void setManagerFeedback(String managerFeedback) {
        this.managerFeedback = managerFeedback;
    }

    public String getDeliveryPersonFeedback() {
        return deliveryPersonFeedback;
    }

    public void setDeliveryPersonFeedback(String deliveryPersonFeedback) {
        this.deliveryPersonFeedback = deliveryPersonFeedback;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerDeliveryRating() {
        return customerDeliveryRating;
    }

    public void setCustomerDeliveryRating(int customerDeliveryRating) {
        this.customerDeliveryRating = customerDeliveryRating;
    }

    public int getDeliveryPersonCustomerRating() {
        return deliveryPersonCustomerRating;
    }

    public void setDeliveryPersonCustomerRating(int deliveryPersonCustomerRating) {
        this.deliveryPersonCustomerRating = deliveryPersonCustomerRating;
    }
    
    
    
    
}
