package Task;

import java.util.*;

public class Task2 {
	
	static String newTask = "";
	//method to create a new task
	public static String add(String ID, String name, String description) {
		//check if the ID for the task is empty and throw an exception if it is
		if (ID == null) {
			throw new IllegalArgumentException("Task ID is required");
		}
		//check if the ID for the task is longer than 10 characters and throw an exception if it is
		if (ID.length() > 10) {
			throw new IllegalArgumentException("Task ID cannot be longer than 10 characters");
		}
		//check if the name for the task is empty and throw an exception if it is
		if (name == null) {
			throw new IllegalArgumentException("Task name is required");
		}
		//check if the name for the task is longer than 20 characters and throw an exception if it is
		if (name.length() > 20) {
			throw new IllegalArgumentException("Task name cannot be longer than 20 characters");
		}
		//check if the description for the task is empty and throw an exception if it is
		if (description == null) {
			throw new IllegalArgumentException("Task description is required");
		}
		//check if the description for the task is longer than 50 characters and throw an exception if it is
		if (description.length() > 50) {
			throw new IllegalArgumentException("Task description cannot be longer than 50 characters");
		}
		//create and return a new task based on the parameters passed to the method
		newTask = ID + name + description;
		return newTask;
	}
	//method for removing a task based on the parameter passed to the method
	//throw an exception if the passed parameter doesn't match any appointment
	public static void remove(String query) {
		if (newTask.contains(query) == true) {
			newTask = "";
		}
		else {
			throw new IllegalArgumentException("Task doesn't exist");
		}
	}
	//method for replacing a task based on the parameter passed to the method
	//throw an exception if the passed parameter doesn't match any appointment
	public static void replace(String oldContent, String newContent) {
		if (newTask.contains(oldContent) == true) {
			newTask = newContent;
		}
		else {
			throw new IllegalArgumentException("Contact doesn't exist");
		}
	}
		
}
		
