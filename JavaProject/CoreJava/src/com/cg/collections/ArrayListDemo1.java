package com.cg.collections;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        CakeShop shop=new CakeShop();
        shop.addNewCake("Chocolate");
        shop.addNewCake("BlackBerry");
        shop.addNewCake("Blue berry");
        shop.addNewCake("Red Velvet");
        shop.addNewCakeInBegining("Hazelnut");
        shop.modifyCake("StrawBerry", 1);
        ArrayList<String> list=   shop.getAllCakes();
        for(String c:list){
            System.out.println(c);
        }


    }
}
