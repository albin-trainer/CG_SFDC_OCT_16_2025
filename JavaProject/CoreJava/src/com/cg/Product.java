package com.cg;
public class Product {
    private int productId;
    private String productName;
    private float price;
    private float ratings;
         public Product(int productId, String productName, float price, float ratings) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.ratings = ratings;
    }
    void display(){
        System.out.println("Id : "+productId);
        System.out.println("Prodname : "+productName);
        System.out.println("Price : "+price);
        System.out.println("Ratings :"+ratings);
    }
}
