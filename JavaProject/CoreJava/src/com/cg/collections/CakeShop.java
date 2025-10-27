package com.cg.collections;
import java.util.ArrayList;
public class CakeShop {
 private ArrayList<String> cakes= new ArrayList<>();
    public void addNewCake(String cake){
           cakes.add(cake);  
        }
    public void addNewCakeInBegining(String cake){
    
     cakes.add(0, cake);
    }
    public void modifyCake(String cakeName, int position){
        cakes.set(position, cakeName);
        }
    public ArrayList<String> getAllCakes(){
        return cakes;
    }
    public void removeCake(String cake){
        cakes.remove(cake)
    }
    public boolean isCakeAvailable(String cake){
        return cakes.contains(cake);
    }

}
