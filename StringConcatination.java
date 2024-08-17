package com.vedait.assignments.stringHandling;

public class StringConcatination {
	
	public static void main(String[] args) {
		
		String string1="java ";
		String string2="programming ";
//		String s;
		
		System.out.println(string1+string2+(string1.length()>string2.length()?string1:""));
		System.out.println(string2+string1+(string1.length()<string2.length()?string2:""));
		
//		if(string1.length()>string2.length()) {
//			s=string1+string2+string1;
//		} else {
//			s=string2+string1+string2;
//		}
//		System.out.println(s);
	}
}