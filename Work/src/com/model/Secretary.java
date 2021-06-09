package com.model;

public class Secretary extends Employee{

    private String project1;
    public Secretary()
    {

        super();
    }
    public Secretary(String EmployeeName,double EmployeeSalary,String project1){
        super(EmployeeSalary,EmployeeName);
        this.project1 =project1;
    }
    public String getproject1(){

        return project1;
    }
    public void setproject1(String project1){

        this.project1=project1;
    }
    public String getDetails(){

        return super.getDetails()+"project1: "+getproject1();
    }
}
