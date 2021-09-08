package com.maxvalue;

//class with generic
public class TestMaximum <T extends Comparable<T>> {
	
	private T a,b,c;
	
	//constructor with generic
	TestMaximum(T a, T b, T c){
		this.a = a;
		this.b = b;
		this.c= c;
	}
	
	/**
	 * @method to get maximum
	 */
	public void maximum() {
		T res=TestMaximum.findMaximum(a,b,c);
		System.out.println("Maximum of "+a+", "+b+" and "+c+" is: " +res);
	}
	
	/**
	 * @param <T>
	 * @param a
	 * @param b
	 * @param c
	 * @return max element
	 */
	public static <T extends Comparable<T>> T findMaximum(T a, T b, T c) {
		T max = a;
		if(b.compareTo(max) > 0) {
			max = b;
		}
		if(c.compareTo(max) > 0) {
			max = c;
		}
		return max;
	}

}
