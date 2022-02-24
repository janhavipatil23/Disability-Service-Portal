/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Role.Role;
import Business.Role.TherapistRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author devika
 */
public class TherapyOrganization extends Organization {
    HashMap<String, Double> servicesList = new HashMap<String, Double>();
    ArrayList<UserAccount> therapistList = new ArrayList<UserAccount>();

    public ArrayList<UserAccount> getTherapistList() {
        return therapistList;
    }

    public void setTherapistList(ArrayList<UserAccount> therapistList) {
        this.therapistList = therapistList;
    }
    
    public HashMap<String, Double> getServicesList() {
        return servicesList;
    }

    public void setServicesList(HashMap<String, Double> servicesList) {
        this.servicesList = servicesList;
    }
    public TherapyOrganization() {
        super(Organization.Type.Therapy.getValue());
        servicesList.put("Mental Health Therapy", 100.00);
        servicesList.put("Occupational Therapy", 110.00);
        servicesList.put("Anti Depression Therapy", 120.00);
        servicesList.put("Chronic Illness Therapy", 130.00);
        servicesList.put("Counselling Therapy", 140.00);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TherapistRole());
        return roles;
    }
}
