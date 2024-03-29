
package com.sales.model;

public class Lines {
    private String item;
    private double price;
    private int count;
    private Invoice invoice;

    public Lines() {
    }

    public Lines(String item, double price, int count, Invoice invoice) {
        this.item = item;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public String getItem() {
        return item;
    }

    public double getLineTotal() {
        return price * count;
    }
    
    public int getCount() {
        return count;
    }
    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Invoice getInvoice() {
        return invoice;
    }
    
    public String getAsCSV() {
        return invoice.getNum() + "," + item + "," + price + "," + count;
    }
    @Override
    public String toString() {
        return "Line{" + "num=" + invoice.getNum() + ", item=" + item + ", price=" + price + ", count=" + count + '}';
    }
    
}

