package app13.CollectionExample;
// set insertion order is not preserved and duplicates are allowed
import java.util.*;

public class Set_Example1 {

	public static void main(String[] args) 
	{
		// Hash set methods
		
		HashSet h=new HashSet();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		System.out.println(h); // [20, 40, 10, 30]
		
		// linkedhash set methods
		LinkedHashSet l=new LinkedHashSet();
		l.add("java");
		l.add("python");
		l.add("j2ee");
		l.add("C");
		l.add("C#");
		l.add(null); // this null insertion is possible inside LinkedList
		l.addAll(l);
		System.out.println(l); // [java, python, j2ee, C, C#, null]
		
		
	}

}
