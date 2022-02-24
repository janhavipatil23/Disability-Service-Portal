/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.GroceryAndEssentialsOrganization.ShoppingItem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author janhavi
 */
public class GroceryWorkRequest extends WorkRequest{
    
    List<ShoppingItem> shoppingList;
    private double total;

    public GroceryWorkRequest() {
        shoppingList = new ArrayList<ShoppingItem>();
    }

    public List<ShoppingItem> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<ShoppingItem> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
