package testPaper;

public class TestDriver {

	//define the constants
//	static final int MIN_DIFFICULTY = 1;
//	static final int MAX_DIFFICULTY = 10;
	
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
				50, 5, 1, "Who is the founder of Google?",
				"MultipleChoiceQuestion",
				"Larry Page",
				possibleAnswers
				);
		QuestionFormat questionList[] = new QuestionFormat[3];
		questionList[0] = Q1;
		questionList[1] = Q2;
		questionList[2] = Q3;
		
		//questionList[0]
	
		
		//build one quiz
		Test quiz = new Test(questionList, 0);
		System.out.println(quiz.toString());
		
	}
	
}
