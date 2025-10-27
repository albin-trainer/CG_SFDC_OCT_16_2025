package com.cg.collections;
public class Cake {
    private String cakeName;
    private float price;
    //setter and getter
    //constructor with args
    public Cake(String cakeName, float price) {
        this.cakeName = cakeName;
        this.price = price;
    }
    
    public String getCakeName() {
        return cakeName;
    }
    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    
}
