package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
        	 //load or register driver
        	 Class.forName("com.mysql.cj.jdbc.Driver");
        	 System.out.println("driver is installed");
        	 
        	 //create connection
        	 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/dypatil","root","root");
        	 System.out.println("connection created");
        	 
        	 //create a statement
        	 Statement stmt=con.createStatement();
        	 
        	 
        	 System.out.println("ststement created successfully");
        	 
        	 //write a query
        	 //String q="create table student(stdid int,name varchar(12),subject varchar(10),duration double)";
        	 
        	 String q="insert into student values(101,'name','subject',90.09)";
        	 boolean s= stmt.execute(q);
           
        	 String q1="alter student table and primary key(stdid)";
        	 int s1= stmt.executeUpdate(q1);
 
         }
         catch(Exception e) {
        	 System.err.println(e);
         }
	}

}
