package com.cg.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Thejashri");
        list.add("Aishwarya");
        list.add("Sanjeev");
        list.add("Gopi");
        list.add("Abilash");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("---after sorting---");
        System.out.println(list);

        ArrayList<Cake>cakeList=new ArrayList<>();
        cakeList.add(new Cake("Chocolate", 500));
        cakeList.add(new Cake("Vannila", 300));
        cakeList.add(new Cake("Plain Cake", 100));
        cakeList.add(new Cake("Blue Berry", 600));
        cakeList.add(new Cake("Rasp Berry", 700));
        Collections.sort(cakeList);
        System.out.println("--------------");
        for(Cake c:cakeList){
            System.out.println(c.getCakeName()+"  "+c.getPrice());
        }
    }
}
