import java.util.*;
class EmployeeDetail{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Name:");
		String a = s.next();
		System.out.print("Enter ID:");
		String id = s.next();
		System.out.print("Enter Age:");
		String age = s.next();
		System.out.print("Enter Salary:");
		String salary = s.next();
		System.out.println("Name is:"+ a);
		System.out.println("ID is:" +id);
		System.out.println("Age is:"+ age);
		System.out.println("Salary is:" +salary);	
	}

}		
	