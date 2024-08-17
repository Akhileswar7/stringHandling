package com.vedait.assignments.stringHandling;


public class StringCapitalise {
	
	static void capitalise(String string) {
		String[] strings=string.split(" ");
		for(int i=0;i<strings.length;i++) {
			strings[i]=Character.toUpperCase(strings[i].charAt(0))+strings[i].substring(1);
		}
		string=String.join(" ",strings);
		System.out.println(string);
	}
	
	public static void main(String[] args) {
		
		String string="Welcome to java programming";
		capitalise(string);
	}
}
