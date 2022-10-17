package arraypractice;

public class ArrayPractice {
  /* sets every item in A[] to initialValue */
  public static void initialize(int A[], int initialValue) {
	  for(int i = 0; i < A.length; i++){
	      A[i] = initialValue;
	    }
  }

  /* returns the average of the items in A
   * Be careful: A[] is an array of **int** and the method returns
   * **double**. What do we do to handle this? */
  public static double average(int A[]) {
	  double sum = 0.0;
	  double average = 0.0;
	  int count = 0;
	  
	  if(A.length == 0) {
		  return -1.0;
	  }
	  else {
		  for (int i = 0; i< A.length; i++) {
			  sum += A[i];
			  count ++;
		  }
		  
		  //cal the Average
		  average = sum/count;
		  return average;
	  }
  }

  /* returns the number of times that x appears in A[] */
  public static int numOccurrences(int A[], int x) {
	  
	  int count = 0;
	    for(int i = 0; i < A.length; i++){
	      if(A[i] == x){
	        count++;
	      }
	    }
	    return count;
	  
  }


  /* returns the index of the first occurrence of
   * x in A[] or -1 if x doesn't exist in A[] */
  public static int find(int A[], int x) {
	  
	  for(int i = 0; i < A.length; i++){
	      if(A[i] == x){
	        return i;
	      }

	    }
	    return -1;
  }

  /* Returns the index of the first occurrence of
   * item within the first n elements of A[] or -1
   * if item is not among the first n elements of A[] */
  public static int findN(int A[], int item, int n) {
	  // check the length of n whether contain item, if existing,
	  // return the first index, otherwise return -1
	  
	  int count = 0;
	    for(int i = 0; i < n - 1; i++){
	      if(A[i] == item){
	        return i;
	      }
	    }
	    return -1;
  }

  /* returns the index of the last occurrence of
   * x in A[] or -1 if x doesn't exist in A[] */
  public static int findLast(int A[], int x) {
	  
	  int count = 0;
	    for(int i = A.length - 1; i >= 0; i--){
	      if(A[i] == x){
	        return i;
	      }
	    }
	    return -1;
	  
    //return -1;
  }

  /* returns the largest item found in A */
  public static int largest(int A[]) {
	  
	  int largest = -1000; //temporary variable to save the largest one
	    for(int i = 0; i < A.length; i++){
	      if(A[i] > largest){
	        largest = A[i];
	      }
	    }

	    return largest;
  }

  /* returns the index of the largest item found in A */
  public static int indexOfLargest(int A[]) {
	  
	  int largest = -1000;
	  
	  //find the largest element
	    for(int i = 0; i < A.length; i++){
	      if(A[i] > largest){
	        largest = A[i];
	      }
	    }

	    //find the index of the largest element
	    for(int i = 0; i < A.length; i++){
	      if(A[i] == largest){
	        return i;
	      }
	    }
	    return -1;
  }

  /* returns the index of the largest odd number
   * in A[] or -1 if A[] contains no odd numbers */
  public static int indexOfLargestOdd(int A[]) {
	  
	  int largest = -1000;
	  
	  //find the largest odd number
	    for(int i = 0; i < A.length; i++){
	      if(A[i] % 2 == 1 && A[i] > largest){
	        largest = A[i];
	      }
	    }

	    //get the index
	    for(int i = 0; i < A.length; i++){
	      if(A[i] == largest){
	        return i;
	      }
	    }
	    return -1;
  }

  /* inserts n into A[] at A[index] shifting all */
  /*  the previous items one place to the right. For example */
  /*  if A is  */
  /*   |---+---+---+---+---+---+---+---+---+---| */
  /*   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
  /*   |---+---+---+---+---+---+---+---+---+---| */
  /*   | 5 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | 0 | */
  /*   |---+---+---+---+---+---+---+---+---+---| */

  /*   and we call insert(A, 15, 1), A then becomes */

  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*   | 0 |  1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*   | 5 | 15 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | */
  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*  the element in A[] that's in the right-most */
  /*    position is removed.                      */
  /*                                              */
  /*  if index < 0 or index >= A.length-1, the method */
  /*                                    does nothing */
  public static void insert(int A[], int n, int index) {
	  if (index < 0) {
	      return;
	    }
	    int temp = 0;
	    int temp2 = 0;
	    for(int i = 0; i < A.length; i++){
	      if(index == i){
	        temp = A[i];
	        A[i] = n;
	        
	        //shifting all the elements one place to right
	        for(int j = i+1; j < A.length; j++){
	          temp2 = A[j];
	          A[j] = temp;
	          temp = temp2;
	        }
	      }
	    }
	    return;
  }

  /* returns a **new array** consisting of all of the
   * elements of A[] */
  public static int[] copy(int A[]) {
	  int[] B = new int[A.length];
	  
	    for(int i = 0; i < A.length; i++){
	      B[i] = A[i];
	    }
	    return B;

  }

  /* Returns a new array consisting of all of the
     first n elements of A[]. If n>A.length, returns a
     new array of size n, with the first A.length elements
     exactly the same as A, and the remaining n-A.length elements
     set to 0. If n<=0, returns null. */
  public static int[] copyN(int A[], int n) {
	  
	  int[] B;
	    if(n <= 0){
	      return null;
	    }
	    else{
	      B = new int[n];
	    }

	  System.out.println(B.length);
	    if(A.length < n) {
	      for (int i = 0; i < A.length; i++) {
	        B[i] = A[i];
	      }
	    }
	    else {
	    	for(int i = 0; i < n; i++){
		        B[i] = A[i];
		      }
	    }
	      
	      System.out.println(B.length);
	      System.out.println(B.length);


	    return B;
  }

  /* returns a new array consisting of all of the
   * elements of A[] followed by all of the
   * elements of B[]. For example, if 
   A[] is: {10,20,30} and 
   B[] is: {5, 9, 38}, the method returns the
   array : {10,20,30,5,9,38} */
  public static int[] copyAll(int A[], int B[]) {
	  int[] C = new int[A.length + B.length];

	    for(int i = 0; i < C.length; i++){
	      if(i <= A.length -1){
	        C[i] = A[i];
	      }
	      else {
	    	  C[i] = B[i - A.length];
	      }
	    }
	    return C;
  }

  /* reverses the order of the elements in A[].
   * For example, if A[] is:
   {10,20,30,40,50}, after the method, A[] would
   be {50,40,30,20,10} */
  public static void reverse(int A[]) {
	  int temp = 0;
	    for(int i = 0; i < A.length / 2; i++){
	      temp = A[i];
	      A[i] = A[A.length - i - 1];
	      A[A.length - i - 1] = temp;
	    }
  }

  /* Extra credit:
   *
   * Returns a new array consisting of all of the
   * elements of A, but with no duplicates. For example,
   * if A[] is {10,20,5,32,5,10,9,32,8}, the method returns
   * the array {10,20,5,32,9,8} */
  public static int[] uniques(int A[]) {
	  //===================================================Find length of B
	    int count = 0;
	    for(int i = 0; i < A.length; i++){
	      for(int j = i+1; j < A.length; j++){  //check if A[i] is equal to next index
	        if( A[i] == A[j]){
	          count++;          //This will be subtracted from A.length to find the new array length
	          System.out.println("i: " + i + " j: " + j);
	          break;            //This breaks out of the inner loop if there is a double to avoid subtracting
	        }                   //too many digits from new array

	      }
	    }
	    System.out.println(count);
	    int[] B;
	    if(count != A.length){          //if count is equal to length it will return a null array
	      B = new int[A.length - count];//instead of a single member array (e.g. {30,30,30} returns null
	    }
	    else
	      B = new int[1];   //In that case we return an array with 1 element

	//===========================================================================build new array

	    int index = 0;      //This keeps track of what index we want to place the next non repetitive element at
	    for(int i = 0; i < A.length; i++){
	      int j = 0;   //keeps track of how many doubles there are
	      for(j = 0; j < i; j++){
	        if( A[i] == A[j]){
	        break;       //if there is a double increment dubs
	        }
	      }
	      if(i == j){  //if dubs == 0 we place the element of A at i into the next index of B
	        B[index] = A[i];
	        index++;      //move on to next index of B
	      }
	    }
	    return B;
  }

  public static void main(String[] args) {
    return;
  }
}
