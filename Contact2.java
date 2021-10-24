package Contact;
import java.util.*;

public class Contact2 {

	static String newContact = "";
	//method to create a new contact
	public static String add(String ID, String firstName, String lastName, String phone, String address) {
		//check if the ID for the contact is empty and throw an exception if it is
		if (ID == null) {
			throw new IllegalArgumentException("Contact ID is required");
		}
		//check if the ID for the contact is longer than 10 characters and throw an exception if it is
		if (ID.length() > 10) {
			throw new IllegalArgumentException("Contact ID cannot be longer than 10 characters");
		}
		//check if the firstName for the contact is empty and throw an exception if it is
		if (firstName == null) {
			throw new IllegalArgumentException("Contact first name is required");
		}
		//check if the firstName for the contact is longer than 10 characters and throw an exception if it is
		if (firstName.length() > 10) {
			throw new IllegalArgumentException("Contact first name cannot be longer than 10 characters");
		}
		//check if the firstName for the contact is empty and throw an exception if it is
		if (lastName == null) {
			throw new IllegalArgumentException("Contact last name is required");
		}
		//check if the lastName for the contact is longer than 10 characters and throw an exception if it is
		if (lastName.length() > 10) {
			throw new IllegalArgumentException("Contact last name cannot be longer than 10 characters");
		}
		//check if the phone for the contact is empty and throw an exception if it is
		if (phone == null) {
			throw new IllegalArgumentException("Contact phone number is required");
		}
		//check if the phone for the contact is longer than 10 characters and throw an exception if it is
		if (phone.length() > 10) {
			throw new IllegalArgumentException("Contact phone number cannot be longer than 10 characters");
		}
		//check if the phone for the contact only contains digits and throw an exception doesn't
		if (phone.matches("[0-9]") == false) {
			throw new IllegalArgumentException("Contact phone number can only be digits");
		}
		//check if the address for the contact is empty and throw an exception if it is
		if (address == null) {
			throw new IllegalArgumentException("Contact address is required");
		}
		//check if the address for the contact is longer than 30 characters and throw an exception if it is
		if (address.length() > 30) {
			throw new IllegalArgumentException("Contact address cannot be longer than 30 characters");
		}
		//create and return a new contact based on the parameters passed to the method
		newContact = ID + firstName + lastName + phone + address;
		return newContact;
	}
	//method for removing an contact based on the parameter passed to the method
	//throw an exception if the passed parameter doesn't match any contact
	public static void remove(String query) {
		if (newContact.contains(query) == true) {
			newContact = "";
		}
		else {
			throw new IllegalArgumentException("Contact doesn't exist");
		}
	}
	//method for replacing an contact based on the parameter passed to the method
	//throw an exception if the passed parameter doesn't match any contact
	public static void replace(String oldContent, String newContent) {
		if (newContact.contains(oldContent) == true) {
			newContact = newContent;
		}
		else {
			throw new IllegalArgumentException("Contact doesn't exist");
		}
	}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
