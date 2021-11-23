/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Area.AreaNetwork;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.SysAdmin.SysAdminDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyPC1
 */
public class EcoSystem{
    
    private static EcoSystem business;
    private List<AreaNetwork> areaNetworks = new ArrayList<>();
    private CustomerDirectory customerDirectory;
    private SysAdminDirectory sysAdminDirectory;

    public EcoSystem() {

    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public List<AreaNetwork> getAreaNetworks() {
        return areaNetworks;
    }

    public void setAreaNetworks(List<AreaNetwork> areaNetworks) {
        this.areaNetworks = areaNetworks;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public SysAdminDirectory getSysAdminDirectory() {
        return sysAdminDirectory;
    }

    public void setSysAdminDirectory(SysAdminDirectory sysAdminDirectory) {
        this.sysAdminDirectory = sysAdminDirectory;
    }
    
    

}
