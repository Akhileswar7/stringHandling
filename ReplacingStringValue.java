package com.vedait.assignments.stringHandling;

public class ReplacingStringValue {
	
	static void replacingValue(String string) {
		int length=string.length();
		String string2="";
		if(length>3) {
			string2=string.substring(string.length() - 3);
			System.out.println(string2);
		} else {
			System.out.println("string Charecters are not suffecient");
		}
		System.out.println(string2+string+string2);
	}
	public static void main(String[] args) {
		String string="java";
		replacingValue(string);
	}
}
