package com.cg.abstractclass;
public class ContractEmp extends Employee{
private int noOfWorkingDays;
private float perDayCharges;
    void calculateSalary() {
        float sal=noOfWorkingDays*perDayCharges;
        setSalary(sal);
    }
    public int getNoOfWorkingDays() {
        return noOfWorkingDays;
    }
    public void setNoOfWorkingDays(int noOfWorkingDays) {
        this.noOfWorkingDays = noOfWorkingDays;
    }
    public float getPerDayCharges() {
        return perDayCharges;
    }
    public void setPerDayCharges(float perDayCharges) {
        this.perDayCharges = perDayCharges;
    } 
    
    
}
