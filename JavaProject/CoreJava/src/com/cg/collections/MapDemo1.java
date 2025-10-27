package com.cg.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Float> map1= new HashMap<>();
        map1.put("Banana",100f);
        map1.put("Apple", 250f);
        map1.put("Mango", 200f);
        map1.put("Apple", 240f); //overwrites ....
        map1.put("Grapes", 90f);
        System.out.println(map1);
        System.out.println(map1.containsKey("Mango"));
        System.out.println(map1.containsKey("Kiwi"));
        System.out.println(map1.containsValue(100f));
        System.out.println(map1.containsValue(99f));
        Float price=map1.get("Mango"); //returns value, returns null if key not found
        System.out.println(price);
         Set<String> keys=  map1.keySet(); //returns Set of keys
         System.out.println("------------");
         for(String k:keys){
             System.out.println(k);
         }
        Collection<Float> values= map1.values(); //returns values
        System.out.println("-----------------");
        for(Float v:values){
            System.out.println(v);
        }
        System.out.println("***********************");
     Set<Map.Entry<String,Float>> rows=      map1.entrySet();
        for(Map.Entry<String,Float> r:rows){
            String k=r.getKey();
            Float v=r.getValue();
            System.out.println(k+"   "+v);
        }
    }
}
