package testPaper;
public class QuestionFormat {
	
	
	//class fields
	private int points;
	private int difficulty;
	private int answerSpace;
	private String questionText;
	private String type;
	
	//Constructor
	public QuestionFormat(int points, int difficulty, int answerSpace, 
			String questionText, String type) {
		this.points = points;
		this.difficulty = difficulty;
		this.answerSpace = answerSpace;
		this.questionText = questionText;
		this.type = type;
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
	
	//get points
	public int getPoints() {
		return this.points;
	}
	
	//get question type
	public String getType() {
		return this.type;
	}
	

}
