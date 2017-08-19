/**
File: Monthly.java
Description: Write a program that has a class, Appointment, and
three derived classes, Monthly, Daily, and OneTime. A user enters a month,
day, and year, and the program lets the user know all appointments that are on that date.
mail: jonathan.e.villegas@gmail.com
Name: Jonathan Villegas
Date: 4/27/14
**/
public class Monthly extends Appointment
{
	//Constructor
	public Monthly(int month, int day, int year)
	{
		setDay(day);
		setYear(year);
		setMonth(0);
	}
	/**
	 * Returns true if the year and day are the same. Since this is Monthly,
	 * there is no need to check the month. It will occur every month.
	 */
	public boolean occursOn(int month, int day, int year)
	{
		return ((getYear() == year) && (getDay() == day));
	}
}
