package FREEPRACTICE;

public class bikes 

{
	
	public void abc() {
		System.out.println("abc method");
	}
	public int asdf()
	{
		System.out.println("asdf method");
		
		int i = 10; 
		int j =20;
		int k =i+j;
		return k;
	}
	
	public String qwer(String s, String y)
	{
		String j =s+y;
		return y;
		
	}
	
	
	public static void main(String[] args)
	{
	
		bikes b = new bikes();
		b.abc();
		int i =b.asdf();
		System.out.println(i);
		
		String s = b.qwer("Tarun","kumar");
		System.out.println(s);
	}
	
}
