class Conversion{
	public static void main(String args[])
	{
		double f;
		f=Double.parseDouble(args[0]);
		double c=(f-32)*5/9;
		System.out.println("\n Temperature in celcius: "+ c);
	}
}