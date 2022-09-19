package app6.string;

public class String_Classes {

	public static void main(String[] args) 
	{
		String s1="Raja Ram Mohan Roy";
		String s2="rama";
		String s3="Rama";
		String s4=new String("rama");
		System.out.println(s1.length()); //18
		System.out.println(s1.toUpperCase());  // RAJA RAM MOHAN ROY
		System.out.println(s1.toLowerCase()); //raja ram mohan roy
		
		String[] a=(s1.split(" "));
		for(String arr:a)
			System.out.println(arr); // Raja Ram Mohan Roy splits in separate line
		
		System.out.println(s1.startsWith("R")); // true
		System.out.println(s1.startsWith("a")); // false
		System.out.println(s1.endsWith("y")); // true
		System.out.println(s1.endsWith("u")); // false
		
		System.out.println(s1.substring(8)); //  Mohan Roy
		System.out.println(s1.substring(0, 4)); // Raja
		
		System.out.println(s1.charAt(1)); //a
		System.out.println(s1.indexOf("j"));  //2
		System.out.println(s1.lastIndexOf("R")); //15
		
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		String s5=s4.intern();
		if(s5==s2) {
			System.out.println("refering same address");
		}
		else
		{
			System.out.println(" not refering same address");
		}
	}
}
