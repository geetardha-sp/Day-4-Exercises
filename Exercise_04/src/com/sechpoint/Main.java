package com.sechpoint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String dateString= formatter.format(date);
		System.out.println("Today's Date: " + dateString + "\n");
		
		formatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
		dateString = formatter.format(date);
	    System.out.println("E, y-M-d 'at' h:m:s a z == " + dateString);
	    
		formatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		dateString = formatter.format(date);
	    System.out.println("E yyyy.MM.dd 'at' hh:mm:ss a zzz == " + dateString);
	    
	    formatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
		dateString = formatter.format(date);
	    System.out.println("EEEE, MMMM d, yyyy == " + dateString);
	}
}
