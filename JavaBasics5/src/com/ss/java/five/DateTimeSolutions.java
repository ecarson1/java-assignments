package com.ss.java.five;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;

public class DateTimeSolutions {
	
	/*
	 * Solutions to Conceptual Questions
	 * 1. LocalDateTime
	 * 
	 * 2. (Given some LocalDate stored in variable date)
	 * LocalDate prevThursday = date.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
	 * 
	 * 3. ZoneOffset only keeps track of the time-zone offset from Greenwich/UTC to the current zone.
	 * ZoneId is used to identify the rules that calculate the offsets for a particular zone.
	 * For example, a ZoneId instance for Paris with reference two ZoneOffset instances since there is
	 * a +1:00 offset for winter but a +2:00 offset for summer.
	 * 
	 * 4. Instant -> ZonedDateTime
	 * Instant instant = Instant.now();
	 * ZonedDateTime zonedDT = instant.atZone(ZoneID.of("US/Eastern")); (for my time zone)
	 * ZonedDateTime -> Instant
	 * ZonedDateTime zonedDT = ZonedDateTime.now();
	 * Instant instant = zonedDT.toInstant();
	 */
	public static void getDaysInMonths(int year) {
		for (Month month : Month.values()) {
            YearMonth ym = YearMonth.of(year, month);
            System.out.println(month + " has " + ym.lengthOfMonth() + " days");
        }
	}
	
	public static void getMondays(String monthStr) {
			Month month = Month.valueOf(monthStr.toUpperCase());
			LocalDate date = Year.now().atMonth(month).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
	        Month mi = date.getMonth();
	        while (mi == month) {
	            System.out.println(date);
	            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
	            mi = date.getMonth();
	        }
	}
	
	
	public static boolean isFriday13(LocalDate date) {
		if(date == null) {
			return false;
		}
		return (date.getDayOfWeek().getValue() == 5) && (date.getDayOfMonth() == 13);
	}
	
	

}
