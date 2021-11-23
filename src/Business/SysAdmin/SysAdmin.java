/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SysAdmin;

import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author gunav
 */
public class SysAdmin{
    private UserAccount  userAccount;
    
    public SysAdmin(String name, String phoneNo, String email, String userName, String password) {
        userAccount = new UserAccount(name, phoneNo, email, userName, password, Role.SysAdmin);
        userAccount.setParentClass(this);
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public String toString() {
        return userAccount.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
