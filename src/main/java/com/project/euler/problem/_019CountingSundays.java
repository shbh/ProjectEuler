package com.project.euler.problem; 
import org.apache.log4j.Logger;

import com.project.euler.IProblem;
import com.project.euler.feature.Functions;

/**
 * Created by shashi on 1/30/14.
 */
public class _019CountingSundays implements IProblem {
	
	static Logger logger = Logger.getLogger(_019CountingSundays.class);

	private final int before = 2001;

	public Integer solve() {

		/*
		 * 1 Jan 1900 was a Monday. Thirty days has September, April, June and
		 * November. All the rest have thirty-one, Saving February alone, Which
		 * has twenty-eight, rain or shine. And on leap years, twenty-nine. A
		 * leap year occurs on any year evenly divisible by 4, but not on a
		 * century unless it is divisible by 400.
		 */

		
		
		int carry = 0;
		
		int sunday = 0;
		// considering sunday as 0, 1 as monday, 2 as tuesday and so on..
		// for 1990
		int firstDay = 366 % 7;

		for (int i = 1901; i < before; i++) {
		
			int[] temp = Functions.NON_LEAP_YEAR;
		
			if (i % 4 == 0 && i % 400 > 0) {
		
				temp = Functions.A_LEAP_YEAR;
		
			}

			for (int m = 0; m < temp.length; m++) {
			
				if (m - 1 < 0) {
			
					firstDay = (carry + firstDay) % 7;

				} else if (m + 1 < temp.length) {
			
					firstDay = (temp[m - 1] + firstDay) % 7;
			
				} else {
				
					firstDay = (temp[m - 1] + firstDay) % 7;
			
					carry = temp[m];
			
				}

				if (firstDay % 7 == 0){
				
					sunday++;
				
				}
			}

		}
		
		return sunday;

	}


}
