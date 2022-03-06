package com.arithmatic;

public class PaySlip {
    int empNum;
    String empName;
    double basicSal;
    double overTime;

    public PaySlip(int empNum, String empName){
        this.empNum = empNum;
        this.empName = empName;
    }
    void setBasicSal(double basicSal){
        System.out.println(basicSal);
    }
    void setOverTime(double overTime){
        System.out.println(overTime);
    }
    int getEmpNum(){
        return empNum;
    }
    String getEmpName(){
        return empName;
    }
    double getBasicSal(){
        return basicSal;
    }
    double getOverTime(){
        return overTime;
    }
    void findNetSalary(){
        double NetSalary = (basicSal+ overTime);
        System.out.println(empName+ " -----> Net Salary : "+NetSalary);
    }

}
