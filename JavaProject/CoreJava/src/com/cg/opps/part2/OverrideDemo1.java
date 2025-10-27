package com.cg.opps.part2;
public class OverrideDemo1 {
    public static void main(String[] args) {
        Base1 base1 =new Base1(); 
        base1.hello(); base1.helloAll();
        base1=new Derive1();
        base1.hello(); base1.helloAll();
    }
}
class Base1{
    static void helloAll(){
        System.out.println("Hello All from Base");
    }
    void hello(){
        System.out.println("Hello from Base`");
    }
}
class Derive1 extends Base1{
    static void helloAll(){ //Not overriding its Method Hiding 
        System.out.println("Hello All from Derive");
    }
    void hello(){ //overriding ....
        System.out.println("Hello from Derive`");
    }
}