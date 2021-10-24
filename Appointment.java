package Appointment;

import java.util.*;

public class Appointment {

	public Appointment(String ID, Date appointmentDate, String description) {
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
		
		this.ID = ID;
		this.appointmentDate = appointmentDate;
		this.description = description;
	}
	
	public String getAppointmentID(String ID) {
		return ID;
	}
		
	public String getAppointmentDate(String appointmentDate) {
		return appointmentDate;
	}	
		
	public String getAppointmentDescription(String description) {
		return description;
	}

}
