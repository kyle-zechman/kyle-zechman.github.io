package TaskService;

import Task.Task2;
import Task.Task;

public class TaskService2 {
	//calls method to add task
	public void addToList() {
		Task2.add("ID", "name", "description");
	}
	//calls method to remove task
	public void deleteTask() {
		Task2.remove("query");
	}
	//calls method to replace task
	public void updateTask() {
		Task2.replace("oldContent", "newContent");
	}

}
