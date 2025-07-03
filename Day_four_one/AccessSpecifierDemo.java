package Day_four_one;

import Day_four.AccessSpecifier;

public class AccessSpecifierDemo {

	public static void main(String[] args) {
		// Accessing Different package class
		
		AccessSpecifier a =new  AccessSpecifier();
		a.methodPublic();
		a.varpublic=123;
		a.methodPublic();

	}

}
