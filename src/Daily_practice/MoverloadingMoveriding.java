package Daily_practice;
class Animals{
	static void run1() {
		System.out.println("Animal is running");
	}
	void run2() {
		System.out.println("o --Animal is running");
	}
}
class Cheetah extends Animals{
	static void run1() {
		System.out.println("cheetah runs fast");
	}
	void run2() {
		System.out.println(" o---- Cheetah runs fastly");
	}
}
public class MoverloadingMoveriding 
{

	public static void main(String[] args) 
	{
             
		Animals a= new Cheetah();
		a.run1();
		a.run2();
		Cheetah b = new Cheetah();
		b.run1();
		b.run2();
	}
	

}
