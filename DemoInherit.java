class A{
	int a,b;
	void showab()
	{
		System.out.println("a and b are :"+a+ " " +b);
	}
}
class B extends A{
	int c;
	void showc()
	{
		System.out.println("value of c is :"+c);
	}
	void sum()
	{
		System.out.println("Sum is :"+(a+b+c));
	}
}
class DemoInherit{
	public static void main(String args[])
	{
		A p = new A();
		B q = new B();
		p.a = 5;
		p.b = 10;
		p.showab();
		q.a = 3;
		q.b = 5;
		q.c = 10;
		q.showab();
		q.showc();
		q.sum();
	}
}