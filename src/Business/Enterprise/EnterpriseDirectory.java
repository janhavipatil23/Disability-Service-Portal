/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organizations.Organization;
import Business.Organizations.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author megzy
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Medical) {
            enterprise = new MedicalEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.FoodAndEssentials) {
            enterprise = new FoodAndEssentialsEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Finance) {
            enterprise = new FinanceEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.HouseHold) {
            enterprise = new HouseholdEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }

    public Organization getOrganizationByType(String type, String orgName) {
        Enterprise enterprise = null;
        for (int i = 0; i < enterpriseList.size(); i++) {
            if (enterpriseList.get(i).getName().equals(type)) {
                enterprise = enterpriseList.get(i);
                for (int j = 0; j < enterprise.getOrganizationDirectory().getOrganizationList().size(); j++) {
                    if (enterprise.getOrganizationDirectory().getOrganizationList().get(j).getName().equals(orgName)) {
                        return enterprise.getOrganizationDirectory().getOrganizationList().get(j);
                    }
                }
            }
        }
        return null;
    }

    public Enterprise getEnterprise(String type) {
        Enterprise enterprise = null;
        for (int i = 0; i < enterpriseList.size(); i++) {
            if (enterpriseList.get(i).getName().equals(type)) {
                return enterpriseList.get(i);
            }
        }
        return null;
    }
}
