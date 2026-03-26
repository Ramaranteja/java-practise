package com.java;

public class Employee {
	String Name;
	int salary;
	double PF;
	double Gst;
	double Allowances;
	double Netsalary;
	int Annual_Salary;
	double Annual_Netsalary;
	public static void main(String[ ] args) {
		Employee emp=new Employee();
		emp.Name="Ramcharan";
		emp.salary=50000;
		emp.PF=50000*0.03;
		emp.Gst=50000*0.07;
		emp.Allowances=50000*0.05;
		emp.Annual_Salary=50000*12;
		emp.Netsalary=(emp.salary-(emp.PF+emp.Gst))+emp.Allowances;
		emp.Annual_Netsalary=emp.Netsalary*12;
		System.out.println("Employee Details");
		System.out.println("Name:"+emp.Name);
		System.out.println("Salary:"+emp.salary);
		System.out.println("PF(3%):"+emp.PF);
		System.out.println("GST(7%):"+emp.Gst);
		System.out.println("Allowances(5%):"+emp.Allowances);
		System.out.println("Net Salary:"+emp.Netsalary);
        System.out.println("Annual Salay:"+emp.Annual_Salary);
        System.out.println("Annual Netsalary:"+emp.Annual_Netsalary);
		
		
		
		
	}

}
