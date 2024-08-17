package com.vedait.assignments.stringHandling;

public class SubString {
	
	public static void main(String[] args) {
		
		String string="Welcome to java programming language-core java and Advanced java-object oriented programming language-platform independent programming language.";
		String string2="";
		String string3="";
		if(string.length()>10) {
			for(int i=2;i<=15;i++) {
				string2+=string.charAt(i);
			}
		}
		string3=string.substring(2,16);
		System.out.println(string2);
		System.out.println(string3);
		System.out.println(Character.toUpperCase(string3.charAt(0))+string3.substring(1));
	}
}
