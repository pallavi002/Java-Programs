class Rect
{
	int length;
	int breadth;
	void getdata(int l,int b)
	{
	length = l;
	breadth = b;
	}
}
class RectArea{
	public static void main(String args[])
	{
		Rect r1 = new Rect();
		Rect r2 = new Rect();
		r1.length=10;
		r1.breadth=20;
		int area = r1.length * r1.breadth;
		r2.getdata(20,20);
		int area1 = r2.length * r2.breadth;
		System.out.println("Area of Rectangle is:" +area);
		System.out.println("Area of Rectangle is:" +area1);
	}
}

//Using Scanner Class
/*
import java.util.*;
class Rect
{
	int length;
	int breadth;
	void getdata(int l,int b)
	{
	length = l;
	breadth = b;
	}
}
class RectArea{
	public static void main(String args[])
	{
		Rect r1 = new Rect();
		Scanner s = new Scanner(System.in);
		r1.length=s.nextInt();
		r1.breadth=s.nextInt();
		int area = r1.length * r1.breadth;
		System.out.println("Area of Rectangle is:" +area);
	}
}
*/