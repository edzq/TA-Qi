//A class is like an object constructor, or 
//a "blueprint" for creating objects. It means we 
//can use the classes to create objects.

//We have one Car class, then we can create an object
//of Car

public class CarMain {

	public static void main(String[] args) {
		Car myCivic = new Car("Honda", "Civic", 2022, 30, 5000, 13.2, 2.2);
		System.out.println(myCivic.toString());
		System.out.println("---Test Drive---");
		myCivic.drive(10);
		System.out.println(myCivic.toString());
		//System.out.println(myCivic.getFuelRemaining());
	}

}
