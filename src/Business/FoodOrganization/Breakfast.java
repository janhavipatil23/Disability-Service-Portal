/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodOrganization;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author janhavi
 */
public class Breakfast {
    
    List<FoodItems> vegList = new ArrayList<FoodItems>();
    List<FoodItems> nonVegList = new ArrayList<FoodItems>();
    List<FoodItems> veganList = new ArrayList<FoodItems>();

    public Breakfast() {
        generateVegList();
        generateNonVegList();
        generateVeganList();
    }

    private void generateVegList() {
        FoodItems fi1 = new FoodItems("Breakfast","Veg" , "Corn Flakes Cereal", 2.00);
        FoodItems fi2 = new FoodItems("Breakfast", "Veg" ,"Avocado Toast", 1.50);
        FoodItems fi3 = new FoodItems("Breakfast","Veg" , "Pancakes and Syrup", 2.00);
        FoodItems fi4 = new FoodItems("Breakfast","Veg" , "Waffles and Cream", 2.50);
        vegList.add(fi1);
        vegList.add(fi2);
        vegList.add(fi3);
        vegList.add(fi4);
    }

    private void generateNonVegList() {
        FoodItems fi1 = new FoodItems("Breakfast","Non-Veg" , "Hotdog", 2.00);
        FoodItems fi2 = new FoodItems("Breakfast","Non-Veg" , "French Toast", 2.00);
        FoodItems fi3 = new FoodItems("Breakfast","Non-Veg" , "Scrambled eggs", 3.00);
        FoodItems fi4 = new FoodItems("Breakfast","Non-Veg" , "Breakfast burrito", 4.00);
        nonVegList.add(fi1);
        nonVegList.add(fi2);
        nonVegList.add(fi3);
        nonVegList.add(fi4);
    }

    private void generateVeganList() {
        FoodItems fi1 = new FoodItems("Breakfast","Vegan", "Bread Butter Toast", 2.00);
        FoodItems fi2 = new FoodItems("Breakfast","Vegan", "Cereals", 1.50);
        FoodItems fi3 = new FoodItems("Breakfast","Vegan", "Avocado Toast", 2.00);
        FoodItems fi4 = new FoodItems("Breakfast","Vegan", "Milk Cookies", 2.50);
        veganList.add(fi1);
        veganList.add(fi2);
        veganList.add(fi3);
        veganList.add(fi4);
    }
    
    public List<FoodItems> getVegList() {
        return vegList;
    }

    public List<FoodItems> getNonVegList() {
        return nonVegList;
    }

    public List<FoodItems> getVeganList() {
        return veganList;
    }
    
}

    

