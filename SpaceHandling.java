package com.vedait.assignments.stringHandling;

public class SpaceHandling {
	
	public static void main(String[] args) {
		
		int length;
		String string="       java programming           ";
		System.out.println(string);
		string=string.trim();
		length=string.length();
		if(length>10) {
			System.out.println(string);
		} else {
			System.out.println("String value is not sufficient");
		}
	}
}
