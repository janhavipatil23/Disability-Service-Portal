/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.DB4OUtil.DB4OUtil;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.FoodOrganization;
import Business.Organizations.GroceryAndEssentialsOrganization;
import Business.Organizations.LegalServicesOrganization;
import Business.Organizations.MoneyManagementOrganization;
import Business.Organizations.Organization;
import Business.Role.CovidCareRole;
import Business.Role.CustomerRole;
import Business.Role.FoodManagerRole;
import Business.Role.HouseHoldRole;
import Business.Role.LegalAdvisorRole;
import Business.Role.ManageGroceryRole;
import Business.Role.MoneyAdvisorRole;
import Business.Role.NurseRole;
import Business.Role.SystemAdminRole;
import Business.Role.TherapistRole;
import Business.UserAccount.UserAccount;


/**
 *
 * @author devikamujgule
 */
public class ConfigureASystem {
    
public static EcoSystem configure(){
    
        DB4OUtil dB4OUtil = DB4OUtil.getInstance();
        EcoSystem system = EcoSystem.getInstance();
      
        //Create a network
        Network network = system.createAndAddNetwork();
      
        //create an enterprise
        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise("Medical", Enterprise.EnterpriseType.Medical);
        Enterprise financeEnterprise = network.getEnterpriseDirectory().createAndAddEnterprise("Finance", Enterprise.EnterpriseType.Finance);
    
        //initialize some organizations
        Organization nurseOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Nurse);        
        Organization covidCareOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.CovidCare);
        Organization therapyOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Therapy);
        Organization healthAidOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.HealthAid);
        Organization moneyManagementOrganization = financeEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.MoneyManagement);
        Organization legalServicesOrganization = financeEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.LegalServices);
        
        //create an enterprise - food and essentials
        Enterprise enterprise2 = network.getEnterpriseDirectory().createAndAddEnterprise("FoodAndEssentials", Enterprise.EnterpriseType.FoodAndEssentials);
       
        //initialize some organizations
        FoodOrganization foodOrg;
        Organization foodOrganization = enterprise2.getOrganizationDirectory().createOrganization(Organization.Type.Food);
        foodOrg = (FoodOrganization) foodOrganization;
        foodOrg.generateRevMap();
       
        MoneyManagementOrganization moneyOrg = (MoneyManagementOrganization) moneyManagementOrganization;
        moneyOrg.generateRevMap();
        
        LegalServicesOrganization legalOrg = (LegalServicesOrganization) legalServicesOrganization;
        legalOrg.generateRevMap();
        
        GroceryAndEssentialsOrganization groceryOrg;
        Organization essentialOrganization = enterprise2.getOrganizationDirectory().createOrganization(Organization.Type.GroceryAndEssentials);
        groceryOrg = (GroceryAndEssentialsOrganization) essentialOrganization;
        groceryOrg.generateRevMap();        
        // house hold enterprise
        Enterprise houseHoldEnterprise = network.getEnterpriseDirectory().createAndAddEnterprise("HouseHold", Enterprise.EnterpriseType.HouseHold);
        // house hold organization
        Organization houseHoldOrganization = houseHoldEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.HouseHold);        
       
//        //have some employees 
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        Employee employee1 = system.getEmployeeDirectory().createEmployee("customer");
        Employee employeeMoneyAdmin = system.getEmployeeDirectory().createEmployee("moneyAdmin");
        Employee employeeLegalAdmin = system.getEmployeeDirectory().createEmployee("legalAdmin");        
        Employee employeeNurseAdmin = system.getEmployeeDirectory().createEmployee("nurseAdmin");
        Employee employeeTherapyAdmin = system.getEmployeeDirectory().createEmployee("therapyAdmin");
        Employee employeeCovidCareAdmin = system.getEmployeeDirectory().createEmployee("covidCareAdmin");
        Employee employeeHouseHoldAdmin = system.getEmployeeDirectory().createEmployee("houseHoldAdmin");
        Employee employeeFoodManager = system.getEmployeeDirectory().createEmployee("foodManager");
        Employee employeeMoneyAdvisor = system.getEmployeeDirectory().createEmployee("janhavi");
        UserAccount janhavi = system.getUserAccountDirectory().createUserAccount("janhavi", "janhavi", employeeMoneyAdvisor, new MoneyAdvisorRole("employee"));
        Employee groceryManager = system.getEmployeeDirectory().createEmployee("groceryManager");


//        //create user account
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("customer", "customer", employee1, new CustomerRole());
        ua1.getUserDetails().setCustomerId(1);
        ua1.getUserDetails().setName(employee1.getName());
        ua1.getUserDetails().setEmailId("itsjanhavi@gmail.com");
        ua1.getCardDetails().setCardNumber("1234 5678 2468 2579");
        ua1.getCardDetails().setCardHolderName("customer");
        ua1.getCardDetails().setCardType("Credit Card");
        ua1.getCardDetails().setCVV("123");
        ua1.getCardDetails().setExpiryDate("09/2025");
        UserAccount userMoney = system.getUserAccountDirectory().createUserAccount("moneyAdmin", "moneyAdmin", employeeMoneyAdmin, new MoneyAdvisorRole("admin"));
        UserAccount userLegal = system.getUserAccountDirectory().createUserAccount("legalAdmin", "legalAdmin", employeeLegalAdmin, new LegalAdvisorRole("admin"));
        UserAccount nurseUser = system.getUserAccountDirectory().createUserAccount("nurseAdmin", "nurseAdmin", employeeNurseAdmin, new NurseRole("admin"));   
        UserAccount therapistUser = system.getUserAccountDirectory().createUserAccount("therapyAdmin", "therapyAdmin", employeeTherapyAdmin, new TherapistRole("admin"));
        UserAccount covidCareUser = system.getUserAccountDirectory().createUserAccount("covidCareAdmin", "covidCareAdmin", employeeCovidCareAdmin, new CovidCareRole("admin"));
        UserAccount houseHoldUser = system.getUserAccountDirectory().createUserAccount("houseHoldAdmin", "houseHoldAdmin", employeeHouseHoldAdmin, new HouseHoldRole("admin"));
        UserAccount userFood = system.getUserAccountDirectory().createUserAccount("foodManager", "foodManager", employeeFoodManager, new FoodManagerRole("admin"));
        UserAccount userGrocery = system.getUserAccountDirectory().createUserAccount("groceryManager", "groceryManager", groceryManager, new ManageGroceryRole("admin"));

        
        moneyManagementOrganization.getUserAccountDirectory().getUserAccountList().add(userMoney);
        legalServicesOrganization.getUserAccountDirectory().getUserAccountList().add(userLegal); 
        moneyManagementOrganization.getUserAccountDirectory().getUserAccountList().add(janhavi);
        MoneyManagementOrganization mm = (MoneyManagementOrganization) moneyManagementOrganization;
        mm.getMoneyAdvisorsList().add(janhavi);
        
        nurseOrganization.getUserAccountDirectory().getUserAccountList().add(nurseUser);        
        therapyOrganization.getUserAccountDirectory().getUserAccountList().add(therapistUser);
        covidCareOrganization.getUserAccountDirectory().getUserAccountList().add(covidCareUser);
        houseHoldOrganization.getUserAccountDirectory().getUserAccountList().add(houseHoldUser);
        foodOrganization.getEmployeeDirectory().getEmployeeList().add(employeeFoodManager);
        foodOrganization.getUserAccountDirectory().getUserAccountList().add(userFood);
        essentialOrganization.getUserAccountDirectory().getUserAccountList().add(userGrocery);

//      dB4OUtil.storeSystem(system);
        return system;
    }
    
}

