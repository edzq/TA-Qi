package testPaper;

public class MultipleChoiceQuestion extends QuestionFormat{
	
	private String answer;
	private String possibleAnswers[];
	
	
	public MultipleChoiceQuestion(int points, int difficulty,int answerSpace,
			String questionText, String type, String answer, String possibleAnswers[]) {
		super(points, difficulty, answerSpace, questionText, type);
		this.answer = answer;
		this.possibleAnswers = possibleAnswers;
	}
	
	//display
	public String display() {
		
		String displayText = super.display() + '\n';
		
		for(int i = 0; i< possibleAnswers.length; i++) {
			displayText = displayText + (i+1) + ". " + possibleAnswers[i] + '\n';
		}
		
		return displayText;
	}
	 
	//answer
	public String answer() {
		
		String displayText = super.display() + '\n';
		for(int i = 0; i< possibleAnswers.length; i++) {
			if(possibleAnswers[i].equals(this.answer)) {
				displayText = displayText + (i+1)+ ". **** " + possibleAnswers[i] + " ****" + '\n';
			}else {
				
				displayText = displayText + (i+1) + ". " + possibleAnswers[i] + '\n';
				
			}
			
			//displayText = "   " + displayText + possibleAnswers[i] + '\n';
		}
		
		return displayText;
	}
	
	
	
	

}
