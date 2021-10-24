package AppointmentService;
import Appointment.Appointment2;
import java.util.*;

public class AppointmentService2 {
	//calls method to add appointment
	public void addToList() {
		Appointment2.add("ID", null, "description");
	}
	//calls method to remove appointment
	public void deleteAppointment() {
		Appointment2.remove("query");
	}
}
