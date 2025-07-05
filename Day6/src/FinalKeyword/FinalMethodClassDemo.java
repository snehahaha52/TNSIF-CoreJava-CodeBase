package FinalKeyword;


final class FinalClass{
	void show() {
		System.out.println(" final classcant be inherited");
	}
}
//class Student extends FinalClass{
	
//}
public class FinalMethodClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       FinalClass f= new FinalClass();
       f.show();
	}

}
