interface A{
	int x=10;
}
interface B{
	int x= 100;
}
class Interface1 implements A,B{
	public static void main(String args[]){
		System.out.println(A.x);
		System.out.println(B.x);
	}
}