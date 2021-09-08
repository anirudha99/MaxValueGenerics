package com.maxvalue;

//class with generic
public class TestMaximum <T extends Comparable<T>> {
	
	private T a,b,c,d;
	
	//constructor with generic
	TestMaximum(T a, T b, T c){
		this.a = a;
		this.b = b;
		this.c= c;
	}
	
	TestMaximum(T a, T b, T c, T d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public static <T extends Comparable<T>> T findMaximum(T ...values) {
//		T max = a;
//		if(b.compareTo(max) > 0) {
//			max = b;
//		}
//		if(c.compareTo(max) > 0) {
//			max = c;
//		}
//		return max;
		
		T max = values[0];
	    for (T element : values) {
	        if (element.compareTo(max) > 0) {
	            max = element;
	        }
	    }
	    return max;
	}
	
	

}
