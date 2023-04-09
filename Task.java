import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.*;

public class Task {

	// declares the fields
	private String name;
	private int priority;
	private int estMinsToComplete;
	private LocalDateTime whenDue;
	// constructor
	public Task(String name, int priority, int estminsToComplete, LocalDateTime whenDue) {
		this.name = name;
		this.priority = priority;
		this.estMinsToComplete = estminsToComplete;
		this.whenDue = whenDue;
	}
	
	// null constructor
	
	// Accessors
	public String getName() { return name;}
	public int getPriority() {	return priority;}
	public int getEstMinsToComplete() { return estMinsToComplete;}
	public LocalDateTime getWhenDue() { return whenDue; }
	
	// Mutators
	public void setName(String name) { this.name = name; }
	public void setPriority(int priority) { this.priority = priority; }
	public void setEstMinsToComplete(int estMinsToComplete) { this.estMinsToComplete = estMinsToComplete; }
	public void setWhenDue(LocalDateTime whenDue) { this.whenDue = whenDue; }
	
	// toSting
	public String toString() {
		return (
				"Name: " + this.name 
				+ "\nPriority: " + this.priority
				+ "\nEstMinsToComplete: " + this.estMinsToComplete
				+ "\nWhenDue: " + this.whenDue
				+ "\n"
				);
	}
	
	// increasePriority
	public void increasePriority( int amount) {
		if(amount >= 0) {
			this.priority += amount;
		}
	}
	
	// decreasePriority
	public void decreasePriority(int amount) {
		if(amount >= this.priority) {
			this.priority = 0;
		} else {
			this.priority -= amount ;
		}
	}
	
	// extra credit overdue()
	public boolean overdue() {
		
		LocalDateTime now = LocalDateTime.now(); // get current time
		// call the isAfter function of LocalDateTime obj
		return now.isAfter(this.whenDue);
		
	}
	
//	public static void main(String[] args) {
//		
//		// set a Time obj
//		LocalDateTime due = new LocalDateTime.of(2023, 04, 17, 23, 59, 640000);
//		
//		Task HW9 = new Task (
//				"CIS1068 HW9",
//				1,
//				180,
//				due
//				);
//	}
	
	
}
