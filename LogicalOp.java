class LogicalOp{
	public static void main(String args[])
	{
		boolean a=true,b=false;
		System.out.println("a \t b \t a^b \t a|b \t !a");
		System.out.println(b +"\t"+ b +"\t"+ (b&&b) +"\t"+ (b||b) +"\t"+ (!b) +"\t");
		System.out.println(b +"\t"+ a +"\t"+ (a&&b) +"\t"+ (a||b) +"\t"+ (!a) +"\t");
		System.out.println(a +"\t"+ b +"\t"+ (a&&b) +"\t"+ (a||b) +"\t"+ (!b) +"\t");
		System.out.println(a +"\t"+ a +"\t"+ (a&&a) +"\t"+ (a||a) +"\t"+ (!a) +"\t");
		
	}
}