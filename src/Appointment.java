/**
File: Appointment.java
Description: Write a program that has a class, Appointment, and
three derived classes, Monthly, Daily, and OneTime. A user enters a month,
day, and year, and the program lets the user know all appointments that are on that date.
mail: jonathan.e.villegas@gmail.com
Name: Jonathan Villegas
Date: 4/27/14
**/

public class Appointment
{
	//Member variables
	private String description;
	private int appt_month;
	private int appt_day;
	private int appt_year;
	//Constructor with no args.
	public Appointment()
	{
		appt_month = 1;
		appt_day = 1;
		appt_year = 2014;
		description = "Nothing yet.";
	}
	//Constructor with args.
	public Appointment(int the_month, int the_day, int the_year)
	{
		appt_month = the_month;
		appt_day = the_day;
		appt_year = the_year;
		description = "";
	}
	/**
	 * Accessor function.
	 * @return the appointment month.
	 */
	public int getMonth()
	{
		return appt_month;
	}
	/**
	 * Mutator function. If the month passed is invalid, the month gets set to 0.
	 * @param month the month to change variable appt_month to.
	 */
	public void setMonth(int month)
	{
		if(month < 1 || month > 12)
		{
			appt_month = 0;
		}
		else
		{
			appt_month = month;
		}
	}
	/**
	 * Accessor function.
	 * @return the appointment day.
	 */
	public int getDay()
	{
		return appt_day;
	}
	/**
	 * Mutator. If day passed is invalid, depending on month, day gets set to 0.
	 * @param day - the day to change appt_day to.
	 */
	public void setDay(int day)
	{
		//Jan, Mar, May, Jul, Aug, Oct, and Dec have 31 days.
		if(appt_month == 1 || appt_month == 3 || appt_month == 5 || appt_month == 7
				|| appt_month == 8 || appt_month == 10 || appt_month == 12)
		{
			if(day < 1 || day > 31)
			{
				appt_day = 0;
			}
			else
			{
				appt_day = day;
			}
		}
		else if (appt_month == 4 || appt_month == 6 || appt_month == 9 || appt_month == 11)
		{
			if(day < 1 || day > 31)
			{
				appt_day = 0;
			}
			else
			{
				appt_day = day;
			}
		}
		else //appt_month == 2 or Feb.
		{
			if(appt_year % 4 != 0)
			{
				if(day < 1 || day > 28)
				{
					appt_day = 0;
				}
				else
				{
					appt_day = day;
				}
			}
			else if (appt_year % 100 != 0 || appt_year % 400 != 0)
			{
				if(day < 1 || day > 29)
				{
					appt_day = 0;
				}
				else
				{
					appt_day = day;
				}
			}
			else
			{
				if(day < 1 || day > 28)
				{
					appt_day = 0;
				}
				else
				{
					
					appt_day = day;
				}
			}
		}
	}
	/**
	 * Accessor function.
	 * @return the appointment year.
	 */
	public int getYear()
	{
		return appt_year;
	}
	/**
	 * Mutator function.
	 * @param year - the year to set appt_year to.
	 */
	public void setYear(int year)
	{
		appt_year = year;
	}
	/**
	 * Accessor Function.
	 * @return the description of the Appointment.
	 */
	public String getDescription()
	{
		return description;
	}
	/**
	 * Mutator Function.
	 * @param the_desc change description to the_desc.
	 */
	public void setDescription(String the_desc)
	{
		description = the_desc;
	}
	/**
	 * Function to see if an appointment occurs on a certain day.
	 * @param month - the month to check.
	 * @param day - the day to check.
	 * @param year - the year to check.
	 * @return true if all are the same, false if not.
	 */
	public boolean occursOn(int month, int day, int year)
	{
		return ((appt_year == year) && (appt_month == month) && (appt_day == day));
	}
}