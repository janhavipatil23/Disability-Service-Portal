/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Enterprise.Enterprise;
import Business.Organizations.Organization.Type;
import Business.Role.HealthAidRole;
import java.util.ArrayList;

/**
 *
 * @author megzy
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Nurse.getValue())){
            organization = new NursingOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.CovidCare.getValue())){
            organization = new CovidCareOganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.HealthAid.getValue())){
            organization = new HealthAidOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Therapy.getValue())){
            organization = new TherapyOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Food.getValue())){
                    System.out.println("if create" + type);
            organization = new FoodOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.MoneyManagement.getValue())){
            organization = new MoneyManagementOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.GroceryAndEssentials.getValue())){
            organization = new GroceryAndEssentialsOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.LegalServices.getValue())){
            organization = new LegalServicesOrganization();
            organizationList.add(organization);
        } else if(type.getValue().equals(Type.HouseHold.getValue())){
            organization = new HouseHoldOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization getOrganizationByType(Enterprise enterprise, String type){
        Organization organization=null;
        for(int i=0; i < enterprise.getOrganizationDirectory().getOrganizationList().size(); i++){
            System.out.println("orgo>>>"+enterprise.getOrganizationDirectory().getOrganizationList().get(i).getName());
            if(enterprise.getOrganizationDirectory().getOrganizationList().get(i).getName() == type){
                organization = enterprise.getOrganizationDirectory().getOrganizationList().get(i);
            }
        }
        return organization;
        
    }
    
    
}