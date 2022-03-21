import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


//Outline Today:
//1. Work in groups of up to 5 people to implement all the function in the assignment "March 21, in-lab exercise". 
//2. Go through the assignment
//3. Lab Quiz

public class practice {

	public static void main(String[] args) throws FileNotFoundException {
		//FileNotfoundException: Signals that an attempt to open the file denoted by a specified pathname has failed.
		
		//prompts
		System.out.println("Please enter the file name:");
		Scanner console = new Scanner(System.in);
		String fileName = console.nextLine();
		
		System.out.println(consonantWord(fileName));
		
		//System.out.println(numOfConsonant("Zhang"));
		
	}
	
	//function 1--vowel
	public static boolean isVowel(char c) {
		
		//solution 1
		
//		return c=='a'||c=='e'||  c == 'i' ||
//				c == 'o' || c == 'u' || c == 'A' ||
//				c == 'E' || c == 'I' || c == 'O' ||
//				c == 'U' ;
		 
		//solution 2
		 String vowelString = "aeiouAEIOU";
		 return vowelString.indexOf(c) != -1;  // if return is not equal -1--> True --> means c is in the string --> c is vowel 
	}
	
	//function 2--consonant
	public static boolean isConsonant(char c) {
		 
		String vowelString = "aeiouAEIOU";
		 
		 return vowelString.indexOf(c) == -1;  //return is equal -1 --> True --> means c is not in the string --> c is consonant
	}
	
	//function 3-numOfConsonant
	public static int numOfConsonant(String s) {
		
		int numConsonant = 0;  //one variable to save the number of consonant.
		
		char[] string_array = s.toCharArray();  //convert the string to array.
		
		  for (int i = string_array.length -1; i>= 0; i--) {
			  
			  if (isConsonant(string_array[i])) {
				  numConsonant += 1;
			  }
		  }
		  
		return numConsonant;
		
	}
	
	//function 4 fileRead and check consonant, return the word contains most consonant
	public static String consonantWord(String fileName) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File(fileName));
		
        String mostConsonantWord = "NO CONSONANTS"; //return variable, default value set as "NO CONSONANTS"
        
        int mostNumConsonant = 0; //temporary value, to save the number of consonant of that word. 
        
        //hasNextLine: return true if exist one line in the file
        //nextLine: return the whole line.....
        //hasNext : return if that if exist one token(word)
        //next() : return one token(word)
        while (input.hasNextLine()){
        	
            String line = input.nextLine();
            Scanner lineScanner = new Scanner(line);  // declare one new scanner for that line

            while (lineScanner.hasNext()){
                String word = lineScanner.next();  //declare one new string variable to save the word
                
                int numConsonant = numOfConsonant(word);  //call numOfConsonant to get the number of Consonan in that word
                
                //check if the word contains most consonants.
                if(numConsonant > mostNumConsonant) {
                	mostConsonantWord = word;
                	mostNumConsonant = numConsonant;
                }
            }
        }
        return mostConsonantWord;
	}
	
	
	

}
