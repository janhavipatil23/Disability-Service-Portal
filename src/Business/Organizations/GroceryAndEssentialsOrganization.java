/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.GroceryAndEssentialsOrganization.EssentialsList;
import Business.GroceryAndEssentialsOrganization.ShoppingItem;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author janhavi
 */
public class GroceryAndEssentialsOrganization extends Organization{
    
    List<ShoppingItem> shoppingList;
    EssentialsList list = new EssentialsList();
    List<UserAccount> deliveryManList = new ArrayList<>();
    List<RevenueMap> revMap = new ArrayList<>();
    
    public GroceryAndEssentialsOrganization() {
        super(Organization.Type.GroceryAndEssentials.getValue());
        shoppingList = list.getShoppingList();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<ShoppingItem> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<ShoppingItem> shoppingList) {
        this.shoppingList = shoppingList;
    }
    
    public ShoppingItem getItemByName(String name){
        ShoppingItem item = null;
        
        for(int i = 0; i < shoppingList.size(); i++){
            if(shoppingList.get(i).getItemName().equals(name)){
                item = shoppingList.get(i);
            }
        }
        
        return item;
    }
    
    public List<UserAccount> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(List<UserAccount> deliveryManList) {
        this.deliveryManList = deliveryManList;
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
    
}

    

