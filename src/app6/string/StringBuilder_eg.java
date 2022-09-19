package app6.string;

public class StringBuilder_eg {

	public static void main(String[] args) 
	{
		String city="Bangalore";
		StringBuffer sb=new StringBuffer(city);
		System.out.println(sb);
		String s1=sb.substring(3);
		System.out.println(s1);
	}

}
