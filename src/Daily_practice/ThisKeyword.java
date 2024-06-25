package Daily_practice;

public class ThisKeyword 
{
	String m;
	ThisKeyword (String m){
		m=m;
	}
	void display() {
		this.one();
		System.out.println("selenium"+m);
	}
	void one () {
		System.out.println("hello");
	}

	public static void main(String[] args)
	{
		ThisKeyword t = new ThisKeyword("Moon");
         
		t.display();
		t.one();
	}

}
