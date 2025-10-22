package com.cg;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int nums[]=new int[5];
        nums[0]=10;
        nums[1]=20;
        nums[2]=30;
        System.out.println("****Traditional For loop ****");
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println("--------------------");
        for(int val:nums){
            System.out.println(val);
        }
        int arr[]={1,2,3,4,5};
        //iterate and print ...
        //create a String (S is capital) array and store some names and iterate it
    }
}
