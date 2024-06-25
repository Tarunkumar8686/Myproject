package OOPS_Concepts;

public class Student 
{
	String name;
	int year;
	
	void check() {
		System.out.println("hello world");
	}
	

public static void main(String[] args)
{
	
	Student s = new Student();
	s.name="tarun";
	s.year=2001;
	
	
	System.out.println(s.name);
	
}
}