package daytwo;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//operaters (to perform different type of operations)
	  	//unary operator
		 //increment operator(++)
	     //  -post increment(a++)       -pre increment(++a)	
		int a=10;
		int b=20;
		int x=10;
		
		System.out.println("A and B value before"+a +" "+b);
		
		++a;
		int c=  ++a +b+a--;
		System.out.println("c value after"+c);
		
		int d=c++ +a + b--;
		System.out.println("d value after"+d);
		   
	}

}
