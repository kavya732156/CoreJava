package app8.oops.Inheritance;
class One{
	int i;
}
class Two extends One{
	int i;
	void setData(int x,int y) {
		super.i=x;
		i=y;
	}
	void disp() {
		System.out.println("A 's i=" + super.i);
		System.out.println("B 's i=" + i);
	}
}
public class Super_eg {

	public static void main(String[] args) 
	{
		Two b=new Two();
		b.setData(10, 20);
		b.disp();
	}
}
