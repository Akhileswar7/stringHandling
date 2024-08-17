package com.vedait.assignments.stringHandling;

import java.util.Scanner;

public class CountLetters {
	
	public static void count(String string) {
		
		char[] ch=string.toCharArray();
		int alphabets=0,numbers=0,spaces=0,others=0;
		for(int i=0;i<string.length();i++) {
			if(Character.isAlphabetic(ch[i])){
				alphabets++;
			} else if (Character.isDigit(ch[i])) {
				numbers++;
			} else if (Character.isSpaceChar(ch[i])) {
				spaces++;
			} else {
				others++;
			}
		}
		System.out.println("alphabets = "+alphabets);
		System.out.println("numbers = "+numbers);
		System.out.println("spaces = "+ spaces);
		System.out.println("others = "+others);
		
	}
	public static void main(String[] args) {
		
		String string;
		System.out.println("Enter String :");
		Scanner scanner =new Scanner(System.in);
		string=scanner.nextLine();
		count(string);
		scanner.close();
	}
}
