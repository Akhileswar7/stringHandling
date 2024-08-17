package com.vedait.assignments.stringHandling;

public class CharCount {
	
	public static void main(String[] args) {
		  
		        String str = "Hi Hello";
		        char[] charArray = str.toCharArray();
		        for (int i = 0; i < charArray.length; i++) {
		            int count = 1;
		            if (charArray[i] == ' ') {
		                continue;
		            }
		            for (int j = i + 1; j < charArray.length; j++) {
		                if (charArray[j] == charArray[i]) {
		                    count++;
		                    charArray[j] = ' ';
		                }
		            }
		            System.out.println(charArray[i] + " - " + count + " times");
		        }
		    }
		}
