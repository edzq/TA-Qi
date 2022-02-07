# Lab4 - Feb 7

## Outline

- Go through the Practice Problem (Scanner 10 mins for you to finished), Assignment 5 and other practice problem.
- Practice Problem (**Scanner**, if-else, cumulative algorithms)
- Quiz



## Assignment 5

Finished all the functions and use the JUnit to run the StringPracticeTest.java.



1.**isPunct**

use if statement, is punctuation, return true

the punctuation mark need to check:  

\* apostrophe '

  \* comma ,

  \* period .

  \* semicolon ;

  \* colon :

  \* exclamation point !

  \* question mark ? 



tip: represent apostrophe, you should add a backslash \

```java
  public static boolean isPunct(char c) {
	  if( 		c == '\''
	            || c == ','
	            || c == '.'
	            || c == ';'
	            || c == ':'
	            || c == '!'
	            || c == '?') {
		  return true;
	  }
    return false;
  }
```

2.**numPunct**

tip: use String charAt() function. https://www.w3schools.com/java/ref_string_charat.asp

```java
public static int numPunct(String s) {
	  
	  int numPuncMarks = 0;  //for count
  
	  for(int i = 0; i<s.length(); i++) {
		  if(isPunct(s.charAt(i))) {
			  numPuncMarks += 1; //count
		  }	
	  }
    return numPuncMarks;
  }
```



3.**indexOfFirstPunct**



```java
  public static int indexOfFirstPunct(String s, int startPosition) {
	  
	  int puncIndex = -1; //for saving the index of 1st punctuation
	  for(int i = startPosition; i<s.length(); i++) {
		  if(isPunct(s.charAt(i))) {
			  puncIndex = i;
			  break;
		  }	
	  }
	  if(puncIndex == -1) {
		  return -1; // Index keep as -1 means noe punctuation, return negative one.
	  }
    return puncIndex;
  }
```



4.How to use StringPracticeTest.java to test the functions we wrote?

If this is your first time to use Junit, go to the **run-->run configration-->JUnit**. Then add JUnit configuration. The file our professor gave us use the **JDK 17**, if you use other version, please download the JDK 17, and add it to your Eclipse.

Since In my test, I use JDK 15, and then add JDK 17, the JUnit 5 works for StringPracticeTest.java





## Practice Problem

Three practice lab problem

- [Scanner](https://www.buildingjavaprograms.com/labs/5ed/ch03-scanner.html)
- [If-else](https://www.buildingjavaprograms.com/labs/5ed/ch04-ifelse.html)
- [Cumulative Algorithms](https://www.buildingjavaprograms.com/labs/5ed/ch04-cumulative-algorithms.html)





