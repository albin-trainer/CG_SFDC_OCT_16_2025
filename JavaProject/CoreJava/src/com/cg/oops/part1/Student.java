package com.cg.oops.part1;

public class Student {
    private int rollNo;
    private String studName;
    private float marks;
    private static String course;
    
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getStudName() {
        return studName;
    }
    public void setStudName(String studName) {
        this.studName = studName;
    }
    public float getMarks() {
        return marks;
    }
    public void setMarks(float marks) {
        this.marks = marks;
    }
    public static String getCourse() {
        return course;
    }
    public static void setCourse(String course) {
        Student.course = course;
    }
    
}
