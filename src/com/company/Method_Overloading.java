package com.company;

public class Method_Overloading {

	static void change1() {
		System.out.println("This is the Change 1 Method");
	}
	
	static void change1(int a) {
		System.out.println("This is the Change2 Method");
	}
	
	static void change1(char A) {
		System.out.println("This is the Change3 Method");
	}
	
	static void change1(int x, int y) {
		System.out.println("This is the Change4 Method");
		System.out.println("This is the Change4 Method");
	}
	static void change(int a) {
		a = 34;
	}

	static void change2(int[] arr) {
		arr[0] = 98;
	}

	static void Method() {

		System.out.println("This is the Method");
	}

	public static void main(String[] args) {

//		Method();
//		int x=45;
//		change(x);
//		System.out.println("The value of x after Running Change is:"+x);
//		int[] marks = { 52, 56, 78, 87, 93, 69 };
//		change2(marks);
//		System.out.println("This value of marks after Running Change 2 is:" + marks[0]);

		change1(3);
//		System.out.println(chang1);
	
	}

}
