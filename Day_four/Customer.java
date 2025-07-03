package Day_four;

import java.util.Objects;

public class Customer 
{
		private String customerName;
		private int customerId;
		private String CustomerCity;
		
		//Default constructor		
		public Customer() 
		{
			System.out.println("Hello this is Default Constructor ........");
		}

		//Parameterized Constructor
		public Customer(String customerName, int customerId, String customercity) 
		{
			// this(); //calling default constomer
			
			System.out.println("Hello is this Para constructor");
			this.customerName = customerName;
			this.customerId = customerId;
			this.CustomerCity = customercity;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public String getCustomerCity() {
			return CustomerCity;
		}

		public void setCustomerCity(String customerCity) {
			CustomerCity = customerCity;
		}

		//to String
		@Override
		public String toString() {
			return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", CustomerCity="
					+ CustomerCity + "]";
		}

		
		
		
}