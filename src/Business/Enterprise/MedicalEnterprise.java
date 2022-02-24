/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;


import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author janhavi
 */
public class MedicalEnterprise extends Enterprise{
    
     public MedicalEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Medical);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
