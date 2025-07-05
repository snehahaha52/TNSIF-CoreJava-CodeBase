package FinalKeyword;

public class Final {

	public static void main(String[] args) {
		//final x; //final instatnce variable must be declarzed
		
		final int x=100;
		
		//declare a static blank final variable
		final int y;
		 
		//declare and intialize static blank final var
		final int z=10;
		
		//instance method 
	     void change()
		{
			 //a=20;
			 //x=30;
			 //z=50;
		}
		
	}

	@Override
	public String toString() {
		return "FinalVariable [x=\" + x + \", y=\" + y + \"]";
	}
	
	//static
	static {
		 int y=20;
		 //z=80 once it initialized cant be assigned
	}
	

}
