package AppointmentService;
import Appointment.Appointment2;
import java.util.*;

public class AppointmentService2 {

	public void addToList() {
		Appointment2.add("ID", null, "description");
	}
	
	public void deleteAppointment() {
		Appointment2.remove("query");
	}
}
