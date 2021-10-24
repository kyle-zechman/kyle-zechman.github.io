package Contact;
import java.util.*;

public class Contact2 {

	static String newContact = "";
	
	public static String add(String ID, String firstName, String lastName, String phone, String address) {
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
		
		if (phone.matches("[0-9]") == false) {
			throw new IllegalArgumentException("Contact phone number can only be digits");
		}
		
		if (address == null) {
			throw new IllegalArgumentException("Contact address is required");
		}
		if (address.length() > 30) {
			throw new IllegalArgumentException("Contact address cannot be longer than 30 characters");
		}
		
		newContact = ID + firstName + lastName + phone + address;
		return newContact;
	}
	
	public static void remove(String query) {
		if (newContact.contains(query) == true) {
			newContact = "";
		}
		else {
			throw new IllegalArgumentException("Contact doesn't exist");
		}
	}
		
	public static void replace(String oldContent, String newContent) {
		if (newContact.contains(oldContent) == true) {
			newContact = newContent;
		}
		else {
			throw new IllegalArgumentException("Contact doesn't exist");
		}
	}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
