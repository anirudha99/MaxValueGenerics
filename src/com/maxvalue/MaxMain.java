package com.maxvalue;

public class MaxMain {
	
	public static void main(String[] args) {
		
		//String
		String a1 = "Apple",b1 = "Peach",c1 = "Banana";
		TestMaximum <String> test1 = new TestMaximum(a1,b1,c1);
		test1.findMaximum(a1,b1,c1);
//		System.out.println(test1.findMaximum(a1,b1,c1));
		
		//Integer
		Integer a2 = 30,b2 = 50,c2 = 40;
		TestMaximum <Integer> test2 = new TestMaximum(a2,b2,c2);
		test2.findMaximum(a2,b2,c2);
//		System.out.println(test2.findMaximum(a2,b2,c2));
		
		//Float
		Float a3 = 10.5f,b3 = 12.7f,c3 = 17.7f;
		TestMaximum <Float> test3 = new TestMaximum(a3,b3,c3);
		test3.findMaximum(a3,b3,c3);
//		System.out.println(test3.findMaximum(a3,b3,c3));
		
		Integer a4 = 25, b4 = 40, c4 = 65, d4 = 75;
		TestMaximum <Integer> test4 = new TestMaximum(a4,b4,c4,d4);
		test4.findMaximum(a4,b4,c4,d4);
//		System.out.println(test4.findMaximum(a4,b4,c4,d4));
		
	}

}
