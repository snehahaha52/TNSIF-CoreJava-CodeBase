package FinalKeyword;

public class FinalMethodClass {
        public FinalMethodClass() {
        	System.out.println("these is default constructor");
        }
        
        final int a=50;
        
        //final method
         void show() {
        	System.out.println("value of a:"+a);
        }
}
