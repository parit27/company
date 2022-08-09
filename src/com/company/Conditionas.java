package com.company;

import java.util.Scanner;

public class Conditionas {

	public static void main(String[] args) {

		System.out.println("-------Conditions--------");
		System.out.println();

		System.out.println("-------IF condition--------");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age:");
		int a = sc.nextInt();
		if (a >= 18) {
			System.out.println("You are Eligible for Vote");
		} else {
			System.out.println("Your are not Eligible for vote");
		}
		System.out.println();

		System.out.println("-------IF condition--------");
		System.out.println();

		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the age:");
		int b = sc1.nextInt();
		if (b >= 18) {
			System.out.println("You are authorised to drive");
		} else if (b >= 13 && b <= 16) {
			System.out.println("Your are a teen driver");
		} else {
			System.out.println("You are not authorised to drive");
		}
		System.out.println();

		System.out.println("-------Switch--------");
		System.out.println();

		Scanner sc2 = new Scanner(System.in);
		int count, choice, rate = 0;
		double stax, gtax, gross_total, net_total;
		System.out.println("+++++Menu Card+++++++");
		System.out.println();
		System.out.println("Sr       Dish           Rate");
		System.out.println("1. Palak Paneer          23");
		System.out.println("2. Muttor Paneer         26 ");
		System.out.println("3. Paneer Tikka Masalla  21");
		System.out.println("4. Daal Makhani          18 ");
		System.out.println("5. Jeera Rice            11 ");
		System.out.println("6. Roti                  02");
		System.out.print("Enter Your Choice: ");
		choice = sc2.nextInt();
		switch (choice) {
		case 1:
			rate = 23;
			System.out.println("Rate     :" + rate);
			break;

		case 2:
			rate = 26;
			System.out.println("Rate     :" + rate);
			break;

		case 3:
			rate = 21;
			System.out.println("Rate     :" + rate);
			break;

		case 4:
			rate = 18;
			System.out.println("Rate     :" + rate);
			break;

		case 5:
			rate = 11;
			System.out.println("Rate     :" + rate);
			break;

		case 6:
			rate = 2;
			System.out.println("Rate     :" + rate);
			break;

		default:
			System.out.println("Invalid Choice");
			break;
		}
		System.out.println("Thanks for the order");

		if (choice<=6) {
			System.out.print("Enter QTY :");
			count=sc2.nextInt();
			net_total = count*rate;
			System.out.println("Your Net Total is  :"+net_total);
			gtax = net_total*12/100;
			System.out.println("Gtax               :"+gtax);
			stax = net_total*10/100;
			System.out.println("Stax               :"+stax);
			gross_total=net_total+gtax+stax;
			System.out.println("Your Gross Amout is:"+gross_total);
		
		
		}
	}
}