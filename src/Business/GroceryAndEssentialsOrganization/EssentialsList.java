/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.GroceryAndEssentialsOrganization;

import Business.GroceryAndEssentialsOrganization.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author janhavi
 */
public class EssentialsList {
     List<ShoppingItem> shoppingList;

    public EssentialsList() {
        shoppingList = new ArrayList<ShoppingItem>();
        makeList();
    }

    public List<ShoppingItem> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<ShoppingItem> shoppingList) {
        this.shoppingList = shoppingList;
    }
    
    public void makeList(){
        ShoppingItem si1 = new ShoppingItem("Bread", 5.5);
        shoppingList.add(si1);
        ShoppingItem si2 = new ShoppingItem("Coke", 10.0);
        shoppingList.add(si2);
        ShoppingItem si3 = new ShoppingItem("Chocloates", 13.0);
        shoppingList.add(si3);
        ShoppingItem si4 = new ShoppingItem("Fish", 4.0);
        shoppingList.add(si4);
        ShoppingItem si5 = new ShoppingItem("Oil", 10.0);
        shoppingList.add(si5);
        ShoppingItem si6 = new ShoppingItem("Salt", 4.0);
        shoppingList.add(si6);
        ShoppingItem si7 = new ShoppingItem("Fruits", 11.0);
        shoppingList.add(si7);
        ShoppingItem si8 = new ShoppingItem("Broccoli", 5.0);
        shoppingList.add(si8);
        ShoppingItem si9 = new ShoppingItem("Spinach", 6.0);
        shoppingList.add(si9);
        ShoppingItem si10 = new ShoppingItem("Clorox Cleaner", 13.7);
        shoppingList.add(si10);
        ShoppingItem si11 = new ShoppingItem("Honey", 2.5);
        shoppingList.add(si11);
        ShoppingItem si12 = new ShoppingItem("Sugar", 3.5);
        shoppingList.add(si12);
        ShoppingItem si13 = new ShoppingItem("Waffles", 10.0);
        shoppingList.add(si13);
        ShoppingItem si14 = new ShoppingItem("Spoons set", 7.0);
        shoppingList.add(si14);
        ShoppingItem si15 = new ShoppingItem("Facewash", 1.5);
        shoppingList.add(si15);
        ShoppingItem si16 = new ShoppingItem("Room freshner", 2.0);
        shoppingList.add(si16);
        ShoppingItem si17 = new ShoppingItem("Dusting cloth", 1.0);
        shoppingList.add(si17);
        ShoppingItem si18 = new ShoppingItem("Soap", 4.5);
        shoppingList.add(si18);
        ShoppingItem si19 = new ShoppingItem("Shower cutain", 15.0);
        shoppingList.add(si19);
        ShoppingItem si20 = new ShoppingItem("Pillows", 40.4);
        shoppingList.add(si20);
    }
}


