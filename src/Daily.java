/**
File: Daily.java
Description: Write a program that has a class, Appointment, and
three derived classes, Monthly, Daily, and OneTime. A user enters a month,
day, and year, and the program lets the user know all appointments that are on that date.
mail: jonathan.e.villegas@gmail.com
Name: Jonathan Villegas
Date: 4/27/14
**/

public class Daily extends Appointment
{
	public Daily(int month, int day, int year)
	{
		//Constructor
		setMonth(month);
		setYear(year);
		setDay(0);
	}
	/**
	 * Returns true if the month and year are the same as the ints passed.
	 * No need to check the day because it is a daily appointment.
	 */
	public boolean occursOn(int month, int day, int year)
	{
		return ((getYear() == year) && (getMonth() == month));
	}
}
