class Prime{
	public static void main(String args[])
	{
		int n,i,f=0,m;
		n=Integer.parseInt(args[0]);
		for(i=2;i<n;i++)
		{
			m=n%i;
			if(m==0)
			{
				f++;
			}
		}
		if(f==1)
		System.out.println("\n No is not prime ");
		else
		System.out.println("\n No is prime ");
	}
}