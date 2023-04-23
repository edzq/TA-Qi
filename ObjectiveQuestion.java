package testPaper;


public class ObjectiveQuestion extends QuestionFormat {

	private String answer;
	
	public ObjectiveQuestion(int points, int difficulty,int answerSpace,
			String questionText, String type, String answer) {
		super(points, difficulty, answerSpace, questionText, type);
		this.answer = answer;
	}
	
	//toString
	public String display() {
		return super.display() + '\n';
	}
	
	//answer
	public String answer() {
		return super.display() + '\n' + this.answer + '\n';
	}
	
}

