
public class catSong {
	

	public static void main(String[] args) {
		
		verse1();
		System.out.println();
		verse6();
		
	}
	
	public static void verse1() {
		
		System.out.println("Bought me a cat and the cat pleased me,");
		System.out.println("I fed my cat under yonder tree.");
		cat();
		
	}
	
	
	public static void verse6() {
		
		System.out.println("Bought me a pig and the pig pleased me,");
		System.out.println("I fed my pig under yonder tree.");
		
//		intro("pig");
		
		pig();
		sheep();
		goose();
		duck();
		hen();
		cat();
	}
	
	//Print statements for repeated lines
	public static void cat() {
		System.out.println("Cat goes fiddle-i-fee.");
	}
	
	
	public static void hen() {
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
	}
	public static void duck() {
		System.out.println("Duck goes quack, quack,");
	}
	public static void goose() {
		System.out.println("Goose goes hissy, hissy,");
	}
	public static void sheep() {
		System.out.println("Sheep goes baa, baa,");
	}
	public static void pig() {
		System.out.println("Pig goes oink, oink,");
	}
	
//	public static void intro (String animal) {
//		System.out.println("Bought me a " + animal + " and the " + animal + " pleased me,\nI fed my " + animal +  " under yonder tree.");
//	}

}
