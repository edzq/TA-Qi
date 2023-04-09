import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.*;

public class Main {

	public static void main(String[] args) {
		
		// Test the HoneyDoList class
//		HoneyDoList taskList = new HoneyDoList();
//		System.out.println(taskList.toString());
		

		
		// Test for the Task class
		// minutes
		LocalDateTime due = LocalDateTime.of(2021, Month.APRIL, 17, 23, 59);
		
		// construct a task
		Task HW9 = new Task ("HW9",1,180,due);
		
		Task HW10 = new Task ("HW10",2,90,due);
		
		Task HW11 = new Task ("HW11",3,110,due);
		
		Task HW12 = new Task ("HW12",4,130,due);
		
		HoneyDoList taskList = new HoneyDoList();
		
		// empty task list
		System.out.println(taskList.toString());
		System.out.println(taskList.shortestTime());
		// add a new task
		taskList.addTask(HW9);
		
		// add more tasks
		taskList.addTask(HW10);
		taskList.addTask(HW11);
		
		// add a task that exceeds the capacity
		taskList.addTask(HW12);
		
		System.out.println(taskList.getTask(1));
		
//		System.out.println(taskList.toString());
		
//		System.out.println(taskList.numTasks);
		
//		
//		
//		System.out.println(HW9.toString());
//		// call methods
////		HW9.setName("HW10");
//		HW9.decreasePriority(6);
//		System.out.println("===== After operations ==== ");
//		System.out.println(HW9.toString());
//		
//		System.out.println(HW9.overdue());
		//LocalDateTime now = LocalDateTime.now();
		
	}

}
