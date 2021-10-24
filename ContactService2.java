package ContactService;
import Contact.Contact2;
import java.util.*;

public class ContactService2 {
	
	public void addToContactList() {
		Contact2.add("ID", "firstName", "lastName", "phone", "address");
	}
	
	public void deleteContact() {
		Contact2.remove("query");
	}

	public void updateContact() {
		Contact2.replace("oldContent", "newContent");
	}
}
