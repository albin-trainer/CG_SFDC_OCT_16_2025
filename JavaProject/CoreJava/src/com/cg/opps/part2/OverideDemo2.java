package com.cg.opps.part2;
public class OverideDemo2 {
    public static void main(String[] args) {
        new Child();
    }
}
class Parent{
    Parent(){
        makeFun();
    }
   private void makeFun(){
        System.out.println("Parent is making fun");
    }
}
class Child extends Parent{
 void makeFun(){
        System.out.println("Child is making fun");
    }
}