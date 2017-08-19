/**
File: OneTime.java
Description: Write a program that has a class, Appointment, and
three derived classes, Monthly, Daily, and OneTime. A user enters a month,
day, and year, and the program lets the user know all appointments that are on that date.
mail: jonathan.e.villegas@gmail.com
Name: Jonathan Villegas
Date: 4/27/14
**/

public class OneTime extends Appointment
{
	//Constructor
	public OneTime(int month, int day, int year)
	{
		setMonth(month);
		setDay(day);
		setYear(year);
	}
	/**
	 * Returns true if the day, month, and year passed are the same as the object.
	 */
	public boolean occursOn(int month, int day, int year)
	{
		return ((getYear() == year) && (getMonth() == month) && (getDay() == day));
	}
}
