package arraypractice;

/**
 *
 * @author jfiore
 */
public class ArrayPractice {
  /* sets every item in A[] to initialValue */
  public static void initialize(int A[], int initialValue) {
	  // For loop to assign values to an array
	  for (int i = 0; i < A.length; i++) {
			A[i] = initialValue;
		}
  }

  /* returns the average of the items in A
   * Be careful: A[] is an array of int and the method returns
   * double. What do we do to handle this? */
  public static double average(int A[]) {
	  // double variable to store the average
	  double sum = 0.0; 
	  double average = 0.0;
	  int count = 0; //count how many items we have 
	  
	  	for (int i=0; i<A.length; i++) {
	  		
	  		sum += A[i];
	  		count ++;
	  		
	  	}
	  	
	  	average = sum/count;
	  	return average;
  }

  /* returns the number of times that x appears in A[] */
  public static int numOccurrences(int A[], int x) {
	  
	  int x_appear = 0; //counter for x
	  
	  for(int i =0; i<A.length; i++) {
		  
		  	if(A[i] == x) {
		  		x_appear ++;
		  	}
	  }
    return x_appear;
  }


  /* returns the index of the first occurrence of
   * x in A[] or -1 if x doesn't exist in A[] */
  public static int find(int A[], int x) {
	  
	  for(int i =0; i<A.length; i++) {
		  
		  	if(A[i] == x) {
		  		return i; // Find the 1st item = X and return its index i
		  	}
	  }

	  return -1; //x doesn't exist in A[]
  
  }

  /* returns the index of the last occurrence of
   * x in A[] or -1 if x doesn't exist in A[] */
  public static int findLast(int A[], int x) {
	//scan the Array A from the last one to the first one
	  
	  for (int i = A.length -1; i >=0 ; i--) {
		  if(A[i] == x) {
			  return i;
		  }
	  }
	  
    return -1;
  }

  /* returns the largest item found in A */
  public static int largest(int A[]) {
	  
	  int largest = -1000; //Temporary varibale to save the largest one
	  
	  for (int i=0; i<A.length ; i ++) {
		  if(A[i] > largest) {
			  largest = A[i]; //Do a value exchange. A[i]=>largest 
		  }
	  }

    return largest;
  }

  /* returns the index of the largest item found in A */
  public static int indexOfLargest(int A[]) {
	  
	  int largest = -1000; //Temporary varibale to save the largest one
	  
	  for (int i=0; i<A.length ; i ++) {
		  if(A[i] > largest) {
			  largest = A[i]; //Do a value exchange. A[i]=>largest 
		  }
	  }
	  
	  for (int i=0; i<A.length ; i ++) {
		  if(A[i] == largest) {
			  return i;
		  }
	  }
    return -1;
  }

  /* returns true if x is odd or false otherwise
   * add a JUnit test to test this method in the
   * file ArrayPracticeTest.java  */
  public static boolean isOdd(int x) {
	  if (x%2 == 1) {
		  return true;
	  }
    return false;
  }
  
  /* returns the index of the largest odd number
   * in A[] or -1 if A[] contains no odd numbers
   *
   * include a call to your isOdd(int) method in
   * your solution */
  public static int indexOfLargestOdd(int A[]) {
	  
	  int largest = -1001; //Temporary varibale to save the largest one
	  
	  for (int i=0; i<A.length ; i ++) {
		  if( isOdd(A[i]) &&  A[i] > largest) {
			  largest = A[i]; //Do a value exchange. A[i]=>largest 
		  }
	  }
	  
	  for (int i=0; i<A.length ; i ++) {
		  if(A[i] == largest) {
			  return i;
		  }
	  }
    return -1;
  }

  /* inserts n into A[] at A[index] shifting all */
  /* the previous items one place to the right. For example */
  /* if A is  */
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
	  
	  // index <0 or > A.length -1 , return null
	  if(index < 0 || index >= (A.length - 1)) {
		  return ;
	  }
	  
	// one kind of solution is using tempe value to do value
	  // exchanging
	  int temp = 0; // temporary value for insert one value exchange/ value exchange 
	  int temp2 = 0; //temporary value for value exchange
	  
	  for (int i = 0; i<A.length; i++) {
		  
		  if(index == i) { //find the value with index "index"
			  temp = A[i]; //save it for value exchange;
			  A[i] = n; //insert the n to the place "index"
			  
			  for(int j = i+1; j<A.length; j++ ) {
				  temp2 = A[j]; // save current item's value temporary for exchange in next for pass
				  A[j] = temp; //previous value
				  temp = temp2; //save the current one for next for pass
			  }
			  
		  }  
	  }
  }

  /* returns a new array consisting of all of the
   * elements of A[] followed by all of the
   * elements of B[]. For example, if 
   A[] is: {10,20,30} and 
   B[] is: {5, 9, 38}, the method returns the
   array : {10,20,30,5,9,38} */
  public static int[] copyAll(int A[], int B[]) {
	  
	  int[] C = new int[A.length + B.length];
	  
	  for(int i = 0; i<C.length; i++) {
		  if (i <= A.length - 1) {
			  C[i] = A[i];
		  }
		  else {
			  C[i] = B[i - A.length]; //get the value of item in B and assign to C
		  }
		  
	  }
	  return C;
  }

  /* exchanges the elements found at A[i] and A[j].
   * Does nothing if i or j is invalid
   *
   * Add a JUnit test to test this method to the
   * file ArrayPracticeTest.java */
  public static void swap(int []A, int i, int j) {
	  
	  //eg: A = [1,2,3,4,5,6]
	  // swap(A, 2, 4), return A = [1,2,5,4,3,6]
	  
	  // 1. check invalid by if-statement
	  //  i,i in [0,A.length - 1]
	  if ( i >= 0 && i < A.length && j >= 0  && j< A.length)  {
		  
		  int temp = A[i];
		  A[i] = A[j];
		  A[j] = temp;

	  }
  }
  
  /* reverses the order of the elements in A[].
   * For example, if A[] is:
   {10,20,30,40,50}, after the method, A[] would
   be {50,40,30,20,10}
   * 
   * use your swap() method in your solution
   *
   * Note that this method sorts the array "in place", i.e.,
   * the original array is changed. No new array is created.
   */
  public static void reverse(int A[]) {
	  // reverse means the value on index should be changed to
	  // value on A.length - index, where index in [0, A.length/2]
	  
	  for (int i = 0; i < A.length/2; i++) {
		  swap(A, i, A.length - 1 - i); 
	  }
  }
  
  /* returns the specified column from [][]A as a single-dimensional
   * array, or null if colNum is invalid.
   *
   * for example, if A is
   * |---+----+----+----+----|
   * |   |  0 |  1 |  2 |  3 |
   * |---+----+----+----+----|
   * | 0 | 10 | 20 | 30 | 40 |
   * | 1 | 11 | 21 | 31 | 41 |
   * | 2 | 12 | 22 | 32 | 42 |
   * |---+----+----+----+----|
   *
   * and colNum is 1, the array returned is:
   *
   * |----+----+----|
   * |  0 |  1 |  2 |
   * |----+----+----|
   * | 20 | 21 | 22 |
   * |----+----+----|
   *
   * Extra credit: add a JUnit test for this method
   * to the file ArrayPracticeTest.java
   */
  public static int[] getCol(int [][]A, int colNum) {
	  
	  // 2 dimensional array: row, column
	  int row = A.length; // row num
	  int col = A[0].length; // column num
	  
	  // new array obj to store the target column values
	  int colValues[] = new int[row];
	  
	  //check colNum is valid
	  if (colNum < col) {
		  // for loop to get all the values in specific column
		  // then the index of loop is row
		  for (int i = 0 ; i < A.length ; i++ ) {
			  colValues[i] = A[i][colNum];
		  }
		  return colValues;
	  }
	  return null;
  }
}
