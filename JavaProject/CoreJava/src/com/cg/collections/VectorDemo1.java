package com.cg.collections;

import java.util.Vector;

public class VectorDemo1 {
    public static void main(String[] args) {
        //Vector provides Dynamic Array ....
        Vector<String> v1= new Vector<>();
        System.out.println("capacity is "+v1.capacity()); //10
        Vector<String> v2= new Vector<>(3); //it creates a array of size 3
        System.out.println("capacity is "+v2.capacity()); //3
        v2.add("Bangalore");
        v2.add("Chennai");
        System.out.println(v2);
        System.out.println("size is "+v2.size());//2
        v2.add("Jodhpur");
        v2.add("Hyderabad");
        System.out.println(v2.size());//4
        System.out.println(v2);
        System.out.println(v2.capacity());//6
        System.out.println(v2.get(0));
        for(String s:v2){
            System.out.println(s);
        }

    }
}
