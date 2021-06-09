package com.model;

public class Manager extends Employee{
    private String department;
    public Manager()
    {
        super();
    }
    public Manager(String EmployeeName,double EmployeeSalary,String department){
        super(EmployeeSalary,EmployeeName);
        this.department=department;
    }
    public String getdepartment(){
        return department;
    }
    public void setdepartment(String department){
        this.department=department;
    }
    public String getDetails(){
        return super.getDetails()+"Department: "+getdepartment();
    }

}