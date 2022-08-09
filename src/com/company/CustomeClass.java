package com.company;
class employee1{
	int salary;
	String name;
	
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
		
	}
	public void setName(String n) {
		name=n;
	}
}

class Employee {
	int id;
	String name;
	int salary;

	public void printDetails() {
		System.out.println("My id is :" + id);
		System.out.println("My name is :" + name);
		System.out.println("My Saleary is :" + salary);
	}

	public int getSalary() {
		
		return salary;
	}
}

public class CustomeClass {

	public static void main(String[] args) {

		System.out.println("This is our Custome Class");
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		emp1.id = 6711;
		emp1.name = "Akhilesh";
		emp1.salary = 34000;
		
		emp.id = 9711;
		emp.name = "PARIT";
		emp.salary = 46000;
//		System.out.println(emp.id);
//		System.out.println(emp.name);
//		emp.printDetails();
//		emp1.printDetails();
	
		int salary = emp1.getSalary();
		System.out.println(salary);
		System.out.println(emp1.getSalary());
		
	}




}
