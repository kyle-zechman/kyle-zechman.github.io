package TaskService;

import Task.Task2;
import Task.Task;

public class TaskService2 {
	
	public void addToList() {
		Task2.add("ID", "name", "description");
	}
	
	public void deleteTask() {
		Task2.remove("query");
	}

	public void updateTask() {
		Task2.replace("oldContent", "newContent");
	}

}
