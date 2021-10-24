package Task;

import java.util.*;

public class Task {
	
	public Task(String ID, String name, String description) {
		if (ID == null) {
			throw new IllegalArgumentException("Task ID is required");
		}
		if (ID.length() > 10) {
			throw new IllegalArgumentException("Task ID cannot be longer than 10 characters");
		}
		
		if (name == null) {
			throw new IllegalArgumentException("Task name is required");
		}
		if (name.length() > 20) {
			throw new IllegalArgumentException("Task name cannot be longer than 20 characters");
		}
		
		if (description == null) {
			throw new IllegalArgumentException("Task description is required");
		}
		if (description.length() > 50) {
			throw new IllegalArgumentException("Task description cannot be longer than 50 characters");
		}
		
		this.ID = ID;
		this.name = name;
		this.description = description;
	}
	
	public String getTaskID(String ID) {
		return ID;
	}
		
	public String getTaskName(String name) {
		return name;
	}	
		
	public String getTaskDescription(String description) {
		return description;
	}		
		
}
		
