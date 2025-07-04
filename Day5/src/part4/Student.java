package part4;

public class Student extends Person {
	private String clas;
	private float percentage;
	  public Student() {
		  System.out.println("assign default");
		  clas="BE";
		  percentage=85f;
	  }
	  public Student(String clas, float percentage) {
		super();
		this.clas = clas;
		this.percentage = percentage;
	  }
	  public String getClas() {
		  return clas;
	  }
	  public void setClas(String clas) {
		  this.clas = clas;
	  }
	  public float getPercentage() {
		  return percentage;
	  }
	  public void setPercentage(float percentage) {
		  this.percentage = percentage;
	  }
	  @Override
	  public String toString() {
		return "Student [clas=" + clas + ", percentage=" + percentage + "]";
	  }
	  

}
