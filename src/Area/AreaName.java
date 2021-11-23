/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Area;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author gunav
 */
public enum AreaName {
    HeathSt,HungtingtonAvenue,Cambridge,BackBay,Ruggles;
    
    public static List<String> getAreasList(){
       
        return Stream.of(AreaName.values()).map(AreaName::name).collect(Collectors.toList());
    }
    
    public static String[] getAreasArray() {
        
        return Arrays.stream(AreaName.values()).map(AreaName::name).toArray(String[]::new);
    }    
    
}
