package com.vedait.assignments.stringHandling;


public class DuplicateWords {
	
	static void printDuplicates(String string) {
		String duplicates="";
		String[] strings=string.split(" ");
		for(int i=0;i<strings.length;i++) {
			for(int j=i+1;j<strings.length;j++) {
				if(strings[i].equals(strings[j])) {
					if(!(duplicates.contains(strings[i]))) {
						duplicates+=strings[i]+",";
					}
				}
			}
		}
		System.out.println(duplicates);
	}
	
	public static void main(String[] args) {
		
		String string="Artificial intelligence has rapidly transformed various sectors, from healthcare to finance, through automation and data analysis. Machine learning algorithms, a subset of AI, enable systems to learn from data without explicit programming, leading to breakthroughs in image recognition, natural language processing, and predictive modeling. However, ethical considerations, such as bias and job displacement, must be carefully addressed as AI continues to evolve.";
		printDuplicates(string);
		
	}
}
