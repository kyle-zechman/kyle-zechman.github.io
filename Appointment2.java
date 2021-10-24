package Appointment;

import java.util.*;

public class Appointment2 {

	static String newAppointment = "";
	
	public static String add(String ID, Date appointmentDate, String description) {
		if (ID == null) {
			throw new IllegalArgumentException("Appointment ID is required");
		}
		if (ID.length() > 10) {
			throw new IllegalArgumentException("Appointment ID cannot be longer than 10 characters");
		}
		
		if (appointmentDate == null) {
			throw new IllegalArgumentException("Appointment date is required");
		}
			
		if (appointmentDate.before(new Date()) == true) {
			throw new IllegalArgumentException("Appointment date cannot be a past date");
		}
		
		if (description == null) {
			throw new IllegalArgumentException("Appointment description is required");
		}
		if (description.length() > 10) {
			throw new IllegalArgumentException("Appointment description cannot be longer than 50 characters");
		}
		
		newAppointment = ID + appointmentDate + description;
		return newAppointment;
		
	}
	
	public static void remove(String query) {
		if (newAppointment.contains(query) == true) {
			newAppointment = "";
		}
		else {
			throw new IllegalArgumentException("Appointment doesn't exist");
		}
	}

}
