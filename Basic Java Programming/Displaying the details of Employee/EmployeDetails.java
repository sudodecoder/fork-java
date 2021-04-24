package com.dcs.edu;

public class EmployeDetails {
        int id;
        String name;
        int age;
        int salary;


public EmployeDetails(int id, String name , int age, int salary) {
	
    this.id = id;
    this.name = name;
    this.age = age;
    this.salary = salary;
}


void displayEmployee(){
    System.out.println (  id+"  \t   \t   "+name+"\t\t "+age+"\t \t "+salary);
  
}
}

