class TestTryNew{
	public static void main(String args[])
	{
		try{
			int d=20/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero");
		//	System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}