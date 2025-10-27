package com.cg.oops.part1;
public class StaticDemo {
  public static void main(String[] args) {
      Student.setCourse("Java");
      Student s1= new Student();
      s1.setRollNo(101);
      s1.setStudName("Sindhu");
      s1.setMarks(99.99f);

      Student s2=new Student();
      s2.setRollNo(102);
      s2.setStudName("Aishwarya");
      s2.setMarks(100);

      System.out.println(s1.getStudName()+" undergoing "+s1.getCourse());
      System.out.println(s2.getStudName()+" undergoing "+s2.getCourse());
      s1.setCourse("Javascript");
      System.out.println(s2.getStudName()+" undergoing "+s2.getCourse());



  }  
}
