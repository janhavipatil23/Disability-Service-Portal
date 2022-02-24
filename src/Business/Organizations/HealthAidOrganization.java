/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Role.HealthAidRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author janhavi
 */
public class HealthAidOrganization extends Organization {
    public HealthAidOrganization() {
        super(Organization.Type.HealthAid.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HealthAidRole());
        return roles;
    }
}

