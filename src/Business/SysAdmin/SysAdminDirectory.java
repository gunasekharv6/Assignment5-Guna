/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SysAdmin;

import Business.Role.Role;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gunav
 */
public class SysAdminDirectory{
    
    private List<SysAdmin> sysAdmins = new ArrayList<>();

    public SysAdminDirectory(List<SysAdmin> sysAdmins) {
        
        this.sysAdmins = sysAdmins;
    }
    
    public SysAdminDirectory() {
         
    }
    
    public List<SysAdmin> getSysAdmins() {
        return sysAdmins;
    }

    public void setSysAdmins(List<SysAdmin> sysAdmins) {
        this.sysAdmins = sysAdmins;
    }
    
    public void createSysAdmin(String name, String phoneNo, String email, String userName, String password) {
        
        getSysAdmins().add(new SysAdmin(name,phoneNo,email,userName,password));
        
    }
    
    public SysAdmin isUserSysAdmin(String userName, String password){
        
        if(!getSysAdmins().isEmpty()){
            for(SysAdmin sysAdmin:getSysAdmins()){
                if(sysAdmin.getUserAccount().getUserName().equals(userName) && sysAdmin.getUserAccount().getPassword().equals(password)){
                    return sysAdmin;
                }
            }
        }
        return null;
    }
}
