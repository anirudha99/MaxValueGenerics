package com.maxvalue;

public class MaxMain {
	
	public static void main(String[] args) {
		Float a1 = 30.5f,b1 = 10.3f,c1 = 20.7f;
		TestMaximum test1 = new TestMaximum(a1,b1,c1);
		test1.maximum();
		
		Float a2 = 30.7f,b2 = 50.2f,c2 = 20.3f;
		TestMaximum test2 = new TestMaximum(a2,b2,c2);
		test2.maximum();
		
		Float a3 = 30.8f,b3 = 10.1f,c3 = 40.6f;
		TestMaximum test3 = new TestMaximum(a3,b3,c3);
		test3.maximum();
		
	}

}
