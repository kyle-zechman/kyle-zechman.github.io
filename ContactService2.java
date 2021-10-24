package ContactService;
import Contact.Contact2;
import java.util.*;

public class ContactService2 {
	//calls method to add contact
	public void addToContactList() {
		Contact2.add("ID", "firstName", "lastName", "phone", "address");
	}
	//calls method to remove contact
	public void deleteContact() {
		Contact2.remove("query");
	}
	//calls method to update contact
	public void updateContact() {
		Contact2.replace("oldContent", "newContent");
	}
}
