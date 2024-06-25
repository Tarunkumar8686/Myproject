package Daily_practice;

class Final{
	 void fun() {
		System.out.println("hi");
	}
}
public class FinalKeyWord extends Final
{

	final int a=10;
	void fun() {
		System.out.println("hello");
	}
//	public static void main(String[] args) {
//      FinalKeyWord fw = new FinalKeyWord();
//      System.out.println(fw.a);
//	}
	void fun1() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		FinalKeyWord f = new FinalKeyWord();
		f.fun();
		
	}

}
