package Synchronization;

public class Account implements Bank {
          //data 
	      private int accNo;
	      private String name;
	      private double balance;
		  public int getAccNo() {
			  return accNo;
		  }
		  public void setAccNo(int accNo) {
			  this.accNo = accNo;
		  }
		  public String getName() {
			  return name;
		  }
		  public void setName(String name) {
			  this.name = name;
		  }
		  public double getBalance() {
			  return balance;
		  }
		  public void setBalance(double balance) {
			  this.balance = balance;
		  }
		  public Account(int accNo, String name, double balance) {
			
			this.accNo = accNo;
			this.name = name;
			this.balance = balance;
		  }
		  public Account() {
			
		  }
		  @Override
		  public String toString() {
			return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
		  }
		  public void deposit(int amt) throws DepositLimitException{
			  
		  }
	      
	      
}
