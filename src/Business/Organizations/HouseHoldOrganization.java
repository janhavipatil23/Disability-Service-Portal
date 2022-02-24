/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Role.HouseHoldRole;
import Business.Role.NurseRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author janhavi
 */
public class HouseHoldOrganization extends Organization{
    HashMap<String, Double> servicesList = new HashMap<String, Double>();
    ArrayList<UserAccount> helperList = new ArrayList<UserAccount>();

    public ArrayList<UserAccount> getHelperList() {
        return helperList;
    }

    public void setHelperList(ArrayList<UserAccount> helperList) {
        this.helperList = helperList;
    }
    
    public HashMap<String, Double> getServicesList() {
        return servicesList;
    }

    public void setServicesList(HashMap<String, Double> servicesList) {
        this.servicesList = servicesList;
    }
    
    public HouseHoldOrganization() {
        super(Organization.Type.HouseHold.getValue());
        servicesList.put("Laundry", 20.00);
        servicesList.put("Bed making and linen changes", 22.00);
        servicesList.put("Cleaning bathrooms and kitchen", 14.00);
        servicesList.put("Taking out the trash", 10.00);        
        servicesList.put("Watering plants", 12.00);
        servicesList.put("Pet care", 10.00);     
        servicesList.put("Dusting, vacuuming, and floor care (sweeping/mopping)", 21.00);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HouseHoldRole());
        return roles;
    }
    
}


