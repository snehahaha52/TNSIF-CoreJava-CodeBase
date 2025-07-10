package Exception;

import java.util.Scanner;

public class UsingThrow {
	
	private static final Throwable e = null;

	static int acceptNumber()
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.close();
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int per;
        System.out.println("enter your percentage ......");
        
        per=acceptNumber();
        try {
        	if (per<0) 
        		throw new negativeException ();
        	else if(per>100)
        		throw new greatervalueException();
        	else System.out.println("valid percentage");
        }
        catch(negativeException|greatervalueException e) {}
        System.err.println("Error.." + e.getMessage());
	}

}
