package app13.CollectionExample;
import java.util.*;
public class Map_Example {

	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(1, "java");
		h.put(2, "C");
		h.put(3, "C++");
		h.put(4, "python");
		h.put(null, "j2ee");
		h.put(5, "unix");
		System.out.println(h); // {null=j2ee, 1=java, 2=C, 3=C++, 4=python, 5=unix}
		
		//map methods
		System.out.println(h.get(4)); //python
		System.out.println(h.remove(null));  //j2ee
		System.out.println(h.containsKey(3)); // true
		System.out.println(h.containsValue("j2ee")); // false
		System.out.println(h.isEmpty());  // false
		System.out.println(h.size()); // 5
		System.out.println(h.keySet()); // [1, 2, 3, 4, 5]
		System.out.println(h.values()); // [java, C, C++, python, unix]
		System.out.println(h.entrySet()); // [1=java, 2=C, 3=C++, 4=python, 5=unix]
		// h.clear();
		// System.out.println(h); // { }
		
		// linked hashmap 
		
		LinkedHashMap lh=new LinkedHashMap();
		lh.put(0, "raj");
		lh.put(10,"krishna");
		System.out.println(lh); // {0=raj, 10=krishna}
		lh.putAll(h);
		System.out.println(lh); // {0=raj, 10=krishna, 1=java, 2=C, 3=C++, 4=python, 5=unix}
		
		
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(90);
		a.add(56);
		a.add(80);
		a.add(10);
		a.add(28);
		a.add(45);
		a.add(70);
		System.out.println(a); // [10, 90, 56, 80, 10, 28, 45, 70]
		
		// // sorted set  interface methods implementation in treeset
		
		TreeSet t =new TreeSet();
		t.add(100);
		t.add(200);
		t.addAll(a); 
		System.out.println(t); // [10, 28, 45, 56, 70, 80, 90, 100, 200]
		System.out.println(t.first()); // 10
		System.out.println(t.last());  // 200
		System.out.println(t.headSet(20));  // 10
		System.out.println(t.tailSet(60)); // [70, 80, 90, 100, 200]
		System.out.println(t.subSet(30, 90)); // [45, 56, 70, 80]
		
		
		//  navigable set interface methods implementation in treeset
		
		System.out.println(t.lower(80)); //70
		System.out.println(t.higher(100)); //200
		System.out.println(t.floor(30)); //20
		System.out.println(t.ceiling(200)); //200
		System.out.println(t.headSet(100, true));  // [10, 28, 45, 56, 70, 80, 90, 100]
		System.out.println(t.tailSet(100, false)); // [200]
		System.out.println(t.subSet(20, true, 100, false)); // [28, 45, 56, 70, 80, 90]
		
		
		// hashtable
		
		Hashtable ht=new Hashtable();
		ht.put(100, 10);
		ht.putAll(lh);
		System.out.println(ht); // {10=krishna, 5=unix, 4=python, 3=C++, 2=C, 1=java, 100=10, 0=raj}
		System.out.println(h.get(4));  // python
		ht.put(3, "kavya");
		ht.put(4, "jan");
		System.out.println(ht); // {10=krishna, 5=unix, 4=python, 3=C++, 2=C, 1=java, 100=10, 0=raj}
		System.out.println(ht.get(4));  // jan
		System.out.println(ht.remove(4)); // jan 
		
	} 

}
