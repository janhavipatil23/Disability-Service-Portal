/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author janhavi
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    List<RevenueMap> revMap = new ArrayList<>();
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization"), 
        Nurse("Nurse Organization"), Therapy("Therapy Organization"), HealthAid("HealthAid Organization"), 
        CovidCare("CovidCare Organization"), Food("Food Organization"),MoneyManagement("Money Management Organization"),
        GroceryAndEssentials("GroceryAndEssentials Organization"),LegalServices("Legal Services Organization"),
        HouseHold("HouseHold Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
   
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    public void generateRevMap(){
    }
//    
//    public void generateRevenue(){
//    }
//
//    public Map<List<String>, Double> getRevenueMap() {
//        return revenueMap;
//    }
//
//    public void setRevenueMap(Map<List<String>, Double> revenueMap) {
//        this.revenueMap = revenueMap;
//    }

    public List<RevenueMap> getRevMap() {
        return revMap;
    }

    public void setRevMap(List<RevenueMap> revMap) {
        this.revMap = revMap;
    }
    
    
    
}
