package com.vedait.assignments.stringHandling;

import java.util.Scanner;

public class CompareStringValue {
	
	public void compareString(String string) {
		System.out.println("Reverse of string :" );
		for(int i=string.length()-1;i>=0;i--) {
			System.out.println(string.charAt(i));
		}
		char[] ch;
		System.out.println("Using toCharArray()");
		ch=string.toCharArray();
		for(int i=string.length()-1;i>=0;i--) {
			System.out.println(ch[i]);
		}
	}
	public static void main(String[] args) {
		
		String string;
		System.out.println("Enter String :");
		Scanner scanner =new Scanner(System.in);
		string=scanner.nextLine();
		CompareStringValue compareStringValue= new CompareStringValue(); 
		compareStringValue.compareString(string);
		scanner.close();
		
	}
}
