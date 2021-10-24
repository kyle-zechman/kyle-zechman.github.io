package Task;

import java.util.*;

public class Task2 {
	
	static String newTask = "";
	
	public static String add(String ID, String name, String description) {
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
		
		newTask = ID + name + description;
		return newTask;
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
	
	public static void remove(String query) {
		if (newTask.contains(query) == true) {
			newTask = "";
		}
		else {
			throw new IllegalArgumentException("Task doesn't exist");
		}
	}
	
	public static void replace(String oldContent, String newContent) {
		if (newTask.contains(oldContent) == true) {
			newTask = newContent;
		}
		else {
			throw new IllegalArgumentException("Contact doesn't exist");
		}
	}
		
}
		
