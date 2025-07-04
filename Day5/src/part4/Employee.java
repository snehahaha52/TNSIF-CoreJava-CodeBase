package part4;

public class Employee extends Person {
     private int employeeId;
     private float salary;
     private String department;
     
	 public Employee() {
		System.out.println("default");
		employeeId=101;
		salary=23456f;
		department="it";
	 }

	 public Employee(int employeeId, float salary, String department) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
		this.department = department;
	 }

	 public int getEmployeeId() {
		 return employeeId;
	 }

	 public void setEmployeeId(int employeeId) {
		 this.employeeId = employeeId;
	 }

	 public float getSalary() {
		 return salary;
	 }

	 public void setSalary(float salary) {
		 this.salary = salary;
	 }

	 public String getDepartment() {
		 return department;
	 }

	 public void setDepartment(String department) {
		 this.department = department;
	 }

	 @Override
	 public String toString() {
		return "Employee [employeeId=" + employeeId + ", salary=" + salary + ", department=" + department + "]";
	 }
	 
     
     
     }
