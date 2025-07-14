package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Queue<Integer> r=new LinkedList<Integer>();
         r.add(6);
         r.add(8);
         r.add(56);
         r.add(5);
         
         System.out.println(r);
         
         int positionpeek=r.peek();
         System.out.println("using elemnts first value");
         
         System.out.println();
         System.out.println(r.remove());
         System.out.println(r);
         
         Iterator itr=r.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next()+"\t");
         }
         System.out.println();
         System.out.println(r.poll());
         System.out.println(r);
         }

}
