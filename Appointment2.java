package Appointment;

import java.util.*;

public class Appointment2 {

	static String newAppointment = "";
	//method to create a new appointment
	public static String add(String ID, Date appointmentDate, String description) {
		//check if the ID for the appointment is empty and throw an exception if it is
		if (ID == null) {
			throw new IllegalArgumentException("Appointment ID is required");
		}
		//check if the ID for the appointment is longer than 10 characters and throw an exception if it is
		if (ID.length() > 10) {
			throw new IllegalArgumentException("Appointment ID cannot be longer than 10 characters");
		}
		//check if the date for the appointment is null and throw an exception if it is
		if (appointmentDate == null) {
			throw new IllegalArgumentException("Appointment date is required");
		}
		//check if the date for the appointment is before the current date and throw an exception if it is	
		if (appointmentDate.before(new Date()) == true) {
			throw new IllegalArgumentException("Appointment date cannot be a past date");
		}
		//check if the description for the appointment is empty and throw an exception if it is
		if (description == null) {
			throw new IllegalArgumentException("Appointment description is required");
		}
		//check if the description for the appointment is longer than 50 characters and throw an exception if it is
		if (description.length() > 50) {
			throw new IllegalArgumentException("Appointment description cannot be longer than 50 characters");
		}
		//create and return a new appointment based on the parameters passed to the method
		newAppointment = ID + appointmentDate + description;
		return newAppointment;
		
	}
	//method for removing an appointment based on the parameter passed to the method
	//throw an exception if the passed parameter doesn't match any appointment
	public static void remove(String query) {
		if (newAppointment.contains(query) == true) {
			newAppointment = "";
		}
		else {
			throw new IllegalArgumentException("Appointment doesn't exist");
		}
	}

}
