public class StringPractice {
  /* returns true if c is a punctuation mark or false otherwise
   * 
   * Punctuation mark is defined as:
   * apostrophe '
   * comma ,
   * period .
   * semicolon ;
   * colon :
   * exclamation point !
   * question mark ? 
   * 
   * (You don't have to worry about any others)
   */
  public static boolean isPunct(char c) {
	  //1. character comparison: char is wrapped by apostrophes
	  //2. Or operator
	  //3. if-else statement
	  
	  //solution 1:
//	  if (c=='\'' || c == ',' || c == '.' 
//			  || c == ';' || c == ':'
//			  || c == '!' || c == '?' ) {
//		  return true;
//		  
//	  }else {
//		  return false;
//	  }
	  
	  //solution 2:
	  String punctuationMarks = "',.;:!?"; //punctuation marks string
	  int idx = punctuationMarks.indexOf(c);
	  if (idx == -1 ) {
		  return false;
	  }else {
		  return true;
	  }
	  
  }

  /*
   * returns the number of punctuation marks
   * found in s.
   *
   * call your isPunct( ) method. Do not copy and paste
   * the same logic into this function */
  public static int numPunct(String s) {
	  //1. for loop to iterate all the char in String s
	  //2. some functions of String objects of Java: length(), charAt()
	  
	  int count = 0;
	  for (int i =0; i < s.length(); i++) {
		  if(isPunct(s.charAt(i))) {
			  count ++;
		  }
	  }
	  
    return count;
  }
  
  /*
   * returns the number of punctuation marks
   * found in s starting at the given index.
   *
   * call your isPunct( ) method. Do not compy and paste
   * the same logic into this function */
  public static int numPunct(String s, int startIndex) {
	//1. for loop to iterate all the char in String s, 
	  //but start with startIndex
	 //2. some functions of String objects of Java: length(), charAt()
	  
	  int count = 0;
	  for (int i = startIndex; i < s.length(); i++) {
		  if(isPunct(s.charAt(i))) {
			  count ++;
		  }
	  }
	  
    return count;

  }


  /*
   * returns the index of the first punctuation mark in s or
   * -1 if s contains no punctuation marks
   */
  public static int indexOfFirstPunct(String s) {
	  //1. for loop to iterate all the char in String s
	  //2. some functions of String objects of Java: length(), charAt()
	  //3. break for loop when found the first punctuation
	  int index = -1;
	  for (int i =0; i < s.length(); i++) {
		  if(isPunct(s.charAt(i))) {
			  index = i;
			  break; // Found, then break;
		  }
	  }
	  
	  return index;
  }

  /*
   * returns the index of the last occurrence of a punctuation
   * mark in s or -1 if s contains no punctuation
   * 
   * When implementing this function, call your isPunct( ) method.
   * Do not simply copy and paste the body of isPunct( ) into this method.
   */
  public static int indexOfLastPunct(String s) {
	  //1. for loop to iterate all the char in String s
	  //2. some functions of String objects of Java: length(), charAt()
	  //3. Do not break the for loop, i.e., the index will be last Punct
	  int index = -1;
	  for (int i =0; i < s.length(); i++) {
		  if(isPunct(s.charAt(i))) {
			  index = i;
			  //break;
		  }
	  }
	  
	  return index;
  }

  /*
   * returns a new String which is the same as s but with
   * each instance of oldChar replaced with newChar
   */
  public static String substitute(String s, char oldChar, char newChar) {
	  // 1. In Java, strings are immutable, 
	  //which means once a string object is created, 
	  //its content cannot be directly modified.
	  // 2. So create a new String with replaced char
	  // 3. String to char list, char list to String
	  //	toCharArray(), new String()
	  
	  char[] charList = s.toCharArray();
	  for (int i = 0; i < charList.length; i++) {
		  if (charList[i] == oldChar) {
			  charList[i] = newChar;
		  }
	  }
	  return new String(charList);
	  
  }

  /*
   * returns a new String which is the same as s, but
   * with each instance of a punctuation mark replaced
   * with a single space character
   *
   * Use at least one of your other functions in your
   * solution to this.
   *
   */
  public static String substitutePunct(String s) {
	// same as substitute()
	  
	  char[] charList = s.toCharArray();
	  
	  for (int i = 0; i < charList.length; i++) {
		  if (isPunct(charList[i])) {
			  charList[i] = ' ';
		  }
	  }
	  return new String(charList);

  }
  
  /*
   * returns a new String which is the same as s,
   * but with all of the punctuation
   * marks removed.
   *
   * Use at least one of your other functions
   * in your solution to this one.
   * 
   */
  public static String withoutPunct(String s) {
	  // 1. Iterating all the char in string,
	  //  if is not Punctuation, then keep it to a new string
	  // 2. StringBuilder(): create a mutable sequence of characters
	  
	  char[] charList = s.toCharArray();//mutable char sequence
	  StringBuilder sb = new StringBuilder();
	  for (int i = 0; i < charList.length; i++) {
		  if (!isPunct(charList[i])) {
			  sb.append(charList[i]);
		  }
	  }
	  return sb.toString();
  }

  /* returns true if c is found in s or false otherwise */
  public static boolean foundIn(String s, char c) {
	  
	  	char[] charList = s.toCharArray();//string to array
 		
		for (int i = 0; i < charList.length; i++) {
			if (charList[i] == c) {
				return true;
			}		
		}
		return false;
  }

  /*
   * returns the number of times that a punctuation mark
   * immediately follows a character that's not a
   * punctuation mark
   */
  public static int numPunctAfterNonPunct(String s) {
	  // 1. 
	  //example 1: "!!" -> punctuation follows a punctuation -> 0
	  // example 2: "a!" -> punct follows a char not punct -> 1
	  // check each punct and its next char
	  // 2. length control: string length should >=2
	  
	  int count = 0;
	  if (s.length() >= 2) {
		  // index start from 1, since we should check punct follows non-punct
		  for (int i = 1; i < s.length(); i++) {
			  if((isPunct(s.charAt(i)))&&(!isPunct(s.charAt(i - 1)))) {
				  count ++;
			  }
		  }  
	  }
    return count;
  }
  
  /*
   * Returns true of s is comprised of only punctuation or
   * false otherwise
   *
   * Use at least one of your other
   * functions in this one.
   */
  public static boolean onlyPunct(String s) {
	  // all char in s should be punct
	  for (int i = 0; i < s.length(); i++) {
		  if (!isPunct(s.charAt(i))) {
			  return false;
		  }
	  }
	  return true;
  }

  /*
   * Returns true of s contains no punctuation or
   * false otherwise
   *
   * Use at least one of your other
   * functions in this one.
   */
  public static boolean noPunct(String s) {
	  // iterating all the char in s, 
	  // any char in s, isPunct(s.charAt(i)) == True -> return False

	  for (int i = 0; i < s.length(); i++) {
		  if(isPunct(s.charAt(i))) {
			  return false;
		  }
	  }
	  
	  return true;
  }

  /*
   * returns true if s has two punctuation marks
   * right next to each other or false otherwise
   *
   * use at least one of your other methods
   * in your solution to this method
   */
  public static boolean consecutivePuncts(String s) {
	  // s should >= 2
	  // charAt(i) and charAt(i+1) are all punct
	  
	  if (s.length() >= 2) {
		  //starts from 1
		  for (int i = 1; i < s.length(); i++) {
			  if(isPunct(s.charAt(i)) && isPunct(s.charAt(i - 1))) {
				  return true;
			  }
		  }
	  }
	  return false;

  }
}
