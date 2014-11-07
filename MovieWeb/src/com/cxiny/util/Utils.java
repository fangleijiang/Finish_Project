/**
 * 
 */
package com.cxiny.util;

import java.util.Calendar;
import java.util.Date;

/**
 * @author cxiny
 *
 */
public class Utils {
	public static int getAge(Date birthday){
		int age = 0;
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		calendar.setTime(birthday);
		int birthYear = calendar.get(Calendar.YEAR);
		age = year-birthYear;
		return age;
	}
}
