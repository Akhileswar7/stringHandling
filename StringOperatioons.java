package com.vedait.assignments.stringHandling;

import java.util.Scanner;

public class StringOperatioons {
	
	public static void main(String[] args) {
		
		String string;
		System.out.println("Enter String :");
		Scanner scanner =new Scanner(System.in);
		string=scanner.nextLine();
		System.out.println("Charecters present in the string: ");
		for(int i=0;i<string.length();i++) {
			System.out.println(string.charAt(i));
		}
		System.out.println("UpperCase of "+string+" = "+string.toUpperCase());
		System.out.println("LowerCase of "+string+" = "+string.toLowerCase());
		scanner.close();	
	}
}
