package com.cg.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class CakeShop2 {
  private ArrayList<Cake> cakes= new ArrayList<>();
  public void addNewCake(Cake cake){
      //if the cake already present shud not add
      for(Cake c:cakes){
          if(c.getCakeName().equals(cake.getCakeName())){
              return;
          }
      }
      cakes.add(cake);
  }  
  public float getPrice(String cakeName){
      for(Cake c:cakes){
          if(c.getCakeName().equals(cakeName)){
              return c.getPrice();
          }
      }
      return 0.0f;
  }
  public ArrayList<Cake> getAllCakes(){
      return cakes;
  }
  public  ArrayList<Cake> searchCakePriceLessThan(float price){
      ArrayList<Cake> list=new ArrayList<>();
    for(Cake c:cakes){
        if(c.getPrice()<=price){
            list.add(c);
        }
    }
      return list;
  }
  public Cake searchCake(String  cakeName){
      //search in the list, if not found return null
      for(Cake c:cakes){
        if(c.getCakeName().equals(cakeName)){
            return c;
        }
    }
      return null;
  }  
  public void deleteCake(String  cakeName){
         //remove cake
         //for loop to remove gives ConcurrentModificationException
       Iterator<Cake> it=   cakes.iterator();  
       while(it.hasNext()){
           Cake c=it.next();
           if(c.getCakeName().equals(cakeName)){
               it.remove();
           }
       }
    }


}
