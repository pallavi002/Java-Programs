class Reversenum
{
	public static void main(String args[])
	{
		int n,r=0;
		n=Integer.parseInt(args[0]);
		while(n != 0)
		{
			r = r*10 + n%10;
			n= n/10;
		
		}
		System.out.println(r);
	}
}
