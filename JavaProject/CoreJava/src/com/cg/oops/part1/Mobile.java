package com.cg.oops.part1;
public class Mobile extends Product {
    private String ram;
    private String camera;
    public Mobile(int id, String prodName, float price, String ram, String camera) {
        super(id, prodName, price);
        this.ram = ram;
        this.camera = camera;
    }
   public void display(){
        System.out.println("Ram : "+ram);
        System.out.println("Camera "+camera);
        super.display();
    }
}
