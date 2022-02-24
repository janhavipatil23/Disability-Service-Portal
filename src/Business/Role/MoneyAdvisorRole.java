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
import UI.Admin.MoneyAdvisor.MoneyAdvisorHomeJpanel;
import UI.Admin.OrganizationAdminJpanel;
import UI.Employee.OrganizationEmployeePanel;

/**
 *
 * @author megzy
 */
public class MoneyAdvisorRole extends Role{

    String type;
    public MoneyAdvisorRole() {
    }
    
    public MoneyAdvisorRole(String type) {
        this.type = type;
        
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        if (type.equalsIgnoreCase("admin")) {
            return new MoneyAdvisorHomeJpanel(userProcessContainer, account, organization, business);
        }
        return new OrganizationEmployeePanel(userProcessContainer, account, organization, business); 
        
    }
    
}
