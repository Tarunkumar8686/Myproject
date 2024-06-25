package Daily_practice;

class animal{
	void printA() {
		System.out.println("Animal is Running");
	}
}
class dog extends animal{
	void printD() {
		System.out.println("dog is barking");
	}
}
//class cat extends dog{
//	void printL() {
//		System.out.println("tom");
//	}
//}
class cat extends animal{
	void printL() {
		System.out.println("Cat says meow");
	}
}

public class inhertance {

	public static void main(String[] args) 
	{
		cat C = new cat();
		dog D = new dog();
		C.printA();
		C.printL();
		D.printD();
		D.printA();
	}

}
