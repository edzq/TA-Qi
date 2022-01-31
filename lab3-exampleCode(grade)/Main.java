//import this package then you can use Scanner
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // create scanner to grab input values
        Scanner console = new Scanner(System.in);

        //prompt for wight input
        System.out.print("Homework weight? ");  //prompt for hw weight
        final int HM_WEIGHT =  console.nextInt();
        System.out.print("Exam 1 weight? ");
        final int EXAM1_WEIGHT = console.nextInt();
        final int EXAM2_WEIGHT = 100 - HM_WEIGHT - EXAM1_WEIGHT;
        //You need get the EXAM2_WEIGHT follow here
        System.out.println("Using weight of "+ HM_WEIGHT +" " + EXAM1_WEIGHT +" " + EXAM2_WEIGHT);


        //function 1 to calculate the homework score
        //prompt for homework related variable input
        System.out.println("Homework:");
        System.out.print("Number of assignments? ");
        int numberOfAssignments = console.nextInt();
        System.out.print("Average Homework grade? ");
        float averageHomeworkGrade = console.nextFloat();
        System.out.print("Number of late days used? ");
        int numberOfLateDays = console.nextInt();
        System.out.print("Labs attended? ");
        int labsAttended = console.nextInt();

        //first function of calculate the homework grading
        float totalPoints = calcAssignmentsGrade(
                numberOfAssignments,
                averageHomeworkGrade,
                labsAttended,
                numberOfLateDays
        );

        float maxPoints = numberOfAssignments * (10 + 4);
        System.out.println("Total points = " + totalPoints + "/" + maxPoints);
        float weightedScore = totalPoints / maxPoints * HM_WEIGHT;
        System.out.println("Weighted score: " + String.format("%.2f", weightedScore));


    }

    private static float calcAssignmentsGrade(int numberOfAssignments,
                                              float averageHomeworkGrade, int labsAttended, int numberOfLateDays) {

        //correct bad numeric values entered by the user
        if (averageHomeworkGrade <= 0) {
            averageHomeworkGrade = 0;
        }
        else if (averageHomeworkGrade > 10) {
            averageHomeworkGrade = 10;
        }

        //calculate totalPoints and maxPoints.
        float totalPoints = numberOfAssignments * averageHomeworkGrade + labsAttended * 4;
        float maxPoints = numberOfAssignments * (10+4);


        //the late days.
        if (numberOfLateDays > numberOfAssignments / 2) {
            totalPoints *= 0.9;  //*= means totalPoints = totalPoints * 0.9
        }
        else if (numberOfLateDays == 0) {
            totalPoints += 5;

            // possiblePoints cannot greater than totalPoints
            if (totalPoints > maxPoints)
                totalPoints = maxPoints;
        }

        //correct bad numeric values entered by the user
        //valuable check, numberOfAssignments is negative or zero => get total points
        if (numberOfAssignments <= 0) {
            totalPoints = maxPoints;
        }

        return totalPoints;
    }

}