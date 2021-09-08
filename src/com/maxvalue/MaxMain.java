package com.maxvalue;

public class MaxMain {
	
	public static void main(String[] args) {
		String a1 = "Apple",b1 = "Peach",c1 = "Banana";
		TestMaximum test1 = new TestMaximum(a1,b1,c1);
		test1.maximum();
		
		String a2 = "One",b2 = "Two",c2 = "Three";
		TestMaximum test2 = new TestMaximum(a2,b2,c2);
		test2.maximum();
		
		String a3 = "Red",b3 = "Blue",c3 = "Green";
		TestMaximum test3 = new TestMaximum(a3,b3,c3);
		test3.maximum();
		
	}

}
