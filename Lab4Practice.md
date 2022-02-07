# Lab4Practice

## if-else

Exercise 1

40 20

8 15

0 17

12 16

20 20



Exercise 2

```java
public static int numUnique(int a, int b, int c) {
		if(a == b && b != c || a == c && b!= a || b == c && c != a) 
			return 2;
		if(a == b && b == c && c == a)
			return 1;
		return 3;
	}
```



Exercise 3 quadrant

```java
public int quadrant(double x, double y) {
    if(x > 0 && y > 0)
        return 1;

    if(x < 0 && y > 0)
        return 2;

    if(x < 0 && y < 0)
        return 3;

    if(x > 0 && y < 0)
        return 4;

    return 0;
}
```







Exercise 8

```java



public static void seeMovie(double cost , double rating) {
		
		if(cost < 5) {
			System.out.println("very interested");
		}
		else if(cost >= 12 && rating == 5) {
			System.out.println("sort-of interested");
		}
		else if(cost >= 12 && rating < 5) {
			System.out.println("not interested");
		}
		else if(cost < 12 && rating == 5) {
			System.out.println("very interested");
		}
		else if(cost <= 11.99 && cost >=5 && rating <=4 && rating >=2) {
			System.out.println("sort-of interested");
		}
		else if(cost <= 11.99 && cost >=5 && rating <=4 && rating >=2) {
			System.out.println("sort-of interested");
		}
		else {
			System.out.println("not interested");
		}
	}
```



## cumulative-algorithms

Exercise 2 pow:

```java
public int pow(int base, int exp) {
    int result = 1;
    while(exp > 0) {
        result *= base;
        exp--;
    }
    return result;
}
```



pow challenge

```java
public double pow2(double base, int exp) {
    double result = 1;
    
    for(int i = 0; i < Math.abs(exp); i++)
        result *= base;
        
    if(exp < 0)
        return 1 / result;
        
    return result;
}
```



Exercise 3 repl

```java
public String repl(String str, int rep) {
    StringBuilder result = new StringBuilder();
    for(int i = 0; i < rep; i++)
        result.append(str);
    return result.toString();
}
```



Exercise 4: longestName



see previous solution.