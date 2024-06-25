package Daily_practice;

class Device{
	void display()
	{
		System.out.println("im a electronic device");
	}
}
class Tv extends Device
{
	void display1()
	{
		System.out.println("im a tv");
	}
	
}
public class SuperClass {

	
	public static void main(String[] args) {
        
		Tv t = new Tv();
		t.display();
		t.display1();
	}

}
