package testPaper;

public class Test {

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
	
	
	public String toString() {
		String displayText = "Please answer the following questions:\n\n";
		
		//display the text of each question
		for(int i =0; i<questions.length; i++) {
			String type = questions[i].getType();
			//print the problem with their types
			if(type.equals("ObjectiveQuestion")) {
				// type cast current question obj as the objectiveQuestion
				// then the display is specific to objectiveQuestion
				displayText = displayText + ((ObjectiveQuestion)questions[i]).display()
						+ '\n';
				// So this is a type cast, which means the code is explicitly 
				// converting the type of the object at questions[i] to MultipleChoiceQuestion.
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
		for(int i =0; i<questions.length; i++) {
			String type = questions[i].getType();
			//print the problem with their types
			if(type.equals("ObjectiveQuestion")) {
				displayText = displayText + ((ObjectiveQuestion)questions[i]).answer()
						+ '\n';
				
			}else if(type.equals("MultipleChoiceQuestion")) {
				displayText = displayText + ((MultipleChoiceQuestion)questions[i]).answer()
						+ '\n';
			}else if(type.equals("FillInTheBlankQuestion")) {
				displayText = displayText + ((FillinBlankQuestion)questions[i]).answer()
						+ '\n';
			}
			
		}
		
		return displayText;
	}
	
}
