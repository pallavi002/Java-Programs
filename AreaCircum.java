import java.util.*;
class AreaCircum{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		double pi=3.145;
		System.out.print("Enter Radius Of a Circle :");
		double r = s.nextDouble();
		double circum = 2*pi*r; 
		double area = pi*r*r; 
		System.out.println("Circumference is:" +circum);
		System.out.println("Area is:" +area);	
	}

}		
	