/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;
import Business.Role.Role;

/**
 *
 * @author janhavi
 */
public class HouseholdEnterprise extends Enterprise {
    
    public HouseholdEnterprise(String name){
        super(name,Enterprise.EnterpriseType.HouseHold);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
