package day3;

public class loops {

	public static void main(String[] args) {
		
		//while
		int i=1;//user value/user input
		
		while(i<=100)
		{
			System.out.println(i);
			i++;
		}
		
		//do while
		int i1=8;
		do {
			System.out.println(i1);
			i1++;
		}
		while(i1<=10);
		
		//for each
		int a[]= {10,20,30,40,50};
		//for integer array
		for(int i11:a) {
			System.out.print(i11+ "  ");
		}
		
		
        
	}

}
