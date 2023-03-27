//import objects.Fraction;

public class FractionMain {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(2, 4);
		System.out.println(f1);
		
		System.out.println(f1.toString());
		System.out.println();
		
		System.out.println((new Fraction(1,4)).add(new Fraction(1,4)));
		System.out.println();
		
		System.out.println((new Fraction(1,4)).equals(new Fraction(1,4)));
		
	}

}
