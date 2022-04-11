Outline:
- Assignment 10
- in-lab practice (5points, you should submit today)

# Assignment 10(Apr. 11)

## Structure
- One class for Question Template (I named as QuestionFormat, this is the Parent class)
  - Fields:
    - points
    - difficulty
    - answerSpace
    - questionText
    - **type** (for control the Question type)

  - Methods
    - display():display the questionText with the answerSpace
    - getType(): return the question type
    - getPoints(): return the question points
- Three classes for different type of Questions  (child classes)
  - ObjectiveQuestion
    - add one answer field
    - extends from the Question Template class
    - add one display function and one answer function
  - FillInTheBlankQuestion
    - add one answer field
    - extends from the Question Template class
    - add one display function and one answer function
  - MultipleChoiceQuestion
    - two more fields: answer and possibleAnswers (this is the string list)
    - extends from the Question Template class
    - add one display function and one answer function
- One Test class
  - Two fields: questions[] and totalPoints
  - toString methods: print all the questions

- One test Driver

## QuestionFormat （Generic problem classes）

```java
  //class fields
	private int points;
	private int difficulty;
	private int answerSpace;
	private String questionText;
	private String type;
  
  //constructor
  public QuestionFormat(int points, int difficulty, int answerSpace, 
			String questionText, String type) {
		
		//add the fields
	}
  
  //methods
  //Print the questionText
	public String display() {
		String question = questionText;
		for(int i = 0; i < answerSpace; i++) {
			question = question + '\n';
		}
		return question;
	}
  
  //method for geting points
  
  
  //method for getting question type
  
```

## MultipleChoiceQuestion

- Use one list to save all the possible answers, one string to save the correct answer.

- Use for loop to print all the possible answers when printing the question text.

- Use for loop to print all the possible answers when printint the question text with answer. Leverage the if statement to hightlight the answer in the for loop.

```java
	//fields
	String answer;
	String possibleAnswers[];
	
	//
	public MultipleChoiceQuestion(int points, int difficulty,int answerSpace,
			String questionText, String type, String answer, String possibleAnswers[]) {
		super(points, difficulty, answerSpace, questionText, type);
		this.answer = answer;
		this.possibleAnswers = possibleAnswers;
	}
	
	//methods
	//print question text
	public String display() {
		
		String displayText = super.display() + '\n';
		for(int i = 0; i< possibleAnswers.length; i++) {
			displayText = displayText + (i+1) + ". " + possibleAnswers[i] + '\n';
		}
		
		return displayText;
	}
	
	//print answer
	public String answer() {
		
		String displayText = super.display() + '\n';
		for(int i = 0; i< possibleAnswers.length; i++) {
			if(possibleAnswers[i].equals(this.answer)) {
				displayText = displayText + (i+1)+ ". ****" + possibleAnswers[i] + " ****" + '\n';
			}else {
				
				displayText = displayText + (i+1) + ". " + possibleAnswers[i] + '\n';
				
			}
			
			//displayText = "   " + displayText + possibleAnswers[i] + '\n';
		}
		
		return displayText;
	}

```

## Test class


- Object list to save all the questions

- int variable to save the totalPoints

- For loop to print all the questions
	- use the if statement to call the right question type class fuction 
- For loop to print all the solutions of the questions
	- use the if statement to call the right question type class function

```java
	//fields
	QuestionFormat questions[];
	int totalPoints;
	
	
	//constructor
	public Test(QuestionFormat[] questions, int totalPoints) {
		this.questions = questions;
		this.totalPoints = totalPoints;
		for(int i=0; i< questions.length; i++) {
			totalPoints += questions[i].getPoints();
		}
	}
	
	//methods
	//toString
	public String toString() {
		String displayText = "Please answer the following questions:\n\n";
		
		//display the text of each question
		for(int i =0; i<questions.length; i++) {
			String type = questions[i].getType();
			//print the problem with their types
			if(type.equals("ObjectiveQuestion")) {
				displayText = displayText + ((ObjectiveQuestion)questions[i]).display()
						+ '\n';
				
			}else if(type.equals("MultipleChoiceQuestion")) {
				displayText = displayText + ((MultipleChoiceQuestion)questions[i]).display()
						+ '\n';
			}else if(type.equals("FillInTheBlankQuestion")) {
				displayText = displayText + ((FillinBlankQuestion)questions[i]).display()
						+ '\n';
			}
			
		}
		
		displayText = displayText + "\n-----Following are Answer keys-----\n";
		//display the answer of each question 
		
		.....
		
		
	}



```


## Driver examples

polymorphism

- Add constants min and max difficulty. (we don't need any constraints here, just add them to our objects)
- generate the question objects list

```java

package testPaper;

public class TestDriver {

	//the constants
	static final int MIN_DIFFICULTY = 1;
	static final int MAX_DIFFICULTY = 10;
	
	public static void main(String[] args) {
		
		//generate questions
		ObjectiveQuestion Q1 = new ObjectiveQuestion(
				50, 5, 2, "How many states in US?", 
				"ObjectiveQuestion", "50 States"
				);
		
		FillinBlankQuestion Q2 = new FillinBlankQuestion(
				50, 3, 1, "is the old capital of US.",
				"FillInTheBlankQuestion", "Philadelphia"
				); 
		
		String possibleAnswers[] = {"Bill Gates", "Elon Musk", "Jeff Bezos", "Larry Page"};
		MultipleChoiceQuestion Q3 = new MultipleChoiceQuestion(
				50, 5, 1, "Who is the richest people in the world?",
				"MultipleChoiceQuestion",
				"Elon Musk",
				possibleAnswers
				);
		QuestionFormat questionList[] = new QuestionFormat[3];
		questionList[0] = Q1;
		questionList[1] = Q2;
		questionList[2] = Q3;
		
		//build one quiz
		Test quiz = new Test(questionList, 0);
		System.out.println(quiz.toString());
	
		
	}
	
}


```


