/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JFrame;

import javax.swing.JPanel;
import UI.Customer.CustomerDashboard;

/**
 *
 * @author janhavi
 */
public class CustomerRole extends Role{
    
//
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CustomerDashboard(userProcessContainer, account, organization, business);
    }

   
    
}
