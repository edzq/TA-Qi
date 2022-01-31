# Lab3 Practice answer



### Lab return

Exercise 1:

2.7

3.0 (since grade is double)

2.0

16.0 

8.0

25

5

3



Exercise 2:

```java
public double area(double r) {
    return Math.PI * r * r;
}
```



Exercise 3:

```java
public double pay(double sal, int h) {
  	if(h>8){
      return sal * h + sal * (h - 8) * 0.5;
    }
  	else{
      return sal * h;
    }
    //return h > 8 ? sal * h + (h - 8) * 0.5 * sal : sal * h;
}
```



### Lab Scanner

Exercise 1:

```java
public class CollegeAdmit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("University admission program");
        System.out.print("What is your GPA? ");
        double gpa = console.nextDouble();
        System.out.print("What is your SAT score? ");
        int sat = console.nextInt();
        
        if(gpa < 1.8) {
            System.out.println("Your GPA is too low.");
        } else if(sat < 900) {
            System.out.println("Your SAT score is too low.");
        } else {
            System.out.println("You were accepted!");
        }
    }
}
```



Exercise 3:

```java


public static void longestName(Scanner console, int n) {
		String longest = "";
		boolean tie = false;
		for(int i = 1; i <= n; i++) {
			System.out.print("name #" + i + "? ");
			String name = console.next();
			if(name.length() == longest.length()) {
				tie = true;
			} else if(name.length() > longest.length()) {
				tie = false;
				longest = name;
			}
		}
		String capitalize = longest.substring(0, 1).toUpperCase() +
				longest.substring(1).toLowerCase();
		System.out.println(capitalize + "'s name is longest");
		if(tie) {
			System.out.println("(There was a tie!)");
		}
	}
```



### Lab 3 Parameter

Exercise 1:

15, 42

10, 25



Exercise 2:

Formula: **say #2 not #3 or #1**

say coke not pepsi or pop

say soda not soda or pepsi

say pepsi not koolaid or pop

say say not pepsi or pepsi



Exercise 3:

Formula: **#2 times #1 = (number * 2)**

three times two = 6

1 times three = 28

1 times 1 = 42

three times 1 = 2

1 times eight = 20



Exercise 4 is similar 



Exercise 6

```java
public void printGrid(int row, int col) {
    for(int i = 1; i <= row; i++) {
        int end = i + row * (col - 1);
        for(int j = i; j <= end; j += row) {
            System.out.print(j);
            if(j != end) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
```



Exercise 7:

```java
public void printGrid(int row, int col) {
    for(int i = 1; i <= row; i++) {
        int end = i + row * (col - 1);
        for(int j = i; j <= end; j += row) {
            System.out.print(j);
            if(j != end) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
```

