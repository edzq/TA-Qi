# Assignment 9

Here are some hints and examples for this assignment.



## Car class

the example of the drive method:

```java
public void drive(double m) {
		
		this.milesDriven = this.milesDriven + m ;
		this.fuelRemaining = this.fuelRemaining - m/this.MPG;
		
	}
```





## Fraction class

The example of add methods:

```java
public Fraction add(Fraction a) {
		
		//all the denominator cannot be 0
		if((denominator == 0) || (a.denominator == 0)) {
			throw new ArithmeticException("Invalid denominator!!!");
		}
		
		// calculate the new numerator and new denominator
		int newDenominator = denominator * a.denominator;
		int newNumerator = (numerator * a.denominator) + (denominator * a.numerator);
		
		//create one new fraction
		Fraction sum = new Fraction(newNumerator, newDenominator);
		
		// call the reduce function to store the fraction as reduced form
		sum = sum.reduce();
		
		return sum;
	}
```





The example of get the greatest common divisor:

Read the [Euclidean algorithm](https://en.wikipedia.org/wiki/Euclidean_algorithm)

```java
private int gcd(int a, int b) {
	      int factor = b;
	      while (b != 0) {
	         factor = b;
	         b = a % b;
	         a = factor;
	      }
	      return a;
	   }
```

The example of the reduce methods:



```java
private Fraction reduce() {
		int common = 0;
		
		// get absolute values for numerator and denominator
		int num = Math.abs(numerator);
		int den = Math.abs(denominator);
		
		// figure out which is less, numerator or denominator
		if(num > den) {
			common = gcd(num, den);
		}
		else if(num < den) {
			common = gcd(den, num);
		}
		else {
			common = num; // if both are the same, don't need to call gcd
		}
		
		// set result based on common factor derived from gcd
		int newNumerator = numerator / common;
		int newDenominator = denominator / common;
		Fraction result = new Fraction(newNumerator, newDenominator);
		
		return result;
		
	}
```

