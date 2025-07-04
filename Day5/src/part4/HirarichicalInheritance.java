package part4;

public class HirarichicalInheritance {

	public static void main(String[] args) {
		
		Person p1=new Person();
		System.out.println(".....person detail.....");
		System.out.println(p1);
		
		//dynamic bindind-reference of parent by using 
		//Student s=new Student();
		//System.out.println("");
		
		Person p;
		p=new Person("sneha","pune");
		System.out.println("person detail"+p);
		
		p=new Student("sy",80f);
		System.out.println("student detail"+p);
		
		p=new Employee(101,80888f,"hr");
		System.out.println("employee detail"+p);
		
		Student s;
        
	}

}
