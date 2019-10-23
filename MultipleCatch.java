class MultipleCatch{
	public static void main(String args[])
	{
		{
			try{
				int a = args.length;
				System.out.println(a);
				int b = 12/a;
				int c[] = {1};
				c[34] = 12;
			}
			catch(ArithmeticException e)
			{
				System.out.println("divide by zero");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Index out of bound ");
			}
		}
		
	}
}