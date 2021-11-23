/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.Date;

/**
 *
 * @author gunav
 */
public class Item { 
   
    private String productName;
    
    private Double price;

    public Item(String productName, Double price) {
        this.productName = productName;
        this.price = price;
    }
    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getProductName(); //To change body of generated methods, choose Tools | Templates.
    }    
}
