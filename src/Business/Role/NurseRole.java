/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.NursingOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.Admin.OrganizationAdminJpanel;
import UI.Admin.Nurse.NurseOrgAdminJpanel;
import UI.Employee.OrganizationEmployeePanel;

/**
 *
 * @author janhavi
 */
public class NurseRole extends Role{
    String type;
    public NurseRole() {
    }
    
    public NurseRole(String type) {
        this.type = type;
        
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        System.out.println("role....");
        if (type.equalsIgnoreCase("admin")) {
//            organization = (NursingOrganization) organization;
            return new NurseOrgAdminJpanel(userProcessContainer, account, (NursingOrganization) organization, business);
        }
        return new OrganizationEmployeePanel(userProcessContainer, account, (NursingOrganization) organization, business);
    }
    
}
