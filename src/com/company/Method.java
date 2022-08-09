package com.company;

public class Method {

	static int logic(int a, int b) {

		int c;
		if (a >= b) {
			c = a * b;
		} else {
			c = (a + b) * 5;
		}

		return c;
	}

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int z;
		z = logic(x, y);

		int x1 = 7;
		int y1 = 2;
		int z1;
		z1 = logic(x1, y1);

		System.out.println(z);
		System.out.println(z1);
	}

}
