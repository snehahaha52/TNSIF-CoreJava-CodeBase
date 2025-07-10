package ExceptionHandling;

public class TryCatchExample {
          private static String getMessage;

		  static void performDivision(int x,int y) {
        	  System.out.println("i am in method");
        	  try {
        		  System.out.println("i am in try block");
        	      int z=x/y;
        	      System.out.println("result of z:"+z);
        	  }
        	  catch(ArithmeticException e)//object creation if only error occurs
        	  {
        		 System.err.println("i am in catch block:" +getMessage);
        	  }
          }
}
