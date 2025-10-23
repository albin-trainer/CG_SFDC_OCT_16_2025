package com.cg;

public class ConstructorDemo {
    public static void main(String[] args) {
        new Employee();
        new Student("Raj");
    }
}
class Employee{
    Employee(){
        System.out.println("Emp constructor...");
    }
}
class Student{
    Student(String name){
        System.out.println("Student constructor "+name);
    }
}
