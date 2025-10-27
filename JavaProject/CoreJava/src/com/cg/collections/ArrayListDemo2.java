package com.cg.collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        CakeShop2 shop=new CakeShop2();
       shop.addNewCake(new Cake("Chocolate", 250));

       //this shud not add
       shop.addNewCake(new Cake("Chocolate", 100));

    }
}
