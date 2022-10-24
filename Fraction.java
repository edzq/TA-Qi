
public class Fraction {
	
	//Attributes
	int num;
	int denom;
	
	 //Constructor initial with values
	public Fraction(int num, int denom){  //Constructor with values passed
	    if(denom == 0){
	      throw new ArithmeticException("Nooop, denominator cannot be 0!!!");
	    }
	    this.num = num;
	    this.denom = denom;
	    findGCD(this);//Fraction should be saved as reduced form
	  }
	
	//Constructor initial without values
	public Fraction(){  //Constructor initial 0
	    this.num = 0;
	    this.denom = 0;
	  }
	
	public int getNum(){
	    return num;
	  }
	  
	public int getDenom() {
	    return denom;
	  }
	
	public void setNum(int num){
	    this.num = num; //Sets the numerator field to the value given in n
	  }
	
	 public void setDenom(int denom){
	//Sets the denominator field to the value given in d	 
		    if(denom == 0){
		      throw new ArithmeticException("Nooop, denominator cannot be 0!!!");
			    
		    }
		    this.denom = denom;
		  }
	
	 //Fraction(3,4)).add(new Fraction(1,4))
	 public Fraction add(Fraction a){

		    Fraction b = new Fraction();
		    b.num = this.num * a.denom + a.num*this.denom;
		    b.denom = this.denom * a.denom;
		    findGCD(b);
		    return b;
		  }
	
	 //Greatest common divisor function to reduce the form of Fraction
	 public void findGCD(Fraction x){
		    int r = -1; //Remainder
		    int gcd = 0;
		    int a = x.num, b = x.denom;

		    if(a < b){
		      swap(a,b);
		    }
		      while(r != 0){
		        r = a % b; //Remainder
		        a = b;
		        if(r == 0){
		          gcd = b;
		        }
		        b = r;

		      }
		      if(gcd == 0){
		        throw new ArithmeticException("nooop!");
		      }
		      x.num = x.num / gcd;
		      x.denom = x.denom / gcd;
		  }
	 
	 public void swap(int x, int y){
		    int temp = x;
		    x = y;
		    y = temp;
		  }
	 
	 public boolean equals(Fraction a){
		    if(this.num == a.num && this.denom == a.denom){
		      return true;
		    }
		    else
		      return false;
		  }
	
	 public String toString(){
		    return num + " / " + denom;
		  }

}
