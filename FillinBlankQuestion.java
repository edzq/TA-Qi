package testPaper;

public class FillinBlankQuestion extends QuestionFormat{
	
	//add answer fields
	private String answer;
	
	public FillinBlankQuestion(int points, int difficulty,int answerSpace,
			String questionText, String type, String answer) {
		super(points, difficulty, answerSpace, questionText, type);
		this.answer = answer;
	}
	
	//toString
	public String display() {
		return "_______" + super.display() + '\n';
	}
	
	//answer
	public String answer() {
		
		return "__" + this.answer + "__" + super.display() + '\n';
	}

}
