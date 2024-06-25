package package1;

public class New 
{
	 int i =10;
	public void print(String s) 
	{
	System.out.println(s);	
	}

	public static void main(String[] args) {

		New n = new New();
		n.print("Moon"); //method calling
		
		System.out.println(n.i);
	}

}
