package app8.oops.encapsulation;
class Book{
	private int pages;
	public void setData(int x) {
		if(x>0)
			pages=x;
	}
public int getData() {
	return pages;
}
}

public class Encapsulation_eg1 {

	public static void main(String[] args) 
	{
		Book b=new Book();
		// b.pages(100);
		b.setData(100);
		b.setData(-99);
		int m= b.getData();
		System.out.println("The number of pages " + m);

	}

}
