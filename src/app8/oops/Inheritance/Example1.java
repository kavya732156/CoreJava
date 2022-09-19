package app8.oops.Inheritance;

class Employee{
	String name="raj";
}
class Programmer extends Employee{
	float sal=1000;
}
public class Example1 {

	public static void main(String[] args) 
	{
		Programmer p=new Programmer();
		System.out.println(p.sal);
		System.out.println(p.name);

	}

}
