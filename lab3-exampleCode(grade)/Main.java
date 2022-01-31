//import this package then you can use Scanner
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // create scanner to grab input values
        Scanner console = new Scanner(System.in);
        System.out.print("Homework weight? ");  //prompt for hw weight
        int HM_WEIGHT =  console.nextInt();
        System.out.print("Exam 1 weight? ");
        int EXAM1_WEIGHT = console.nextInt();
        int EXAM2_WEIGHT = 100 - HM_WEIGHT - EXAM1_WEIGHT;
        //You need get the EXAM2_WEIGHT follow here
        System.out.println("Using weight of "+ HM_WEIGHT +" " + EXAM1_WEIGHT +" " + EXAM2_WEIGHT);

        //function 1 to calculate the homework score
        double weighted_hw_score = getHomeworkScore(console, HM_WEIGHT);



        //System.out.println("The homework weight: " + HM_WEIGHT);
    }

    public static double getHomeworkScore(Scanner console, int HM_WEIGHT){
        System.out.println("Homework: ");
        System.out.print("Number of assignments? ");
        int numHomework = console.nextInt();
        System.out.print("Average Homework grade?");
        double avg_hw_grade = console.nextDouble();
        System.out.print("Number of late days used? ");
        int numLate = console.nextInt();
        System.out.print("Labs attended? ");
        int numLab = console.nextInt();

        //calculate hm full score
        int full_hm_score = numHomework * 10 + numHomework * 4;

        //calculate hm total score
        double total_hm_score = numHomework * avg_hw_grade + numLab * 4;

        //Check the late days
        if(numLate > (numHomework / 2)){
            total_hm_score = total_hm_score * (1 - 0.1);
        }

        //no late days
        if (numLate == 0){
            total_hm_score = total_hm_score + 5;
        }

        //check whether the total score greater than full score
        if (total_hm_score > full_hm_score){
            total_hm_score = full_hm_score;
        }

        //get two decimal spaces
        total_hm_score = roundNumber(total_hm_score);

        //calculate weighted score
        double hm_weight_score = roundNumber(total_hm_score / full_hm_score * HM_WEIGHT);

        System.out.println("Total points = " + total_hm_score + " / " + full_hm_score);
        System.out.println("Weighted score = " + hm_weight_score);


        return hm_weight_score;

    }

    // Method to round scores to two decimal places
    public static double roundNumber(double number) {
        return (Math.round(number * 100)) / 100.00;
    }
}
