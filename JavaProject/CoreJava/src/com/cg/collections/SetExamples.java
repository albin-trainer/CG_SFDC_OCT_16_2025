package com.cg.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        //Never permits duplicates
        //HashSet - no guranty for order
        HashSet<String> set1=new HashSet<>();
        set1.add("Orange");
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Grapes");
        set1.add("Banana");
        System.out.println(set1);
        //TreeSet - no duplicates, elements sorted  by default
        TreeSet<String> set2=new TreeSet<>();
        set2.add("Orange");
        set2.add("Apple");
        set2.add("Banana");
        set2.add("Grapes");
        set2.add("Banana");
        System.out.println(set2);

    }
}
