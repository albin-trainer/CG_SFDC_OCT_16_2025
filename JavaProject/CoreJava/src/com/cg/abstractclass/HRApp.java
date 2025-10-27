package com.cg.abstractclass;
public class HRApp {    public static void main(String[] args) {
       RegularEmp emp1=new RegularEmp();
       emp1.setEmpId(1);
       emp1.setEmpName("Vanshita"); 
       emp1.setBasicSal(100000);
       emp1.setHra(10000);
       emp1.setPf(15000);

       ContractEmp emp2= new ContractEmp();
       emp2.setEmpId(2);
       emp2.setEmpName("Somya");
       emp2.setPerDayCharges(15000);
       emp2.setNoOfWorkingDays(20);

       processSalary(emp1);
       System.out.println("------------");
       processSalary(emp2);

    }
    static void processSalary(Employee e){
        e.calculateSalary();;
        System.out.println("Salary for "
        +e.getEmpName()+" is "+e.getSalary());
    }
}
