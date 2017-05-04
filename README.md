# Persian ( Jalali ) Cron Expression for Java
I've implemented a PersianCronExpression parser for quartz-1.6.5 which is exactly like "org.quartz.CronExpression" class but it works with jalali fields. I mean you can use the jalali year, month, day, day-of-week and day-of-month fields(I've attached the source files to this post).

For example these are the samples of cron expression in jalali:

"0 0 0 1 1/1 ? 1387-1389" "0/15 41 9 5 6 ? 1388"

The implementation use the "Mr Ghasemkiani Persian calendar" which you can find it at sourceforge.net. I've corrected some wrong behavior of calendar and included the source in attachment.

NOTE that as the "Mr Ghasemkiani Persian Clandar" is "arithmatic jalali calendar" so it only works correctly until year "1402 shamsi". After year 1402 the calendar has a "leap year" problem. So you can just use it until year 1402 shamsi.

I hope oracle implements the PersianCalendar and places it in JDK so that we can use it with quartz.

Some aspects of cron-expression is fitted with jalai ( shamsi ) calendar, e.g. the working days are from shanbe to chahar-shanbe.

You can just change the CronExpresison of other version of quartz to provide PersianCronExpression.
