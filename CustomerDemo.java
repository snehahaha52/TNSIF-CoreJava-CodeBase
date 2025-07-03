package Day_four;

import java.util.Scanner;

public class CustomerDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer id");
		int id =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Name");
		String Name =sc.nextLine();
		System.out.println("Enter Customer City");
		String city=sc.nextLine();
		
		Customer c1=new Customer();
		
		c1.setCustomerCity(city);
		c1.setCustomerId(id);
		c1.setCustomerName(Name);
		System.out.println(c1);
		
		Customer c2=new Customer (Name,id,city);
		System.out.println(c2);
		System.out.println(c2.getCustomerCity());
		System.out.println(c2.getCustomerId());
		System.out.println(c2.getCustomerName());
	}
}
