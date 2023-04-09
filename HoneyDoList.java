import java.util.Arrays;

public class HoneyDoList {

	// fields
	private Task[] tasks;
	private int numTasks;
	private final int INITIAL_CAPACITY = 3;
	
	// constructor
	public HoneyDoList() {
		this.numTasks = 0;
		this.tasks = new Task[this.INITIAL_CAPACITY];
	}
	
	// methods
	public String toString() {
		String taskString = "";
		if(this.numTasks == 0) {
			taskString = null;
		} else {
			for (int i = 0; i < this.numTasks; i++) {
				taskString += "====== Task:" + i + "=====\n";
				taskString += this.tasks[i].toString();
			}
		}
		return taskString;
	}
	
	public int find(String name) {
		
		for(int i=0; i < this.numTasks; i++) {
			String taskName = this.tasks[i].getName();
			if(taskName.equalsIgnoreCase(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public void addTask(Task newTask) {
		
		// full => numTasks == task array length
		if (this.numTasks  == this.tasks.length) {
			this.tasks = Arrays.copyOf(this.tasks, this.tasks.length * 2);
		}
		
		// append list and add new Task
		this.tasks[this.numTasks++] = newTask;
	}
	
	public int totalTime() {
		int totalTime = 0;
		for (int i =0 ; i < this.numTasks; i++) {
			totalTime += this.tasks[i].getEstMinsToComplete();
		}
		return totalTime;
	}
	
	public int shortestTime() {
		
		int index = -1;
		int shortTime = -1;
		// for loop to find the smallest estMinsToComplete
		for (int i = 0; i < this.numTasks; i++) {
			if(this.tasks[i].getEstMinsToComplete() < shortTime) {
				index = i;
				shortTime = this.tasks[i].getEstMinsToComplete();
			}
		}
		return index;
	}
	
	public void completeTask(int index) {
		// for loop to shift each task after index into left one place
		for (int i=index; i<this.numTasks-1; i++) {
			this.tasks[i] = this.tasks[i=1];
		}
		// set the previous final task element in the array as null
		this.tasks[this.numTasks] = null;
		this.numTasks -= 1;
	}
	
	public String getTask(int index) {
		String specificTask = null;
		if(index > 0 && index < this.numTasks) {
			specificTask = this.tasks[index].toString();
			return specificTask;
		}
		return specificTask;
	}
	
	public HoneyDoList overdueTasks() {
		// config a new task array
		HoneyDoList overdueList = new HoneyDoList();
		for (int i=0; i < this.numTasks; i++) {
			// check overdue
			if(this.tasks[i].overdue()) {
				overdueList.addTask(this.tasks[i]);
			}
		}
		return overdueList;
	}
	
}
