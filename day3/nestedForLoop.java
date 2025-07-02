package day3;

/*public class nestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int beg=5;
        int end=20;
        
        for(int i=beg; i<=end;i++) {
        	for(int j=1; j<=10; j++) {
        		System.out.println(i + "*" + j+ "=" + i*j);
        	}
        	System.out.println();*/
        	
        	public class nestedForLoop {
        	    public static void main(String[] args) {
        	        int rows = 5;

        	        for (int i = 1; i <= rows; i++) { 
        	        	for (int j = 1; j <= rows - i; j++) {
        	                System.out.print(" "); 
        	            }

        	            for (int j = 1; j <= (2 * i - 1); j++) { 
        	                
        	                if (j == 1 || j == (2 * i - 1) || i == rows) {
        	                    System.out.print("*");
        	                } else {
        	                    System.out.print(" ");
        	                }
        	            }

        	            System.out.println(); 
        	        }
        	    }
        	

        
	}


