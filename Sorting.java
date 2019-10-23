class Sorting{
	public static void main(String args[])
	{
		int a[]={2,6,1,4,8},sum=0,temp;
		int i;
		int c=a.length;
        	for (i = 0; i < c; i++) 
        	{
            	for (int j = i + 1; j < c; j++) 
            		{
                	if (a[i] > a[j]) 
                		{
                    		temp = a[i];
                    		a[i] = a[j];
                    		a[j] = temp;
                		}
            		}
        	}
        	System.out.print("Ascending Order:");
        	for (i = 0; i < c ; i++) 
        	{
            		System.out.print(a[i] + ",");
		}
	}
}