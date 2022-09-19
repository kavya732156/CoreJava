package app1.static_method;

import java.util.*;

class Former
{
	float p,t,si;
	static float r; // this r is common for all the former  so we make that as static
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Principle ammount");
		p=sc.nextFloat();
		System.out.println("Enter time ");
		t=sc.nextFloat();
	}
	static {
		r=2.5f;
	}
	public void calSI() {
		si=p*t*r/100;
	}
	void disp() {
		System.out.println("the simple intrest =" + si);
	}
	
}
public class Static_AplicatioN_eg {

	public static void main(String[] args) 
	{
		Former f1,f2;
		f1=new Former();
		f1.input();
		f1.calSI();
		f1.disp();
		f2=new Former();
		f2.input();
		f2.calSI();
		f2.disp();
		

	}

}
