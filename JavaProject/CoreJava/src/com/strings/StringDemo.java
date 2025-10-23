package com.strings;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringDemo {
    public static void main(String[] args) {
        String msg ="Good Morning Hv a nice Day!!!";
        System.out.println(msg.charAt(0)); //to find the char based on index
        System.out.println(msg.indexOf('G'));//to find index based on char
        char arr[]=  msg.toCharArray(); //to convert into array
        System.out.println(arr[5]);
        String msgs[]=msg.split(" "); //
        System.out.println(msgs[0]);
        char charArr[]={'C','A','P','G','E','M','I','N','I'};
        String company=new String(charArr);
        System.out.println(company);
       String s=   reverse(msg); //shud returns "Morning Good"
       System.out.println(s);
    }
    static String reverse(String s){    //without using builtin functions try .....
       String newString[]= s.split(" "); 
    //    for(String str:newString){
    //        System.out.println(str);
    //    }
       String reverseString="";
       for(int i=newString.length-1;i>=0;i--){
           reverseString=reverseString+newString[i]+" ";
       }
        return reverseString.trim(); //trim() removes spaces in L and R of the string
    }
}
