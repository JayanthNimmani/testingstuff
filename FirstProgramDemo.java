

import java.io.*;

public class FirstProgramDemo {
	
	//Instance Variables
	String name;
	int age;
	String city;
	long mobilenumber;
	long aadharnumber;
	float value;
	double value1;
	char gender;
	
	static String Country; //static variable
	
	public void SavingsAccount() {
		
		int a = 10;
		System.out.println(a);//local variable 
		System.out.println("Welcome to Savings Account");
	}
	public void CurrentAccount() {
		System.out.println("Welcome to Current Account");
	}

	public static void main(String[] args) {
	
		FirstProgramDemo customer1 = new FirstProgramDemo();
		System.out.println(customer1.aadharnumber = 1325456);
		System.out.println(customer1.age= 27);
		System.out.println(customer1.gender = 'M');
		System.out.println(customer1.city= "Mumbai");
		System.out.println(customer1.name= "Raghu");
		System.out.println(customer1.value= 99.6595626f);
		System.out.println(customer1.value1= 969.5959595888848484);
		System.out.println(customer1.mobilenumber= 284465683);
		customer1.SavingsAccount();
		
		System.out.println("************************");
		
		FirstProgramDemo customer2 = new FirstProgramDemo();
		System.out.println(customer2.aadharnumber = 51325456);
		System.out.println(customer2.age= 22);
		System.out.println(customer2.city= "Panaji");
		System.out.println(customer2.name= "Rajesh");
		System.out.println(customer2.mobilenumber= 728446568);
		customer2.CurrentAccount();
		
		
	}

}
