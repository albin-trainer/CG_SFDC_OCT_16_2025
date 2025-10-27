package com.cg.interfaces;

import java.security.AllPermission;

public class InterfaceDemo {   public static void main(String[] args) {
        driving(new BMW()); 
        System.out.println("-------------");
        driving(new Alto());
    }
    static void driving(Drive d){
        d.gear();
    }
}
interface Drive{
    void gear(); // public abstract void gear();
}
class BMW implements Drive{
    public void gear() {
      System.out.println("BMW gear program start working");
    }   
}
class Alto implements Drive{
    public void gear() {  
        System.out.println("Alto Gear start working");
    }    
}
