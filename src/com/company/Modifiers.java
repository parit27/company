package com.company;

class MyEmployee {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Modifiers {

	public static void main(String[] args) {

		MyEmployee emp = new MyEmployee();
		emp.setName("parit");
		System.out.println(emp.getName());
		emp.setId(45);
		System.out.println(emp.getId());

	}
}
