package Day_four;

public class AccessSpecifier {
	
	//declare default ,private ,protected, and public variables
	
	int vardefault = 10;
	public int varpublic = 11;
	private int varPrivate = 12;
	protected int varProtected = 13;
	
	//declare default ,private ,protected, and public methods
	
	void Methoddefault() {
		System.out.println("default access base class");
		System.out.println("default variable: "+ vardefault);
	}
	public void methodPublic() {
		System.out.println("Public access base class");
		System.out.println("Public variable: "+varpublic);
	}
	private void methodPrivate() {
		System.out.println("Private access base class");
		System.out.println("Private Variable: "+varPrivate);
	}
	protected void methodProtected() {
		System.out.println("Protected access base class");
		System.out.println("Protected Variable: "+varProtected);
	}
}
