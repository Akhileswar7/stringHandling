package com.vedait.assignments.stringHandling;

public class StringBufferMethods {

	public static void main(String[] args) {
		
		StringBuffer string =new StringBuffer("hi");
			System.out.println(string.capacity());
			string.ensureCapacity(50);  
			System.out.println(string.capacity());
			string.append(" akhil");
			string.append("superfluous", 3, 5);
			string.delete(8,10);
			string.deleteCharAt(2);
			string.insert(2," " );
			System.out.println(string.isEmpty());
			System.out.println(string.length());
			string.setLength(20);
			System.out.println(string.capacity());
			string.trimToSize();
			System.out.println(string.capacity());
			System.out.println(string.length());
			String string2=string.toString();
			System.out.println(string2);
			
			
			StringBuilder stringBuilder=new StringBuilder("hello");
			System.out.println(stringBuilder);
			String string3=stringBuilder.toString();
			System.out.println(string3);
			
		}
}
