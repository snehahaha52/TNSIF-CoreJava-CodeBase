package Array;

public class Student {
            private int rollno;
            private String name;
            
            //para constructor
			public Student(int rollno, String name) {
				super();
				this.rollno = rollno;
				this.name = name;
			}
			
			//getter and setter
			public int getRollno() {
				return rollno;
			}
			public void setRollno(int rollno) {
				this.rollno = rollno;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
            
            
            
}
