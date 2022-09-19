package app13.CollectionExample;

import java.util.*;

public class List_Example1 {

	public static void main(String[] args) 
	{ 
		// ArrayList methods
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(0, "raja");
		System.out.println(l); // raja, 10, 20, 30]
		System.out.println(l.get(0)); // raja
		System.out.println(l.remove(0)); // raja
		System.out.println(l.set(0, "kavya"));  //10 replaces with kavya
		System.out.println(l); //[kavya, 20, 30

		System.out.println(l.indexOf(20)); // 1
		System.out.println(l.lastIndexOf(30)); //2
		
		// LinkedList methods 
		LinkedList a=new LinkedList();
		a.add("abc");
		a.add(70);
		a.addAll(0, l);
		System.out.println(a); // [kavya, 20, 30, abc, 70]
		a.addFirst(11);
		a.addFirst(60);
		a.addLast(100);
		System.out.println(a); // [60, 11, kavya, 20, 30, abc, 70, 100]
		System.out.println(a.getFirst()); //60
		System.out.println(a.getLast()); //100
		System.out.println(a.removeFirst()); //60
		System.out.println(a.removeLast()); //100
		
		// vector class methods
		Vector v= new Vector();
		v.add(0, "xyz");
		v.addAll(0, a);
		System.out.println(v); // [11, kavya, 20, 30, abc, 70, xyz]
		
		// Stack methods
		Stack s=new Stack();
		s.addAll(v);
		s.push("krishna");
		s.push("rama");
		System.out.println(s); // [11, kavya, 20, 30, abc, 70, xyz, krishna, rama]
		System.out.println(s.pop()); // rama removed
		System.out.println(s.search(30)); // 5
		System.out.println(s); // [11, kavya, 20, 30, abc, 70, xyz, krishna]
		System.out.println(s.peek()); // krishna returns last element
		

	}

}
