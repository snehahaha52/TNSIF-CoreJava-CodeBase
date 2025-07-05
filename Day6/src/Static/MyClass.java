package Static;

public class MyClass {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
        //static used to memory management
		//features of static method
		//static method,static variable ,static block{ consider as block}
		//static compile first
		
		
	}*/
	private int section;//non static var
	private static int srNo;//static or class var
	
	//static block
	static
	{
		System.out.println("-----within static-----");
		srNo=1000;
		
	}
	

	//default constructor(it accept everyone including non static and static)
	public MyClass() {
		System.out.println("-------with in default-----");
		srNo++;
		section++;
	}


	@Override
	public String toString() {
		return "MyClass [serial No "+srNo+",section=" + section + "]";
	}
	
	//static method
	
	static void display() {
		//System.out.println("Section :"+section);
		System.out.println("Serial No:"+srNo);
	}

}
