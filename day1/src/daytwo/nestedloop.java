package daytwo;

public class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=10,b=20,c=10;
         
         System.out.println("the largest no:");
         
         if(a>b){
        	 if(a>c) {
        		 System.out.println(a);
        	 }
        	 else {
        		 System.out.println(c);
        	 }
         }
         else {
        	 if(b>c) {
        		 System.out.println(b);
        	 }
        	 else {
        		 System.out.println(c);
        	 }
         }
	}

}
