package com.cg.oops.part1;
public class InheritanceDemo {
   public static void main(String[] args) {
       //create both objects
       Mobile m1=
       new Mobile(101, "RealMe", 25000, "16GB","50MB");
       Apparal apparal1= new Apparal(102, "T Shirt", 999.99f, "XL","blue");
       Product myCart[]={m1,apparal1};
       for(Product p: myCart){
           p.display();
           System.out.println("----------------");
       }
   } 
}
