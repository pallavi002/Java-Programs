class Staff{
	String code, name;
	void showinfo()
	{
		System.out.println("Code is:"+code);
		System.out.println("Name is:"+name);
	}
}
class Teacher extends Staff{
	String subject, experience;
	void showteachinfo()
	{
		System.out.println("Subject name is :"+subject);
		System.out.println("experience name is :"+experience);
	}
}
class Typist extends Staff{
	String speed, experience;
	void showtypistinfo()
	{
		System.out.println("Code is:"+code);
		System.out.println("Name is:"+name);
		System.out.println("Speed name is :"+speed);
		System.out.println("experience name is :"+experience);
	}
}
class Officer extends Staff{
	String grade, dept;
	void showofficerinfo()
	{
		System.out.println("Code is:"+code);
		System.out.println("Name is:"+name);
		System.out.println("Grade  is :"+grade);
		System.out.println("Department name is :"+dept);
	}
}
class Regular extends Teacher{
	String salary1;
	void showregularinfo()
	{
		System.out.println("Salary is:"+ salary1);
	}
}
class Visiting extends Teacher{
	String visitingHrs;
	void showvisitinginfo()
	{
		System.out.println("Visiting Hours are:"+ visitingHrs);
	}
}

class StaffInherit{
	public static void main(String args[])
	{
		Regular r = new Regular();
		Visiting v = new Visiting();
		Officer o = new Officer();
		v.visitingHrs = "2-3Hours";
		r.salary1 = "50K";
		r.code = "123A";
		r.name = "xyz";
		r.showinfo();
		r.subject = "OOP";
		r.experience = "5years";
		o.grade = "10";
		o.dept = "extc";
		r.showteachinfo();
		r.showinfo();
		r.showteachinfo();
		r.showregularinfo();
		v.showinfo();
		v.showteachinfo();
		v.showvisitinginfo();
	}
}