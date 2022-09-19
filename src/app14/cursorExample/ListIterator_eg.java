package app14.cursorExample;
import java.util.*;
public class ListIterator_eg {

	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add("java");
		l.add("python");
		l.add("C");
		l.add("c#");
		l.add("j2ee");
		System.out.println(l);  // [java, python, C, c#, j2ee]
		ListIterator litr=l.listIterator();
		while(litr.hasNext()) {
			String s=(String) litr.next();
			if(s.equals("java")) {
				litr.remove();
			}
			else if(s.equals("python")) {
				litr.add("php");
			}
			else if(s.equals("j2ee")) {
				litr.set("unix");
			}
		}
		System.out.println(l);

	}

}
