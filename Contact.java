package Contact;
import java.util.*;

public class Contact {

	public Contact(String ID, String firstName, String lastName, String phone, String address) {
		if (ID == null) {
			throw new IllegalArgumentException("Contact ID is required");
		}
		if (ID.length() > 10) {
			throw new IllegalArgumentException("Contact ID cannot be longer than 10 characters");
		}
		
		if (firstName == null) {
			throw new IllegalArgumentException("Contact first name is required");
		}
		if (firstName.length() > 10) {
			throw new IllegalArgumentException("Contact first name cannot be longer than 10 characters");
		}
		
		if (lastName == null) {
			throw new IllegalArgumentException("Contact last name is required");
		}
		if (lastName.length() > 10) {
			throw new IllegalArgumentException("Contact last name cannot be longer than 10 characters");
		}
		
		if (phone == null) {
			throw new IllegalArgumentException("Contact phone number is required");
		}
		if (phone.length() > 10) {
			throw new IllegalArgumentException("Contact phone number cannot be longer than 10 characters");
		}
		
		if (phone.contains(/D) == true) {
			throw new IllegalArgumentException("Contact phone number can only be digits");
		}
		
		if (address == null) {
			throw new IllegalArgumentException("Contact address is required");
		}
		if (address.length() > 30) {
			throw new IllegalArgumentException("Contact address cannot be longer than 30 characters");
		}
		
		this.ID = ID;
		this.firstname = firstname;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	public String getContactID(String ID) {
		return ID;
	}
		
	public String getContactFirstName(String firstName) {
		return firstName;
	}	
		
	public String getContactLastName(String lastName) {
		return lastName;
	}
		
	public String getContactPhone(String phone) {
		return phone;
	}	
		
	public String getContactAddress(String address) {
		return address;
	}	
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
