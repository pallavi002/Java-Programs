class Student
{
	String name;
	int roll;
	int age;
	void getdata(String n,int r,int a)
	{
	name=n;
	roll=r;
	age=a;
	}
}
class StudentDetail{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.name = "Pallavi";
		s1.roll = 54;
		s1.age = 18;
		System.out.println("Name is:" +s1.name);
		System.out.println("Roll no. is:" +s1.roll);
		System.out.println("Age is:" +s1.age);
	}
}
	