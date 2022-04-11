# Assignment 10(Apr. 11)

Structure
- One Question Template class (I named as QuestionFormat, this is the Parent class)
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
