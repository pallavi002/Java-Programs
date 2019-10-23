import java.util.Scanner;
class Accept{
public static void main(String args[])
{
	String s1,s2;
	Scanner s = new Scanner(System.in);
	s1 = s.next();
	s2 = s.next();
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s2.length());
	System.out.println(s1.concat(s2));
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.charAt(3));
	System.out.println(s1.indexOf('h'));
	System.out.println(s1.replace('h' , 'i'));
	System.out.println(s1.trim());
	System.out.println(s1.substring(3,6));
	System.out.println(s1.equals(s2));
}
}