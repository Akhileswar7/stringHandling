package com.vedait.assignments.stringHandling;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrinting {
	
	static void printDate() {
		Date date= new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/mm/dd");

        String formattedDate = formatter.format(date);
        System.out.println(formattedDate);

	}
	
	public static void main(String[] args) {
		
		printDate();
	}
}
