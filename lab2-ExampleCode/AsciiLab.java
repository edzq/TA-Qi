public class AsciiLab {

// 1st: define a class constant
public static final int SIZE = 6;


public static final int REPEAT_TIME = 2;

	public static void main(String[] args) {
		
		//drawLine();
		
//		drawTopHalf();
//		drawBottomHalf();
		
		drawTable();
		

	}
	
	
	
	//2nd divide line
	public static void drawLine() {
		System.out.print("+");
		for (int i = 1; i <= SIZE * 2; i++) {
			System.out.print("==");
		}
		System.out.println("+");
	}
	
	
	
	//3rd: Using doubly nested loop
	public static void drawTopHalf() {
		for (int line = 1; line <= SIZE; line++) {
			System.out.print("|");
			for (int repeat = 1; repeat <= REPEAT_TIME; repeat++) {
				
				
				for (int spaces = 1; spaces <= SIZE - line; spaces++) {
					System.out.print(" ");
				}
				
				for (int stars = 1; stars <= line; stars++) {
					System.out.print("**");
				}
				
				for (int spaces = 1; spaces <= SIZE - line; spaces++) {
					System.out.print(" ");
				}
				
				
			}
			System.out.println("|");
		}
	}
	
	
	//4th Draw the bottom half
	public static void drawBottomHalf() {
		for (int line = SIZE; line >= 1; line--) {
			System.out.print("|");
			for (int repeat = 1; repeat <= REPEAT_TIME; repeat++) {
				for (int spaces = 1; spaces <= SIZE - line; spaces++) {
					System.out.print(" ");
				}
				for (int stars = 1; stars <= line; stars++) {
					System.out.print("**");
				}
				for (int spaces = 1; spaces <= SIZE - line; spaces++) {
					System.out.print(" ");
				}
			}
			System.out.println("|");
		}
	}
	
	public static void drawTable() {
		
		
	
		for (int row = 1; row <= SIZE *3; row++) {
			for (int c = 1; c <= REPEAT_TIME; c ++){
				
				System.out.print("|");
				
				for(int clos = 1; clos <= SIZE; clos ++) {
					
					System.out.print("__");
					
				}
				
				System.out.print("|");
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
//		for (int raw = 1; raw <= SIZE * 2; raw ++) {
//			for (int ver = 1 ; ver <= REPEAT_TIME ; ver++) {
//				System.out.print("|");
//				for (int cols = 1; cols <= SIZE ; cols++ ) {
//					System.out.print("__");
//				}
//				System.out.print("|");
//			}
//			System.out.println();
//			
//		}
		
		
		
		
		
		
		
		
	}
	

}
