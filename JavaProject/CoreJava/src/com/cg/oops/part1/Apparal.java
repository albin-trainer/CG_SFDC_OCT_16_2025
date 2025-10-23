package com.cg.oops.part1;
public class Apparal extends Product {
    private String size;
    private String color;
    public Apparal(int id, String prodName, float price, String size, String color) {
        super(id, prodName, price);
        this.size = size;
        this.color = color;
    }
    public void display(){
        System.out.println("Size : "+size);
        System.out.println("Color : "+color);
        super.display();
    }
}
