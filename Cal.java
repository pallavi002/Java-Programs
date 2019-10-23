import ABC.Op;
class Cal{
	public static void main(String arg[]) {
		int a , b;
		Op obj1 = new Op();
		int c = obj1.add(2 , 4);
		int d = obj1.multiply(5 , 2);
		
		System.out.println("Addition is : "+c);
		System.out.println("Multiplication is : "+d);
		
	}
}