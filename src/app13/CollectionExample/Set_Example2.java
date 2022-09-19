package app13.CollectionExample;

import java.util.TreeSet;

public class Set_Example2 {

	public static void main(String[] args) {
		// sorted set , navigable set are interface  and its methods are defined inside tree set
		
				TreeSet t=new TreeSet();
				t.add(10);
				t.add(40);
				t.add(20);
				t.add(30);
				t.add(60);
				t.add(50);
				System.out.println(t); // [10, 20, 30, 40, 50, 60]
				
				//t.add(null); // null insertion is not possbile in treeset
				
				// sorted set methods 
				System.out.println(t.first()); // 10
				System.out.println(t.last()); // 60
				System.out.println(t.headSet(50)); // < than value10 20 30 40 
				System.out.println(t.tailSet(30)); // >= 30,40 50 60
				System.out.println(t.subSet(20, 60)); // [20, 30, 40, 50]
				
				// navigable set interface methods 
				
				System.out.println(t.lower(30)); //20
				System.out.println(t.higher(30)); // 40
				System.out.println(t.floor(30)); //30
				System.out.println(t.ceiling(40)); //40
				System.out.println(t.headSet(50, true)); // < bool  10 20 30 40 50
				System.out.println(t.tailSet(30, false)); // >= bool 40 50 60
				System.out.println(t.subSet(20, false, 60, true)); // [30, 40, 50, 60]
				
				
		}

}
