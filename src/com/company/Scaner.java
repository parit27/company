package com.company;

import java.util.Scanner;

public class Scaner {

	public static void main(String[] args) {
		System.out.println("------------Scanner----------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 = ");
		int a =sc.nextInt();
		System.out.print("Enter Number 2 = ");
		int b =sc.nextInt();		
		System.out.print("Enter Number 3 = ");
		int c =sc.nextInt();		
		int d = a+b+c;
		System.out.println("Sum of these numbers:"+d);
 			
	}

}
