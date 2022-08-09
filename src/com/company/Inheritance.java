package com.company;


class Base {
	int x;
	
	public int getX() {
//		System.out.println("I am Getting X now");
		return x;
	}

	public void setX(int x) {
		System.out.println("I am in Base and Setting X now");
		this.x = x;
	}

	public void printMe() {
		System.out.println("I am a Constructor");
	}
	
	
	 class Derived extends Base {
		int y;

		public int getY() {
//			System.out.println("I am Getting Y now");
			return y;
		}

		public void setY(int y) {
//			System.out.println("I am Setting Y now");
			this.y = y;
		}

	}

}

public class Inheritance {

	public static void main(String[] args) {

		Base b = new Base();
		b.setX(56);
		System.out.println(b.getX());
	
	 		
	}
}
