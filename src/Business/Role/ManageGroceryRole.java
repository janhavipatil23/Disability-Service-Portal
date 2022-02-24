/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.Admin.HomeEssentials.OrganizationAdminJpanel;
import UI.Admin.HomeEssentials.AdminHomeJPanel;
import UI.Employee.OrganizationEmployeePanel;

/**
 *
 * @author megzy
 */
public class ManageGroceryRole extends Role{
    String type;
    public ManageGroceryRole() {
    }
    
    public ManageGroceryRole(String type) {
        this.type = type;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        if (type.equalsIgnoreCase("admin")) {
            return new OrganizationAdminJpanel(userProcessContainer, account, organization, business);
        }
        return new OrganizationEmployeePanel(userProcessContainer, account, organization, business);
    }
    
}
