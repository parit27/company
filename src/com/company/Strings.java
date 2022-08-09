package com.company;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		
		System.out.println("-------Strings--------");
		System.out.println();
		
		System.out.println("-------String Sysout (println)--------");
//		System.out.println();
		String name = "parit";
		System.out.println("First Method String: "+name);
		
		String name1=new String("trivedi");
		System.out.println("Second Method String: "+name1);
		System.out.println();
		
		System.out.println("-------String Sysout (print)--------");
//		System.out.println();
		
		System.out.print("The Name is : ");
		System.out.println(name);
		System.out.println();
		
		System.out.println("-------String Sysout (printf)--------");
//		System.out.println();
		
		int a = 6;
		float b = 322.35f;
		System.out.printf("The value of a is %d and value of b is %f",a,b);
		System.out.println();
		
		char ch = 'a';
		String st = "STRING";
		System.out.printf("The value of CH is %c and value of ST is %s",ch,st);
		System.out.println();
		System.out.println();
		
		System.out.println("-------String Sysout (input)--------");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String 1 :");
		String st1 = sc.nextLine();
		System.out.print("Enter the String 2 :");
		String st2 = sc.next();
				
		System.out.println(st1);
		System.out.println(st2);
	
		
	
	
	}

	}
