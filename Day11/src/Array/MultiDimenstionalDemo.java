package Array;

class MLarray{
	static void printArrray(int c[][]) {
		System.out.println("array of element are as follow");
		for(int i=0;i<=c.length-1;i++) {
			for(int j=0;j<c[i].length-1;j++) {
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class MultiDimenstionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int c[][]= {{12,23},{10,20},{50,70},{56,76}};
          System.out.println("npo of row see in array:"+c.length);
          MLarray.printArrray(c);
	}

}
