package com.company;

class MyMainEmployee{
	private int id;
	private String name;

	public MyMainEmployee() {
		id=9711 ;
		name = "Parit";
	}
	
	public MyMainEmployee(String myName,int myId) {
		id=myId ;
		name = myName;
}

	public MyMainEmployee(String myName) {
//		id=myId ;
		name = myName;

}
	public MyMainEmployee(int myId) {
		id=myId ;
//		name = myName;

}

	
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

public class Constructor {
	
	public static void main(String[] args) {
	
		MyMainEmployee emp1= new MyMainEmployee();
//		emp1.setName("Akhilesh");
//		emp1.setId(6711);
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		
	
	}
}
