package org.two;
//import org.one.CompanyDetails;
//import org.one.EmployeeDetails;
import org.one.*;
public class ClientDetails extends CompanyDetails {
	// childClass
	private void clientName() {
		System.out.println("ClientName : Vadapalani");
	}
	
	public static void main(String[] args) {
		
		ClientDetails details1 = new ClientDetails();
		details1.clientName();
		details1.companyArea();
		
	
		
	}
} // hierarchical inheritance
