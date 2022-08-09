package com.company;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		System.out.println("------------Loops----------");
		System.out.println();

		System.out.println("------------while Loops----------");
		System.out.println();

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;

		}
			System.out.println("While Loop is Finished");
			System.out.println();
			
			
		System.out.println("------------Loops----------");
		System.out.println();

		int sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:");
		sum = sc.nextInt();
		i=1;
		while(i<=10) {
//			System.out.println("Table of Number:"+sc);
			System.out.println(sum+"*"+i+"="+sum*i);
			i++;
		}
	
	
	}

}
