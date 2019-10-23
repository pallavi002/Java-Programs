class Square_Cube{
	public static void main(String args[])
	{
		int sq,c,n;
		n=Integer.parseInt(args[0]);
		sq=square(n);
		c=cube(n);
		System.out.println("\n Square is: "+ sq);
		System.out.println("\n Cube is: "+ c);
	}
	static int square(int n)
	{
		return n*n;
	}
	
	static int cube(int n)
	{
		return n*n*n;
	}
}