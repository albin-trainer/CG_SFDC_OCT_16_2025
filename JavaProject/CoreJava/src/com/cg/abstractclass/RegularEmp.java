package com.cg.abstractclass;
public class RegularEmp  extends Employee{
private float basicSal;
private float hra;
private float pf;
    void calculateSalary() {
        float sal=basicSal+hra+pf;
        setSalary(sal);
    }
    public float getBasicSal() {
        return basicSal;
    }
    public void setBasicSal(float basicSal) {
        this.basicSal = basicSal;
    }
    public float getHra() {
        return hra;
    }
    public void setHra(float hra) {
        this.hra = hra;
    }
    public float getPf() {
        return pf;
    }
    public void setPf(float pf) {
        this.pf = pf;
    }
    
}
