package com.vedait.assignments.stringHandling;

public class CheckContent {
	
	public static void main(String[] args) {
		
		String string="java";
		String string2="java";
		System.out.println(string==string2);
		System.out.println(string.compareTo(string2));
		System.out.println(string.contentEquals(string2));
		System.out.println(string.equals(string2));
		System.out.println(string.contentEquals(string2)?"Content matched":"Content not matched");
		
	}
}
