package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Deque<String> deque1=new ArrayDeque<String>();
        deque1.add("jiva");
        deque1.add("kiran");
        deque1.add("shreya");
        deque1.add("jiva");
        deque1.add("heti");
        
        System.out.println(deque1);
        
        deque1.pollLast();
        System.out.println(deque1);
        
        deque1.pollFirst();
        System.out.println(deque1);
        
        for(String str : deque1) {
        	System.out.println("queue is :"+str);
        }
        System.out.println(deque1);
	}

}
