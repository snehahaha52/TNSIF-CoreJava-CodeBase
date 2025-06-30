package daytwo;

public class variable {

	public static void main(String[] args) {
		//variable declaration - invalid identifier ex
		
		//int for=13; error becaz we can not use keyword to declare variable
		
		//int num 1=13; error becaz of space
		
		//int @num=13; special are not allowed only $ and _ is allowed
		
		//valid identifier 
		
		int $num1 =20;
		
		String StudentName="sneha";
		
		int FOR=12;
		System.out.println("value of the variable number is"+ $num1 );
		System.out.println("name of student is"+ StudentName );
		
		//datatype 
		// primitive and non primitive which are used to store any of the data 
		//are declare by sun microsysytem but primitive have fixed range
		long num = 12334567890098765L;
		System.out.println("value of the variable number is"+ num);
		
		/*primitive
		1.integer       range
		 -byte(1)       -128 to 127(0 -256) =1 byte=8 bits =2^8 =256
		 -short(2)                          = 2 byte 16 bits =2^16 =
		 -int(4)
		 -long(8)
		2.float(4)
		  -double(8)
		3.char(2)
		4.boolean(1 bit)atleast memory*/
		
		byte byteMax =127;
		byte byteMin =-128;
		System.out.println("min range of byte is" + byteMin + "max range of byte is" +byteMax);
		
		short shortMax=32767;
		short shortMin=-32768;
		System.out.println("min range of short is" + shortMin + "max range of short is" +shortMax);
		
		int maxInt=2147483647;
		int minInt=-2147483647;
		System.out.println("min range of int is" + minInt + "max range of int is" +maxInt);
		
		long maxLong=9223372036854775807L;
		long minLong=-9223372036854775807L;
		System.out.println("min range of long is" + minLong + "max range of long is" +maxLong);
		
		float f=3234.14124327845f;
		double d=3456.14124512345678902345678914f;
		System.out.println("min range of float is" + f + "max range of double is" +d);
		
		boolean flag=true;
		boolean flag2=false;
		System.out.println("min range of boolean is" + flag + "max range of flag2 is" +flag2);
		
		int value = 9/2;
		System.out.println(value);
		
		float value1 =101f/61f;
		System.out.println(value1);
		
		double value2 =10d/6d;
		System.out.println(value2);
		
		int radius =10;
		double percentage =3.14 * radius * radius;
		System.out.println("Area of circle : " +percentage);
		
		char value3='a';//at a time take only one alpha
		System.out.println(value3);
		
		//assinging num to char 
		char value4=65;
		System.out.println(value4);
		
		int name='a';
		System.out.println(name);
		
		//assinging unique code to char
		
	   char var1='\u00A7';
	   System.out.println(var1);
	   //type casting (converstion of data 1 type to another)
	   //  widening(small - big(Implicit))
	   byte b=10;
	   int i=b;
	   System.out.println(i);
	   
	   float f1=22.14f;
	   double d1=f;
	   System.out.println(d1);
	   
	   //data narrowing(big - small(explicit forcefully))data loss
	   double f2=10.52f;
	   
	   long l1=(long) f2;
	   System.out.println(l1);
	   
	   long l2=8668525992L;
	   int il2=(int) l2;
	   System.out.println(il2);
	   
	   short a= 130;
	   byte b1=(byte) a;
	   System.out.println(b1);
	   
	   //byte=-128 to 127
	   //byte=130-128
	   
	   //operaters (to perform different type of operations)
  	   //unary operator
	   //increment operator(++)
        //-post increment(a++)       -pre increment(++a)	 
	   
		
		
	}

}
