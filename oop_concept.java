package Day_four;

public class oop_concept {
	private int serialNum;
	private String Num;
	private int age;
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getNum() {
		return Num;
	}
	public void setNum(String num) {
		Num = num;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//to string 
	@Override
	public String toString() {
		return "oop_concept [serialNum=" + serialNum + ", Num=" + Num + ", age=" + age + "]";
	}
	
	public oop_concept() {
//		System.out.println("Default Constructor");
	}
	public oop_concept(int serialNum, String num, int age) {
		this.serialNum = serialNum;
		this.Num = num;
		this.age = age;
	}
	
}
