package com.cg;

public class ShoppingApp {
    public static void main(String[] args) {
        int x=10; //local variable
        Customer c1= new Customer();
        //new keyword to allocate memory
        c1.setCustId(101);
        c1.setCustName("Albin");
        c1.setAddress("Bangalore");
        System.out.println("id is "+c1.getCustId());
        System.out.println("name is "+c1.getCustName());
        System.out.println("address is "+c1.getAddress());
        updateAddress(c1);
        System.out.println("address is "+c1.getAddress());
    }
    static void updateAddress(Customer c){
        c.setAddress("Bengaluru");
    }
}
