package org.quartz;

import java.util.TimeZone;

import com.ghasemkiani.util.icu.PersianCalendar;

public class PersianUtils {
	
	 /**
     * Simulates the java.util.Calendar.getInstance() method.
     */
    public static PersianCalendar getCalendarInstance() {
    	return new PersianCalendar();
    }
    
    /**
     * Simulates the java.util.Calendar.getInstance(TimeZone tz) method.
     */
    public static PersianCalendar getCalendarInstance(TimeZone timeZone) {
    	String tzId = timeZone.getID();
    	com.ibm.icu.util.TimeZone tz = com.ibm.icu.util.TimeZone.getTimeZone(tzId);
    	return new PersianCalendar(tz);
    }
    
    /**
     * Maps the gregorian week days 1-7(SUN-SAT) to jalali weekdays 1-7(shanbe-jome)
     */
    public static int toPersianWeekDay(int gregWeekDay) {    	
    	switch(gregWeekDay) {
    		case 1: return 2;
    		case 2: return 3;
    		case 3: return 4;
    		case 4: return 5;
    		case 5: return 6;
    		case 6: return 7;//jome akharin roze hafeh ast.
    		case 7: return 1;//shanbe avvalin roze hafeh ast.
    		default: throw new IllegalArgumentException("Invalid weekday: "+gregWeekDay);
    	}
    }
}
