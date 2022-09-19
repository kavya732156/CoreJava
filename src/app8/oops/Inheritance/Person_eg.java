package app8.oops.Inheritance;

class Person{
	String name;
	int id;
	public Person(int id, String name) {
		this.name=name;
		this.id=id;
	}
}
class Emp extends Person
{
	float sal;
	Emp(int id,String name, float sal){
		super(id,name);
		this.sal=sal;
	}
	void display() {
		System.out.println(id + " " + name +" " + sal);
	}
	
}
public class Person_eg {

	public static void main(String[] args)
	{
		Emp e1=new Emp(1,"raj" , 25000);
		e1.display();
		

	}

}
