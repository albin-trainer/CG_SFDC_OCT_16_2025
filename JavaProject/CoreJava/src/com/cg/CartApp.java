package com.cg;
public class CartApp { 
       public static void main(String[] args) {
        Cart cart=new Cart();
        Product p1=new Product(1, "xxxx", 10,4.5f);
        cart.addProduct(p1);      
    }
}
