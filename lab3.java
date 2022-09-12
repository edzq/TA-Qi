import java.util.Scanner; //import the Scanner Objects

public class Grade {
	
	
	public static Scanner CONSOLE = new Scanner(System.in);//Declare a Public Scanner Object;
	//We can use this public Scanner CONSOLE in all the methods. Otherwise, you could declare the Scanner
	//in each method.
	
	public static void main(String[] args) {
		//Main function is the whole logic of our program. We could define methods out of main function
		//and call it in main function to make our program compact and easy to read.
		System.out.println("This program accepts your homework and two "
		        + "exam scores as input and computes your grade in the course.");
		
		//0. Entering the weight of each component
		//0.1 homework weight
		System.out.println("Homework weight?");
		int hwWeight = CONSOLE.nextInt();
		
		//0.2 exam 1 weight
		System.out.println("Exam 1 weight?");
        int exam1Weight = CONSOLE.nextInt(); 
        
        //0.3 exam 2 weight
        int exam2Weight = 100 - hwWeight - exam1Weight;
        //0.4 Print the weights information
        System.out.println("Using weights " + hwWeight + " " + exam1Weight + " "
                + exam2Weight);
        
        //==================1. For Homework Grade======================================================================
        System.out.println("Homework:");
        
        //Number of assignments/labs; int
        System.out.println("Number of assignments?");        
        int numHW = CONSOLE.nextInt(); 
        
        //Average homework grade; double
        System.out.print("Average homework grade?");
        double hwGrade = CONSOLE.nextDouble();
        
        //Condition B: Bad numeric control for hwGrade, which should belong to [0,10]
        if(hwGrade < 0){                                    //if hw grade is < 0 they receive a 0
            hwGrade = 0;
        }
        else if(hwGrade > 10){                              //if hw grade is > max they receive max points
            hwGrade = 10;
        }
        
        //late days; int
        System.out.println("Number of late days used?");
        int lateDays = CONSOLE.nextInt();
        
        //lab attend times; int
        System.out.println("Labs attended?");
        int labAtt = CONSOLE.nextInt();
        
        //Above code getting all needs information to calculate the homework score.
        //===========================================================================================
		//Then we sent these four variables to one function to calculate the original homework score(total points)
        double totPoints = homeworkCalc( numHW, hwGrade, lateDays, labAtt); //return the original total points of HW
        
        //calculate the weighted Homework score
        double hwWeightedScore = 0; //for saving the weighted homework score
        
        //Condition A: if user enters a negative/zero number of assignments they receive full credit for hw
        if(numHW <= 0){                                         
            totPoints = 100;
            System.out.println("Total points: " + totPoints + " / " + totPoints);
            hwWeightedScore = totPoints / totPoints * hwWeight;
        }
        else{
            System.out.println("Total points: " + totPoints + " / " + (numHW * 10 + numHW * 4));
            hwWeightedScore = totPoints / (numHW * 10 + numHW * 4) * hwWeight;
        }
        System.out.printf("Weighted Score: %.2f\n", hwWeightedScore);
        
        
        
        //================2. Exam 1 grade===========================================================================

        System.out.println("Exam 1:\nScore?"); 
        //declaring and scanning console to get the exam 1 score
        double exam1Score = CONSOLE.nextDouble();
        
        //Condition B for exam1Score
        exam1Score = examConditionB(exam1Score);
        
        //Curve
        System.out.println("Curve?");
        int exam1Curve = CONSOLE.nextInt();
        exam1Score += exam1Curve;
        
        //Condition Execution for if curve brings grade > 100, then set  to 100
        if(exam1Score > 100){                   
            exam1Score = 100;
        }
        
        System.out.println("Total points = " + exam1Score + " / 100");
        
        //Calculating the weightedScoe
        double exam1WeightedScore = exam1Score / 100.0 * exam1Weight; 
        System.out.printf("Weighted score = %.2f\n", exam1WeightedScore);
        
        //================2. Exam 2 grade===========================================================================
        System.out.println("Exam 2:\nScore?"); 
        //declaring and scanning console to get the exam 1 score
        double exam2Score = CONSOLE.nextDouble();
        
        //Condition B for exam1Score
        exam2Score = examConditionB(exam2Score);
        
        //Curve
        System.out.println("Curve?");
        int exam2Curve = CONSOLE.nextInt();
        exam2Score += exam2Curve;
        
        //Condition Execution for if curve brings grade > 100, then set  to 100
        if(exam2Score > 100){                   
            exam2Score = 100;
        }
        
        System.out.println("Total points = " + exam2Score + " / 100");
        
        //Calculating the weightedScoe
        double exam2WeightedScore = exam2Score / 100.0 * exam2Weight; 
        System.out.printf("Weighted score = %.2f\n", exam2WeightedScore);
        
       //================Final grade===========================================================================
	
        double courseGrade = hwWeightedScore + exam1WeightedScore + exam2WeightedScore;
        System.out.printf("Course grade = %.2f", courseGrade);
	}
	
	
	
    public static double homeworkCalc(int numHW, double hwGrade, int lateDays, int labAtt){
    	
    	
        double totPoints = numHW * hwGrade;     //total homework points

        //Condition for late days: late days control the total points
        if(lateDays > (numHW) / 2.0){ //if student used more than half of late days, subtract  10%
        
        	totPoints= totPoints - (0.10)*(totPoints);     
        }
        else if(lateDays == 0){	//if student used no late days, add 5 points to total points
            totPoints = totPoints + 5;                  
        }
        
       //Condition C: total points cannot be greater than the maximum points
        if(totPoints > numHW * 10){ //10 is the maximum points of one assignment
            totPoints = numHW * 10;
        }
        
        //Add the points from labs
        totPoints =  totPoints + (labAtt * 4);

        return totPoints;

    }
    
    public static double examConditionB(double examScore){
    	//Condition B: negative number of exam 1 or exam 2 scores
        if(examScore < 0){                                
            examScore = 0;
        }
        else if(examScore > 100){
            examScore = 100;
        }
        return examScore;
    }
    
    
    
	

}
