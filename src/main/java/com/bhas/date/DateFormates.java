package com.bhas.date;

import java.util.Date;

public class DateFormates {

	public static void main(String[] args) {
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date);
		System.out.println(date.getYear());
		System.out.println(DateFormates.class.getCanonicalName().trim().endsWith("d"));
	}
}
