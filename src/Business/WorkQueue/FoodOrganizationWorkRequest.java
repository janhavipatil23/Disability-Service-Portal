/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.FoodOrganization.FoodItems;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author janhavi
 */
public class FoodOrganizationWorkRequest extends WorkRequest{
    
    private List<FoodItems> foodList;
    private double total;

    public FoodOrganizationWorkRequest() {
        foodList = new ArrayList<FoodItems>();
    }

    public List<FoodItems> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<FoodItems> foodList) {
        this.foodList = foodList;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
