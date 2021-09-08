package com.maxvalue;

public class MaxMain {
	
	public static void main(String[] args) {
		Integer a1 = 30,b1 = 10,c1 = 20;
		TestMaximum test1 = new TestMaximum(a1,b1,c1);
		test1.maximum();
		
		Integer a2 = 30,b2 = 50,c2 = 20;
		TestMaximum test2 = new TestMaximum(a2,b2,c2);
		test2.maximum();
		
		Integer a3 = 30,b3 = 10,c3 = 40;
		TestMaximum test3 = new TestMaximum(a3,b3,c3);
		test3.maximum();
		
	}

}
