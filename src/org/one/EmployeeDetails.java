package org.one;

public class EmployeeDetails extends CompanyDetails {  // Class
	// child class
	public void empName() {  //Method
		System.out.println("Empname : XXXXXXx");
	}
	public static void main(String[] args) {
		EmployeeDetails n = new EmployeeDetails();
		n.companyArea();
		n.empName();
	}
	
}
