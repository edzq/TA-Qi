import java.io.*; //library for file processing 
import java.util.Scanner; //library for scanner
public class Webify {

	public static Scanner CONSOLE = new Scanner(System.in);//Declare a Public Scanner Object
	   
	public static void main(String[] args) throws FileNotFoundException {
		
		//User enter the name of an input file which ends ".txt"
//================= Scan Console to get file Name or Path =====================
		System.out.println("Please input the file name?");
        String fileName = CONSOLE.nextLine(); //Line-based Scanners
        String fileNameWithoutSuffix = fileName.substring(0, fileName.length()-4); // file name without suffix
        System.out.println(fileNameWithoutSuffix);
        
        String htmlFileName = fileNameWithoutSuffix + ".html";
		
        //Scan the input file
        Scanner input = new Scanner(new File(fileName)); //input file
        PrintStream out = new PrintStream(new File(htmlFileName)); //output file
        
//================= Begin Rule Processing ===================== 
        
        //Declare some String variables for rule detecting
        String h1Start = "_"; //for rule 2
        String listItemStart = "-"; //for rule 4
    	
        
    	//the beginning of html file
        out.println("<html>");
        out.println("<body>");
        
        //To control the list item block
        boolean lastIsList = false;
        boolean firstListLine = true;
        
        // ==== processing text line by line ====
        while (input.hasNextLine()) {
        	String line = input.nextLine(); //Get one line text
        	
        	//=== for list item block ending ===
        	//If the lastIsList == true, we should check current line is list or not
        	//If current line is not list, we should add the list item block ending tag </ul>
        	if (lastIsList == true) {
        		if (!line.startsWith(listItemStart)) {
        			out.println("</ul>");
        			lastIsList = false; //switch the lastIsList as false, since current line is not list
        			firstListLine = true; //switch the firstListLine as true, since any following line is list, it is the first list line of that list item block
        		}
        	}
        	
        	//=== check which rule we should use  ===
        	//=== Rule 3 blank line ===
        	if(line.length() == 0) { //string length = 0, blank line
        		out.println("<p>");
        	}// else matching the rule by using startsWith()
        	else {
        		
        		//=== Rule 2: underscores to H1 Tag
        		if(line.startsWith(h1Start)) {
        			//get substring
        			String content = line.substring(1, line.length()-1);
        			
        			//=== Rule 5: check URL
        			String newContent = urlCheck(content);
        			
        			//Finishing rule 2 processing
        			out.println("<h1>"+newContent+"</h1>");
        		}
        		//== Rule 4: List items
        		else if(line.startsWith(listItemStart)) {
        			
        			//Switch lastIsList==true, so when we scan next we know last line is list
        			lastIsList = true;
        			
        			//If this is first list Line, we should add the list time block tag <ul>
            		if (firstListLine == true) {
            			out.println("<ul>");
            			firstListLine = false; //after we add the tag, switch the firstListLine to false
            		}
            		
            		//get substring
        			String content = line.substring(1, line.length());
        			
        			//check whether subString contain url
        			String newContent = urlCheck(content);
        			
        			out.println("<li>"+newContent+"</li>");
        			
        		}
        		else {
        			
        			//check whether subString contain url
        			String newContent = urlCheck(line);
        			
        			out.println(newContent+"<br />");
        		}
        	}
        	
        }
        
        //if the last line is list item, we should add </ul>
        if (lastIsList == true) {
        	out.println("</ul>");
        }

      //the ending of the html file 
        out.println("</body>");
        out.println("</html>");

//        String originalUrl = "The [[http://www.cis.temple.edu/~jfiore/2022/fall/1068][class]] of this semester";
//        System.out.println(originalUrl); 
//        String urlText = urlCheck(originalUrl);
//        System.out.println(urlText); 
        
	}
	
    //function for rule 5, url checking for each line content
    public static String urlCheck(String content) {
    	String script = ""; //return line html text
    	String urlStart = "[["; //url startsWith sign
    	String urlEnd = "]]"; //url endsWith sign
    	
    	Scanner lineScan = new Scanner(content);
    	
    	while (lineScan.hasNext()) {
    		String word = lineScan.next();//get each word of the line content
    		
    		//if one word startsWith [[ and endsWith ]], it is url
    		if(word.startsWith(urlStart)&&word.endsWith(urlEnd)) {
    			//remove the [[ and ]]
    			String sub_word = word.substring(2, word.length()-2);
    			
    			
    			String X = sub_word.substring(0, sub_word.indexOf("]"));//get X
    			String Y = sub_word.substring(sub_word.indexOf("[")+1);//get Y
    			
    			String finalUrl = "<a href=\"" + X + "\">" + Y + "</a>";//convert to hyperlink
    			script += finalUrl + "\s";//add whitespace for each word
    		}
    		else {
    			script += word + "\s";//add whitespace for each word
    		}
    	}
    	
    	return script.substring(0,script.length()-1);//remove the final character, since we have one more whitespace
    }
    
}
