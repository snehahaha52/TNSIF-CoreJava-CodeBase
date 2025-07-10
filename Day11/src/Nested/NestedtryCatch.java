package Nested;

import java.lang.invoke.StringConcatException;

public class NestedtryCatch {
           public static void check() {
        	   String str="TNS";
        	   int slength=str.length(); //int s.l=3
        	   System.out.println("String length:"+slength);
        	   
        	   String anotherString =null;
        	    int y=6;
        	    
        	    try
        	    {
        	    	//inner try block
        	    	try {
        	    		System.out.println(str.charAt(y));
        	    	}
        	    	catch(StringIndexOutOfBoundsException e)
        	    	{
        	    		System.err.println(e.getMessage());
        	    	}
        	    	System.out.println("String length:"+anotherString);
        	    }
        	    catch(NullPointerException e) {
        	        System.err.println(e.getMessage());
        	    }
           }
            
}
