/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.SysAdmin.SysAdmin;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String name;

    private String phoneNo;
    
    private String email;
    
    private String userName;
    
    private String password;
    
    private Role role;
    
    private Object parentClass;
//    private Customer customer;
//    private DeliveryMan deliveryman;
//    private Employee employee;
//    private SysAdmin systemadmin;

    public UserAccount(String name, String phoneNo, String email, String userName, String password, Role role) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public Object getParentClass() {
        return parentClass;
    }

    public void setParentClass(Object parentClass) {
        this.parentClass = parentClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    
    
}