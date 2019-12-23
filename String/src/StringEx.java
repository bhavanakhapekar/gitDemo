
public class StringEx {
	
	public static void main(String[] args) {
		
		String s1="ABC";
		String s2=new String("AAA");
		String s4=new String("AAA");
		String s6="ABC";
		String s5="CCCS";
		
		s1=s1.concat("DEF");
		System.out.println(s1);
		//System.out.println(s1.toLowerCase());
		
		
		
	String 	s3=s1.toLowerCase();
	System.out.println(s3);
	/*
	int a=2,b=3,c=0;
	c=a+b;
	System.out.println(c);
	
	System.out.println(a+b);*/
	
	
		System.out.println(s1==s2);
		System.out.println(s4==s2);
		System.out.println(s1==s6);
		System.out.println(s2.equals(s4));
		System.out.println(s2.compareTo(s4));
	}

}
