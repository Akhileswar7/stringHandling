package com.vedait.assignments.stringHandling;

public class ArraysToString {
	
	static void compareString(String string) {
		if(string.equals("hello")){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	static void reverseString(String string) {
		for(int i=string.length()-1;i>=0;i--) {
			System.out.println(string.charAt(i));
		}
	}
	public static void main(String[] args) {
		
		char[] ch= {'j','a','v','a'};
		String string=new String(ch);
		if(string.length()>10) {
			compareString(string);
		} else {
			reverseString(string);
		}
	}
}
