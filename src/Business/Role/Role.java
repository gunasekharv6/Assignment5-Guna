/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author raunak
 */
public enum Role {
    
    RestaurantAdmin,Customer,DeliveryMan,SysAdmin;
    
    public static List<String> getRolesList(){
       
        return Stream.of(Role.values()).map(Role::name).collect(Collectors.toList());
    }
    
    public static String[] getRolesArray() {
        
        return Arrays.stream(Role.values()).map(Role::name).toArray(String[]::new);
    }
}