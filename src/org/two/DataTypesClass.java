package org.two;

public class DataTypesClass {
	
	
	private void type() {
		
		boolean accept = false;  // boolean - true ,false
		System.out.println(accept);
		
		char letter = '4';  // Upper(A)lower-(d)number(2)-Spl(#$ )single char
		System.out.println(letter);
		
		//byte short int long - interger(37890)
		
		byte age = 12/5;
		System.out.println(age);
		
		short id = 32748;
		System.out.println(id);
		
		int salary = 987654310;// 10digits  
		System.out.println(salary);
		
		long phn = 9876543210l;     // 20digit
		System.out.println(phn);
		
		float pi = 3.234567864345679876543f;
		System.out.println(pi);
		
		double pii = 3.34567898654345678d;
		System.out.println(pii);
		
		String name = "GreensQWERT@#$%xcvb    3456";
		System.out.println(name);
	}
	public static void main(String[] args) {
	
		DataTypesClass cls = new DataTypesClass();
		cls.type();
	}
}
