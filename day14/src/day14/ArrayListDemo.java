package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          List list =new ArrayList();//dynamic binding
          
          System.out.println(list.isEmpty());
          list.add(10);
          list.add(20);
          list.add("Sneha");
          list.add("heti");
          list.add(true);
          list.add(false);
          list.add(20);
          list.add(23.45f);
          list.add(10);
          
          System.out.println("list is"+list);
          
          System.out.println(list.isEmpty());
          
          System.out.println(list.size());
          
          System.out.println(list.contains(1));
          
          list.remove(false);
          System.out.println(list);
          
          list.remove(2);
          System.out.println(list);
          
          System.out.println(list.remove(list.lastIndexOf(20)));
          System.out.println(list);
          
          System.out.println(list.indexOf(20));
          
          list.clear();
          System.out.println(list);
          
          System.out.println("-----------------------------------");
          
          //generics()
          
          List<String> names=new ArrayList<String>();
          names.add("heti");
          names.add("Sneha");
          names.add("priya");
          names.add("rushi");
          names.add("priya");
          names.add("veda");
          
          System.out.println(names);
          
          Collections.reverse(names);
          System.out.println(names);
          System.out.println(names.contains("yuga"));
          
          Collections.sort(names);
          System.out.println(names);
          
          Collections.reverse(names);
          System.out.println(names);
          
          //Traversing in a list 
          Iterator<String> i=names.iterator();
          while(i.hasNext()) {
        	  String nm=i.next();
        	  System.out.println(nm+" ");
          }
          System.out.println();
          System.out.println(names);
          
          ListIterator<String> li=names.listIterator(names.size());
          
          while(li.hasPrevious()) {
        	  String nm=li.previous();
        	  System.out.println(nm);
          }
          
	}

}
