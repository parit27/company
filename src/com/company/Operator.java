package com.company;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {

		
		System.out.println("-------Operators--------");
		System.out.println();
		
		System.out.println("-----Arithmatic Operator----");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Numner 1 :");
		int a=sc.nextInt();
		System.out.print("Enter Numner 2 :");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Sum of Number :"+c);
		int d=a-b;
		System.out.println("Sub of Number :"+d);
		int e=a*b;
		System.out.println("Mul of Number :"+e);
		int f=a/b;
		System.out.println("Div of Number :"+f);
		int g=a%b;
		System.out.println("% of Number :"+g);
		int h=c*d+e/f;
		System.out.println(h);
		
		
		System.out.println("-------Incremental Operator--------");
		System.out.println();
		int i = 56;
		char ch = 'k';
		
		System.out.println(i);
		System.out.println(i++);
		System.out.println(+i);
		System.out.println(++ch);
		
		
		System.out.println("-------decremental Operator--------");
		System.out.println();
		int j = 56;
		char ch1 = 'k';
		System.out.println(j);
		System.out.println(j--);
		System.out.println(--j);
		System.out.println(--ch1);
		
		System.out.println("-------Comparison Operator--------");
		System.out.println();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the age:");
		int p = sc1.nextInt();
		if (p >=18) {
			System.out.println("You are Eligible for Vote");
		} else {
			System.out.println("Your are not Eligible for vote");
		}
		
		System.out.println();
		
		
		System.out.println("-------Logical Operator--------");
		System.out.println();
		
		
		
		System.out.println("----&&-----");
		boolean o = true;
		boolean q = true;
		boolean w = false;
		
		if (o && q && w)
		{
			System.out.println("Executed if statement Y");	
		}
		else {
			System.out.println("Executed else statement N");
		}
		System.out.println();
		
		System.out.println("----||-----");
		boolean u = true;
		boolean t = true;
		boolean s = false;
		
		if (u || t || s)
		{
			System.out.println("Executed if statement Y");	
		}
		else {
			System.out.println("Executed else statement N");
		}
		
		
	}

}
