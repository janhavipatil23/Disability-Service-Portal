/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author megzy
 */
public abstract class Role {
    
    public enum RoleType{
        CovidCare("CovidCare"),
        Doctor("Doctor"),
        HealthAid("HealthAid"),LegalAdvisor("Legal Advisor"),MoneyAdvisor("Money Advisor"),Nurse("Nurse"),Therapist("Therapist"),
        Customer("Customer"),SystemAdmin("SystemAdmin"), FoodManager("FoodManager"),GroceryManager("GroceryManager");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}