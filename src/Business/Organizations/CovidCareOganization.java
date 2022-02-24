/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Role.CovidCareRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
/**
 *
 * @author janhavi
 */
public class CovidCareOganization extends Organization {
    ArrayList<UserAccount> doctorList = new ArrayList<UserAccount>();

    public ArrayList<UserAccount> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<UserAccount> doctorList) {
        this.doctorList = doctorList;
    }
    
    public CovidCareOganization() {
        super(Organization.Type.CovidCare.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CovidCareRole());
        return roles;
    }
    
}

