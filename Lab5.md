# Lab 5



## 1.Assignment 6

### 1.1 Game rule and hints

Your program should behave as follows:

- [3 points] The rules should be printed to the screen

  **Hints: Use one fuction named as Intro to print the rules in the begin of the program.** 

  

- [5 points] The user is asked if they'd like to play a round

  - if they choose 'y', a round is played
  - if they choose 'n', the program ends
  - Until the user has chosen to quit, another round is played.

**Hints:** 

1.Use the while to build a loop, until input "n", then quit the game. So I use one variable to represent the game condition => "<font color=Green>gameCondition</font>"

2.Validate the input, users can only input "y", "n" ,"Y", "N".

**Example code 1**

<font color=Green>gameCondition</font>: Boolean varible to control the game condition

<font color ="Blue">choiceHelper</font>: function to validate the input, user can only input y or n. <font color = "Orange"> Use while loop for validating the input of "y" and "n"</font>

Some built-in functions:

[toLowerCase()](https://www.w3schools.com/java/ref_string_tolowercase.asp):convert the string to lower case

[nextLine()](https://www.geeksforgeeks.org/scanner-nextline-method-in-java-with-examples/): This method returns the whole line after you click enter

[equal()](https://www.geeksforgeeks.org/difference-between-and-equals-method-in-java/#:~:text=.-,equals()%20Method,matched%2C%20then%20it%20returns%20false.) : Comparison of string.

```java
public static void main(String[] args) {
		
	 
	Scanner console = new Scanner(System.in);
		
		//Example 1: 
	System.out.println("Would you like to play a round of game? Enter y for playing, Enter n for quit.");
  
  	//define a boolean variable to control the condition of game. T=> continue, F=> quit
  Boolean gameCondition = choiceHelper(console); //call choiceHelper functin
	
  //while loop to control the game round
  while (gameCondition == true) {
			System.out.println();
			System.out.println("Do you want to play again? Enter y for playing, Enter n for quit.");
    	
			gameCondition = choiceHelper(console);
		}

	}
	public static Boolean choiceHelper(Scanner console) {
		
    //get the string use input. toLowerCase() means conver the input to lower case.
		String playChoice = console.nextLine().toLowerCase();
    
    //While loop to determin wheteher the input is equal to "y" or "n"
		while ((!playChoice.equals("n")) && (!playChoice.equals("y"))) {
      
			System.out.println("Enter error! Please enter y or n!");
			playChoice = console.nextLine().toLowerCase();
      
		}
    
    //after jumping out this while, if statement for checking continue play or not
		if (playChoice.equals("y")) {
			return true;
		}else if(playChoice.equals("n")) {
			System.out.println("Goodbye!");
		}
		
		return false;
	}
```





- In a round of play:  <font color="red">You can define one function here, like playGame()</font>

  - [4 points] The computer makes a move at random. (Hint: remember how we generated random numbers in class.)

  **Hints:** <font color = "red">Define one fnction, use the method to generate random number and map the number to five moves</font>

  **Example code 2**:

  <font color=Green>computerMove</font>: String variable to save the move of computer.

  <font color ="Blue">getComputerMove</font>: function to generate a random number between 0-4, and map them to corresponds 5 moves.

  

  [Random.nextInt( )](https://www.geeksforgeeks.org/java-util-random-nextint-java/): If you pass one int parameter x, returen one random integer between 0 to x.

  [Switch statement in java](https://www.w3schools.com/java/java_switch.asp): Another kind of conditional statment. Use the `switch` statement to select one of many code blocks to be executed.

  ```java
  // Define one String variable to svae the move, call function to get the random move.
  String computerMove = getComputerMove(numberGenerator);
  
  public static String getComputerMove(Random numberGenerator) {
  		
  		String computerMove = "";
  		int number = numberGenerator.nextInt(4); //0~4 corresponds 5 moves;
  		//use switch to map the numbers and moves
  		switch(number)
  	      {
  	         case 0 :
  	        	 computerMove = "skadis";
  	        	 break;
  	         case 1 :
  	        	 computerMove = "tjusig";
  	        	 break;
  	         case 2 :
  	        	 computerMove = "klyket";
  	        	 break;
  	         case 3 :
  	        	 computerMove = "hovolm";
  	        	 break;
  	         case 4 :
  	        	 computerMove = "pershult";
  	        	 break;
  	      }
  		return computerMove;
  	}
  ```

  

  - [5 points] The user is asked to enter a move, which may be either Skadis, Tjusig, Klyket, Hovolm, or Pershult. **<u>The program should continue to prompt the user until a valid move is entered</u>**.

  **Hints:** <font color = "red">Similar to what we do in the validation of plaer choice of "y" and "n".</font> But it is more complicated, since there are five moves, so more codes required to check the input string.

  

  - [5 points] Determine the winner

  **Hints:** <font color = "red">Use if statement or switch. Since tie means computer won. So we only need to consider all the scenarios of user won.(five scenarios) </font> 

  - The program prints the computer's move, the user's move, and who is the winner of this round.
  - The user is asked if they'd like to continue.

  <font color="red">See game condition control above </font>

​		

- [4 points] When the user has decided to quit the game, the program prints the number of:

  - rounds played
  - times the user won
  - times the computer won

  **Hints:** <font color = "red">Define one variable to count the game time in each while loop for game condition control. And one variable to count the times of user won.  Print these statistic after user quit the game.</font> 



### 1.2 Something need to be caution

**suggestions**

- [5 points] Make an outline. Make sure that your outline makes sense. Test it out with real input using pencil and paper. Do this *before* you start writing code. Submit your outline as a separate file or within your java file as a comment.

**style**

- [5 points] at least 5 separate functions defined and used
- [5 points] no global variables. Data is passed to and copied from functions
- [5 points] **input from the user is validated.** If the user enters invalid input, he or she should be prompted to re-enter the input until valid input is given. Note that you are not required to handle the problem of the program crashing when a Scanner detects input of the wrong type.
- [4 points] all input entered is echoed back to the user. For example, when the user has entered a move, you'd write back something like, "Your move is Skadis"





