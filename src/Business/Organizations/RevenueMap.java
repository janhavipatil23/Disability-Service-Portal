/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

/**
 *
 * @author devika
 */
public class RevenueMap {
    
    private int year;
    private String month;
    private double revenue;
    private int mon;

    public RevenueMap(int year, String month, double revenue, int mon) {
        this.year = year;
        this.month = month;
        this.revenue = revenue;
        this.mon = mon;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public int getMon() {
        return mon;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }
    
    public void generateRevenue(){
        
    }
}
