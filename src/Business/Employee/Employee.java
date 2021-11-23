/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author gunav
 */
public class Employee {
    
    private UserAccount useraccount;
    
    public Employee(String name, String phoneNo, String email, String userName, String password) {
        useraccount = new UserAccount(name, phoneNo, email, userName, password, Role.RestaurantAdmin);
        useraccount.setParentClass(this);
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
