package com.cg.oops.part1;
public class Product {
    private int id;
    private String prodName;
    private float price;
    public Product(int id, String prodName, float price) {
        this.id = id;
        this.prodName = prodName;
        this.price = price;
    }
     public void display(){
        System.out.println("Product id "+id);
        System.out.println("Product Name "+prodName);
        System.out.println("Price "+price);
    }
}
