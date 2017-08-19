/**
File: AppointmentTest.java
Description: Write a program that has a class, Appointment, and
three derived classes, Monthly, Daily, and OneTime. A user enters a month,
day, and year, and the program lets the user know all appointments that are on that date.
mail: jonathan.e.villegas@gmail.com
Name: Jonathan Villegas
Date: 4/27/14
**/

import java.util.Scanner;
import java.util.ArrayList;

public class AppointmentTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Appointment[] appointments = new Appointment[20];
		appointments[0] = new Daily(3, 31, 2014);
		appointments[0].setDescription("Daily appointment. Brush your teeth.");
		appointments[1] = new OneTime(4, 29, 2014);
		appointments[1].setDescription("One Time appointment. Pump the sewage.");
		appointments[2] = new Monthly(5, 15, 2014);
		appointments[2].setDescription("Monthly appointment. Get a haircut.");
		appointments[3] = new Daily(5, 15, 2014);
		appointments[3].setDescription("Daily appointment. Take a Shower.");
		appointments[4] = new OneTime(6, 2, 2014);
		appointments[4].setDescription("One Time appointment. Prepare dinner.");
		appointments[5] = new Monthly(5, 15, 2014);
		appointments[5].setDescription("Monthly appointment. Groom dog.");
		appointments[6] = new Daily(3, 24, 2014);
		appointments[6].setDescription("Daily appointment. Do Homework.");
		appointments[7] = new OneTime(5, 15, 2014);
		appointments[7].setDescription("One Time appointment. Buy a video game.");
		appointments[8] = new Monthly(4, 15, 2014);
		appointments[8].setDescription("Monthly appointment. Get new socks.");
		appointments[9] = new OneTime(9, 7, 2014);
		appointments[9].setDescription("One Time appointment. Vaccuum.");
		
		System.out.println("Enter a date to find out if there is an appointment scheduled.");
		System.out.print("Please enter a month: ");
		int month = in.nextInt();
		System.out.print("Please enter a day: ");
		int day = in.nextInt();
		System.out.print("Please enter a year: ");
		int year = in.nextInt();
		
		for(int i = 0; i < 10; i ++)
		{
			if(appointments[i].occursOn(month, day, year))
			{
				System.out.println("Description: " + appointments[i].getDescription());
			}
		}
	}

}
