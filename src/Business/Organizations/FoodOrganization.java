 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.FoodOrganization.Breakfast;
import Business.FoodOrganization.Dinner;
import Business.Role.Role;
import java.util.ArrayList;
import Business.FoodOrganization.FoodItems;
import Business.FoodOrganization.Lunch;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodOrganizationWorkQueue;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author janhavi
 */

//this is test 

public class FoodOrganization extends Organization{
    
    List<FoodItems> veganBreakfastList;
    List<FoodItems> vegBreakfastList;
    List<FoodItems> nonvegBreakfastList;
    List<FoodItems> veganLunchList;
    List<FoodItems> vegLunchList;
    List<FoodItems> nonvegLunchList;
    List<FoodItems> veganDinnerList;
    List<FoodItems> vegDinnerList;
    List<FoodItems> nonvegDinnerList;
    Breakfast bf = new Breakfast();
    Lunch lunch = new Lunch();
    Dinner dinner = new Dinner();
    FoodOrganizationWorkQueue foodQueue = new FoodOrganizationWorkQueue();
    //Map<List<String>,Double> map = new LinkedHashMap<>();
    List<RevenueMap> revMap = new ArrayList<>();
    List<UserAccount> deliveryManList = new ArrayList<>();
    
    public FoodOrganization() {
        super(Type.Food.getValue());
        this.veganBreakfastList = bf.getVeganList();
        this.vegBreakfastList = bf.getVegList();
        this.nonvegBreakfastList = bf.getNonVegList();
        this.veganLunchList = lunch.getVeganList();
        this.vegLunchList = lunch.getVegList();
        this.nonvegLunchList = lunch.getNonVegList();
        this.veganDinnerList = dinner.getVeganList();
        this.vegDinnerList = dinner.getVegList();
        this.nonvegDinnerList = dinner.getNonVegList();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }

    public List<FoodItems> getVeganBreakfastList() {
        return veganBreakfastList;
    }

    public List<FoodItems> getVegBreakfastList() {
        return vegBreakfastList;
    }

    public List<FoodItems> getNonvegBreakfastList() {
        return nonvegBreakfastList;
    }

    public List<FoodItems> getVeganLunchList() {
        return veganLunchList;
    }

    public List<FoodItems> getVegLunchList() {
        return vegLunchList;
    }

    public List<FoodItems> getNonvegLunchList() {
        return nonvegLunchList;
    }

    public List<FoodItems> getVeganDinnerList() {
        return veganDinnerList;
    }

    public List<FoodItems> getVegDinnerList() {
        return vegDinnerList;
    }

    public List<FoodItems> getNonvegDinnerList() {
        return nonvegDinnerList;
    }
    
    public FoodItems getFoodItemByName(String meal, String type, String name){
        FoodItems foodItem = null;
        
        if(meal.equals("Breakfast") && type.equals("Veg")){
            for(int i = 0; i < vegBreakfastList.size(); i++){
                if(vegBreakfastList.get(i).getFoodItemsName().equals(name)){
                    foodItem = vegBreakfastList.get(i);
                }
            }
        }else if(meal.equals("Breakfast") && type.equals("Vegan")){
            for(int i = 0; i < veganBreakfastList.size(); i++){
                if(veganBreakfastList.get(i).getFoodItemsName().equals(name)){
                    foodItem = veganBreakfastList.get(i);
                }
            }
        }else if(meal.equals("Breakfast") && type.equals("Non-Veg")){
            for(int i = 0; i < nonvegBreakfastList.size(); i++){
                if(nonvegBreakfastList.get(i).getFoodItemsName().equals(name)){
                    foodItem = nonvegBreakfastList.get(i);
                }
            }
        }else if(meal.equals("Lunch") && type.equals("Veg")){
            for(int i = 0; i < vegLunchList.size(); i++){
                if(vegLunchList.get(i).getFoodItemsName().equals(name)){
                    foodItem = vegLunchList.get(i);
                }
            }
        }else if(meal.equals("Lunch") && type.equals("Vegan")){
            for(int i = 0; i < veganLunchList.size(); i++){
                if(veganLunchList.get(i).getFoodItemsName().equals(name)){
                    foodItem = veganLunchList.get(i);
                }
            }
        }else if(meal.equals("Lunch") && type.equals("Non-Veg")){
            for(int i = 0; i < nonvegLunchList.size(); i++){
                if(nonvegLunchList.get(i).getFoodItemsName().equals(name)){
                    foodItem = nonvegLunchList.get(i);
                }
            }
        }else if(meal.equals("Dinner") && type.equals("Veg")){
            for(int i = 0; i < vegDinnerList.size(); i++){
                if(vegDinnerList.get(i).getFoodItemsName().equals(name)){
                    foodItem = vegDinnerList.get(i);
                }
            }
        }else if(meal.equals("Dinner") && type.equals("Vegan")){
            for(int i = 0; i < veganDinnerList.size(); i++){
                if(veganDinnerList.get(i).getFoodItemsName().equals(name)){
                    foodItem = veganDinnerList.get(i);
                }
            }
        }else if(meal.equals("Dinner") && type.equals("Non-Veg")){
            for(int i = 0; i < nonvegDinnerList.size(); i++){
                if(nonvegDinnerList.get(i).getFoodItemsName().equals(name)){
                    foodItem = nonvegDinnerList.get(i);
                }
            }
        }
        
        return foodItem;
    }
    
    
    
    @Override
    public void generateRevMap(){
        revMap = new ArrayList<>();
        AllRevenueMap m = new AllRevenueMap();
        m.generatedMap();
        revMap = m.getMap();
    }
    
    @Override
    public List<RevenueMap> getRevMap() {
        return revMap;
    }
    
    @Override
    public void setRevMap(List<RevenueMap> revMap) {
        this.revMap = revMap;
    }
    
    public void addToMap(int year, String month, Double rev, int x){
        RevenueMap revenue = new RevenueMap(year, month, rev, x);
        revMap.add(revenue);
    }
    
    public FoodOrganizationWorkQueue getFoodQueue() {
        return foodQueue;
    }

    public void setFoodQueue(FoodOrganizationWorkQueue foodQueue) {
        this.foodQueue = foodQueue;
    }
    
    public List<UserAccount> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(List<UserAccount> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
    
}

    

