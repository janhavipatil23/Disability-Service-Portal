/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author janhavi
 */
public class FoodOrganizationWorkQueue {
    
    List<FoodOrganizationWorkRequest> allrequests;

    public FoodOrganizationWorkQueue() {
        allrequests = new ArrayList<FoodOrganizationWorkRequest>();
    }

    public List<FoodOrganizationWorkRequest> getAllrequests() {
        return allrequests;
    }

    public void setAllrequests(List<FoodOrganizationWorkRequest> allrequests) {
        this.allrequests = allrequests;
    }
    
    
    
}
