package Daily_practice;

public class methodoverloding
{
	static int addition(int a, int b) {
		return a+b;
		
	}
	static double addition(double a,double b, int c)
	{
		return a+b+c;
	}
	

	public static void main(String[] args) {

		System.out.println(addition(34, 40));
		System.out.println(addition(13,34,34));
		System.out.println(addition(13.34,34.4,34));
		System.out.println(addition(13,34,34));
		
	}

}
