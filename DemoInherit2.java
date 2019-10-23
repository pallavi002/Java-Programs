class A{
	int a;
	void showa()
	{
		System.out.println("a is:"+a);
	}
}
class B extends A{
	int f;
	int fact()
	{
		f=1;
		for(int i=1;i<=a;i++)
		{
			f = f*i;
		}
	//System.out.println("Factorial is :" +f);
	return f;
	}
}
class C extends B{
	int c;
	void showc()
	{
		System.out.println("Factorial is :" +f);
	}
}
class DemoInherit2{
	public static void main(String args[])
	{
		//A p = new A();
		C q = new C();
		q.a = 5;
		q.showa();
		q.fact();
		q.showc();
	
	}
}