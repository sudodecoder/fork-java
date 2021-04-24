package com.dcs.edu;

public class EmpTest {
	 public static void main(String []args){
		 EmployeDetails e1 = new EmployeDetails(1,"Shravan",2020,12000);
		 EmployeDetails  e2 = new EmployeDetails (2,"Sathwika",2021,30000);
		 EmployeDetails  e3 = new EmployeDetails (3,"Yashu",2020,40000);
		 System.out.println("Employee Id\tEmployee Name\tEmployee Age\tEmployee Salary");
         e1.displayEmployee();
         e2.displayEmployee();
         e3.displayEmployee();
     }
}