package Array;

public class ArrayObjectDemo {
     public static void main(String args[]) {
       
     //Student s= ne
     Student[] arr;
     arr=new Student[5];
     arr[0]=new Student(101,"sneha");
     arr[1]=new Student(102,"neha");
     arr[2]=new Student(103,"priya");
     arr[3]=new Student(104,"urvashi");
     arr[4]=new Student(105,"veda");
     
     for(int i=0;i<=arr.length;i++)
     {
    	 System.out.println("element at"+i+":"+arr[i].getRollno()+"\t"+arr[i].getName());
     }
     
     
     }
}
