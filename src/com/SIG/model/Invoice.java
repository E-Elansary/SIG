
package com.sales.model;

import java.util.ArrayList;

public class Invoice {
    private int num;
    private String date;
    private String customer;
    private ArrayList<Lines> lines;
    
    public Invoice() {
    }

    public Invoice(int num, String date, String customer) {
        this.num = num;
        this.date = date;
        this.customer = customer;
    }

    public double getInvoiceTotal() {
        double total = 0.0;
        for (Lines line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }
    
    public ArrayList<Lines> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public String getCustomer() {
        return customer;
    }
       public int getNum() {
        return num;
    }
    
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + num + ", date=" + date + ", customer=" + customer + '}';
    }
    
    public String getAsCSV() {
        return num + "," + date + "," + customer;
    }
    
}
