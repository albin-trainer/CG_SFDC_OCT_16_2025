package com.cg.opps.part2;

public class SuperDemo1 {
    public static void main(String[] args) {
        new Derive();
    }
}
class Base{
    Base(){
        System.out.println("Base");
    }
}
class Derive extends Base{
    Derive(){
        System.out.println("Derive");
    }
}