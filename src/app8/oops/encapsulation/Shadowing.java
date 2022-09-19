package app8.oops.encapsulation;
// showding means the name clash will occur  thus it prints the default values 
//  To resolve this showding probelm this vriable is used 
class Student{
	String name;
	int age;
	float height;
	void setData(String name,int age,float height) {
		/* name=name; // null
		age=age; // 0
		height=height; //0.0 */
		this.name=name; // raja
		this.age=age; // 18
		this.height=height; //5.2
	}	
}
public class Shadowing {

	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.setData("raja", 18, 5.2f);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);
	}

}
