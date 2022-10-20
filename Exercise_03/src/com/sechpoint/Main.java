package com.sechpoint;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar(2022, 06, 01);
		
		System.out.println(calendar.get(Calendar.ERA));
		System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
	}
}
