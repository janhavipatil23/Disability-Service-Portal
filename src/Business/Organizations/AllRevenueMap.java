/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author janhavi
 */
public class AllRevenueMap { 
    
    List<RevenueMap> map = new ArrayList<>();
    
    
    
    public void generatedMap(){
        RevenueMap r1 = new RevenueMap(2020, "Jan", 120.0, 1);
        map.add(r1);
        RevenueMap r2 = new RevenueMap(2020, "Feb", 20.0, 2);
        map.add(r2);
        RevenueMap r3 = new RevenueMap(2020, "Mar", 220.0, 3);
        map.add(r3);
        RevenueMap r4 = new RevenueMap(2020, "Apr", 160.0, 4);
        map.add(r4);
        RevenueMap r5 = new RevenueMap(2020, "May", 180.0, 5);
        map.add(r5);
        RevenueMap r6 = new RevenueMap(2020, "Jun", 170.0, 6);
        map.add(r6);
        RevenueMap r7 = new RevenueMap(2020, "Jul", 110.0, 7);
        map.add(r7);
        RevenueMap r8 = new RevenueMap(2020, "Aug", 60.0, 8);
        map.add(r8);
        RevenueMap r9 = new RevenueMap(2020, "Sep", 100.0, 9);
        map.add(r9);
        RevenueMap r10 = new RevenueMap(2020, "Oct", 110.0, 10);
        map.add(r10);
        RevenueMap r11 = new RevenueMap(2020, "Nov", 160.0, 11);
        map.add(r11);
        RevenueMap r12 = new RevenueMap(2020, "Dec", 190.0, 12);
        map.add(r12);
        RevenueMap r13 = new RevenueMap(2021, "Jan", 40.0, 1);
        map.add(r13);
        RevenueMap r14 = new RevenueMap(2021, "Feb", 80.0, 2);
        map.add(r14);
        RevenueMap r15 = new RevenueMap(2021, "Mar", 110.0, 3);
        map.add(r15);
        RevenueMap r16 = new RevenueMap(2021, "Apr", 0.0, 4);
        map.add(r16);
        RevenueMap r17 = new RevenueMap(2021, "May", 0.0, 5);
        map.add(r17);
        RevenueMap r18 = new RevenueMap(2021, "Jun", 0.0, 6);
        map.add(r18);
        RevenueMap r19 = new RevenueMap(2021, "Jul", 0.0, 7);
        map.add(r19);
        RevenueMap r20 = new RevenueMap(2021, "Aug", 0.0, 8);
        map.add(r20);
        RevenueMap r21 = new RevenueMap(2021, "Sep", 0.0, 9);
        map.add(r21);
        RevenueMap r22 = new RevenueMap(2021, "Oct", 0.0, 10);
        map.add(r22);
        RevenueMap r23 = new RevenueMap(2021, "Nov", 0.0, 11);
        map.add(r23);
        RevenueMap r24 = new RevenueMap(2021, "Dec", 0.0, 12);
        map.add(r24);
    }

    public List<RevenueMap> getMap() {
        return map;
    }

    public void setMap(List<RevenueMap> map) {
        this.map = map;
    }
    
    
    
}

