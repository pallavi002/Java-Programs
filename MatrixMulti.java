import java.util.*;
class MatrixMulti{
	public static void main(String args[])
	{
		int a[][]=new int[4][4];
		int b[][]=new int[4][4];
		int c[][]=new int[4][4];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Matrix Element:");
		for(int i=0;i <2 ;i++)
		{
			for(int j=0;j <2 ;j++)
			{
				 a[i][j] = s.nextInt();
			}
		}
		for(int i=0;i <2 ;i++)
		{
			for(int j=0;j <2 ;j++)
			{
				 b[i][j] = s.nextInt();
			}
		}
		for(int i=0;i <2 ;i++)
		{
			for(int j=0;j <2 ;j++)
			{
				c[i][j]=0;      
				for(int k=0;k<2;k++)      
				{      
					c[i][j]+=a[i][k]*b[k][j];      
				}
			}
		}
		for(int i=0;i <2 ;i++)
		{
			for(int j=0;j <2 ;j++)
			{
				System.out.println(+c[i][j]);
			}
		}


		
	}

}		
