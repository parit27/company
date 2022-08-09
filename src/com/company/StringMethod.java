package com.company;

import java.util.Scanner;

import com.sun.jdi.Value;

public class StringMethod {

	public static void main(String[] args) {
		System.out.println("-------String Methods--------");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you String :");
		String name = sc.nextLine();
		System.out.println();
		System.out.println("--Result--");
		System.out.println(name);

		System.out.println("Lenght of the String is :" + name.length());

		System.out.println("Convert the String to UpperCase: " + name.toUpperCase());

		System.out.println("Convert the String to LowerCase: " + name.toLowerCase());

		System.out.println("Convert the String to Trimmed: " + name.trim());

		System.out.println("Indexing the Sub String :" + name.substring(3));

		System.out.println("Indexing the Sub String :" + name.substring(3, 5));

		System.out.println("Indexing the Replace Char String :" + name.replace('i', 'p'));

		System.out.println("Indexing the Replace String :" + name.replace("ri","ti"));
	
		System.out.println("Indexing the String startWith :" + name.startsWith("it"));
		
		System.out.println("Indexing the String startWith :" + name.endsWith("di"));
		
		System.out.println("Indexing the char At Strings :" + name.charAt(3));
		
		System.out.println("Indexing the indexOf Strings :" + name.indexOf('i'));
		
		System.out.println("Indexing the indexOf Strings :" + name.indexOf(2,'i'));
		
		System.out.println("Indexing the LastindexOf Strings :" + name.lastIndexOf("it"));
		
		System.out.println("Indexing the equals Strings :" + name.equals("parit"));
		
		System.out.println("Indexing the equals ignore case Strings :" + name.equalsIgnoreCase("parit"));
		
		System.out.println("Indexing the equals ignore case Strings :" + name.equalsIgnoreCase("parit"));
		
		System.out.println("Indexing the equals \t ignore case Strings :");
		
		System.out.println("Indexing the equals \n ignore case Strings :");
		
		System.out.println("Indexing the equals \' ignore case Strings :");
		
		System.out.println("Indexing the equals \\ ignore case Strings :");
		
		
		
	}
	

}
