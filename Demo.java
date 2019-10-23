class Over{
	void test()
	{
		System.out.println("No Parameters..");
	}
	void test(int a)
	{
		double area;
		System.out.println("a is:"+a);
		area = 3.14*a*a;
		System.out.println("area of circle is:"+area);
		
	}
	void test(double a)
	{
		System.out.println("a is:"+a);
		System.out.println("area of square is:"+(a*a));
	}
	void test(int a,int b)
	{
		System.out.println("Values of a and b are "+a+" "+b);
		System.out.println("area of rectangle is:"+(a*b));
	}
} 
class Demo{
	public static void main(String args[])
	{
		Over o1 = new Over();
		o1.test();
		o1.test(10);
		o1.test(10.5);
		o1.test(5,7);
	}
}