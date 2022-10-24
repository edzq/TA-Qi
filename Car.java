
//Java is an object-oriented programming language
//Java is associated with classes and objects, along 
//with its attributes and methods

//So a class is like an object constructor, or 
//a "blueprint" for creating objects. It means we 
//can use the classes to create objects.

//create a Car class
public class Car {

	/* Private Explain
	 * The private keyword is an access modifier used 
	 * for attributes, methods and constructors, making 
	 * them only accessible within the declared class.
	 * */
	//attributes declare
	private String make; //Ford, Subaru, Toyota, Honda
	private String model;//Civic
	private int year;//2022
	private double MPG;//Miles per gallon
	private double milesDriven;
	private double fuelCapacity;
	private double fuelRemaining;

	
	//Constructor:
	//A special method that is used to initialize 
	//objects. 
	public Car(String make, String model, int year, double MPG, double milesDriven, double fuelCapacity, double fuelRemaining){
			
			this.make = make;
			this.model = model;
			this.year = year;
			this.MPG = MPG;
			this.milesDriven = milesDriven;
			this.fuelCapacity = fuelCapacity;
			this.fuelRemaining = fuelRemaining;
		}
	
	//Methods
	public void fillTank(double g) {
		
		this.fuelRemaining = this.fuelRemaining + g;
		
		//Not more than the cars fuel capacity
		if(this.fuelRemaining > this.fuelCapacity) {
			this.fuelRemaining = this.fuelCapacity;
		}
	}
	
	public void drive(double m) {
			
			this.milesDriven = this.milesDriven + m ;
			
			//Driving some miles, need to subtract fuels
			this.fuelRemaining = this.fuelRemaining - m/this.MPG;
			
	}
	
	public double getFuelRemaining() {
		return fuelRemaining;//just return the value of this attributes
	}
	
	public String toString() {
		return "Car make: " + make + 
				"\nCar model: " + model + 
				"\nCar year: " + year + 
				"\nCar MPG: " + MPG + 
				"\nmiles driven: " + milesDriven +
				"\nfuel Capacity: " + fuelCapacity + 
				"\nfuel remaining: " + fuelRemaining; 
	}
}
