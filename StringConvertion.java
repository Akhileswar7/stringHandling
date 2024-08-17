package com.vedait.assignments.stringHandling;

public class StringConvertion {
	
	public void convertion(String string) {
		String[] strings=string.split("-");
		String tabString="\t";
		for(int i=0;i<strings.length;i++) {
			System.out.println(tabString.repeat(i)+strings[i]);
		}
//		for(String s:strings) {
//			System.out.println(s);
//		}
		
	}
	public static void main(String[] args) {
		String string="Welcome to java programming language-core java and Advanced java-object oriented programming language-platform independent programming language.";
		StringConvertion stringConvertion=new StringConvertion();
		stringConvertion.convertion(string);
	}
}
